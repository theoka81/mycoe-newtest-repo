package com.scm.service.common;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Strings;
import com.scm.dao.domain.NextNumberByTransactionType;
import com.scm.dao.domain.SystemUser;
import com.scm.keys.MessengerKeys;

@Service("nextNumberEngine")
public class NextNumberEngine extends BaseUIservice {

	@Transactional("transactionManager")
	public long nextNumber(long transactionTypeId, String transactionType, Long loggedInUserId) throws Throwable {

		long nextNumber = 0l;
		try {
			NextNumberByTransactionType nextNumGen = daoManager.getNextNumberByTransactionTypeDao()
					.getNextNumberByTransactionType(transactionTypeId, transactionType);

			if (nextNumGen == null) {
				nextNumber = 1l;
				String tableName = "";
				switch (transactionType) {
				case "AddContract":
					tableName = "ContractMaster";
					break;
				case "AddSupply":
					tableName = "SupplierMaster";
					break;
				case "AddInventory":
					tableName = "AddInvetory";
					break;
				}

				nextNumGen = new NextNumberByTransactionType();
				nextNumGen.setTransactionTypeId(transactionTypeId);
				nextNumGen.setTransactionType(transactionType);
				nextNumGen.setNextNumber(nextNumber + "");
				nextNumGen.setTableName(tableName);

				nextNumGen.setIsActive(true);
				nextNumGen.setIsDeleted(false);
				nextNumGen.setIsLocked(false);
				Date date = new Date();
				Timestamp ts = new Timestamp(date.getTime());
				nextNumGen.setCreatedDateTime(ts);

				SystemUser sysUser = new SystemUser();
				sysUser.setId(loggedInUserId);

				nextNumGen.setSystemUser1(sysUser);

				daoManager.getNextNumberByTransactionTypeDao().save(nextNumGen);
			} else {
				nextNumber = (Long.parseLong(nextNumGen.getNextNumber()));
				nextNumber = nextNumber++;
				nextNumGen.setNextNumber(nextNumber + "");
				Date date = new Date();
				Timestamp ts = new Timestamp(date.getTime());
				nextNumGen.setModifiedDateTime(ts);

				SystemUser sysUser = new SystemUser();
				sysUser.setId(loggedInUserId);

				nextNumGen.setSystemUser2(sysUser);
				daoManager.getNextNumberByTransactionTypeDao().save(nextNumGen);
			}
		} catch (Throwable th) {
			th.printStackTrace();
			throw th;
		}

		return nextNumber;
	}

	@Transactional("transactionManager")
	public String GenerateNextNumber(String module, String company) throws Throwable {
		String generatedNumber = "";
		switch (module) {
		case MessengerKeys.SupplierModule:
			generatedNumber = generateSupplierNumber(company);
			break;
		case MessengerKeys.CommodityModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.ContractModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.SupplierRotationModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.MarketDevlopmentModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.ContractStandardsModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;

		case MessengerKeys.StandardAgreementModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.PriceBenchmarkModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.ContractNegotiations:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.ServiceRequestModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		case MessengerKeys.InstructionToPerformWorkModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;

		case MessengerKeys.CommodityMasterAgreementModule:
			generatedNumber = NumberPrefix(NumberIncrement(module), module, "");
			break;
		default:
			break;
		}
		return generatedNumber;
	}

	public String generateSupplierNumber(String companyName) throws Throwable {
		try {
			String retval = "";
			String delimiter = " ";
			List<String> list = Arrays.asList(companyName.split(delimiter)); // StringSplitOptions.RemoveEmptyEntries
			Long index = 0l;
			String prefix = "";

			int i = 0;
			i = list.indexOf("PTY");
			if (i > 0)
				list.remove(i);
			i = list.indexOf("LTD");
			if (i > 0)
				list.remove(i);
			i = list.indexOf("CC");
			if (i > 0)
				list.remove(i);
			i = list.indexOf("(PTY)");
			if (i > 0)
				list.remove(i);
			i = list.indexOf("(PTY)LTD");
			if (i > 0)
				list.remove(i);
			i = list.indexOf("PTYLTD");
			if (i > 0)
				list.remove(i);

			// TODO: JK.20210505 - Need to improve, does not satisfy all combinations.
			if ((list.get(0).trim()).length() >= 3) {
				retval = (list.get(0).trim()).substring(0, 3);
				index = daoManager.getSupplierMasterDao().getSupplierMastersCount(retval, "StartsWith");
				if (index == 0)
					index++;

				prefix = String.format("%s%s", retval, Strings.padStart(index.toString(), 3, '0'));

				while (daoManager.getSupplierMasterDao().getSupplierMastersCount(prefix, "equals") > 0) {
					index++;
					prefix = String.format("%s%s", retval, Strings.padStart(index.toString(), 3, '0'));
				}
			}

			if (index > 999) {
				if (list.size() >= 3)
					retval = String.format("%s%s%s", (list.get(0).trim()).substring(0, 1), (list.get(1).trim()).substring(0, 1),
							(list.get(2).trim()).substring(0, 1));
				else if (list.size() == 2)
					retval = String.format("%s%s", (list.get(0).trim()).substring(0, 2), (list.get(1).trim()).substring(0, 1));
				index = daoManager.getSupplierMasterDao().getSupplierMastersCount(retval, "StartsWith");

				while (daoManager.getSupplierMasterDao().getSupplierMastersCount(
						String.format("%s%s", retval, Strings.padStart(index.toString(), 3, '0')), "equals") > 0) {
					index++;
				}
			}

			return String.format("%s%s", retval, Strings.padStart(index.toString(), 3, '0'));
		} catch (Throwable x) {
			throw x;
		}
	}

	public String NumberPrefix(Long value, String module, String company) {
		String prefix = "";
		String threeLetter = StringHelper.isNotEmpty(company) ? company.substring(0, 3) : "";
		switch (module) {
		case MessengerKeys.SupplierModule:
			if (value < 100) {
				prefix = threeLetter + "00" + value;
			} else {
				prefix = threeLetter + value;
			}
			break;
		case MessengerKeys.CommodityModule:
			if (value < 100) {
				prefix = "COM00" + value;
			} else {
				prefix = "COM" + value;
			}
			break;
		case MessengerKeys.ContractModule:
			if (value < 100) {
				prefix = "CO00" + value;
			} else {
				prefix = "CO" + value;
			}
			break;

		case MessengerKeys.MarketDevlopmentModule:
			if (value < 100) {
				prefix = "SMD00" + value;
			} else {
				prefix = "SMD" + value;
			}
			break;

		case MessengerKeys.SupplierRotationModule:
			if (value < 100) {
				prefix = "SRT00" + value;
			} else {
				prefix = "SRT" + value;
			}
			break;

		case MessengerKeys.ContractStandardsModule:
			if (value < 100) {
				prefix = "COS00" + value;
			} else {
				prefix = "COS" + value;
			}
			break;
		case MessengerKeys.StandardAgreementModule:
			if (value < 100) {
				prefix = "SAT00" + value;
			} else {
				prefix = "SAT" + value;
			}
			break;
		case MessengerKeys.PriceBenchmarkModule:
			if (value < 100) {
				prefix = "PBD00" + value;
			} else {
				prefix = "PBD" + value;
			}
			break;
		case MessengerKeys.ContractNegotiations:
			if (value < 100) {
				prefix = "CN00" + value;
			} else {
				prefix = "CN" + value;
			}
			break;
		case MessengerKeys.ServiceRequestModule:
			if (value < 100) {
				prefix = "SRO00" + value;
			} else {
				prefix = "SRO" + value;
			}
			break;
		case MessengerKeys.InstructionToPerformWorkModule:
			if (value < 100) {
				prefix = "IPW00" + value;
			} else {
				prefix = "IPW" + value;
			}
			break;

		case MessengerKeys.CommodityMasterAgreementModule:
			if (value < 100) {
				prefix = "CMA00" + value;
			} else {
				prefix = "CMA" + value;
			}
			break;
		default:
			break;
		}
		return prefix;
	}

	public Long NumberIncrement(String module) throws Throwable {
		long count = 0l;
		switch (module) {
		case MessengerKeys.SupplierModule:

			count = daoManager.getSupplierMasterDao().getSupplierMastersCount();
			count += 1;
			break;
		case MessengerKeys.CommodityModule:

			count = daoManager.getInventoryDao().getInventoryDefinitionsCount();
			count += 1;
			break;

		case MessengerKeys.ContractModule:

			count = daoManager.getContractMasterDao().getContractMasterCount();
			count += 1;
			break;

		case MessengerKeys.SupplierRotationModule:

			count = daoManager.getSupplierRotationTemplatesDao().getSupplierRotationTemplatesCount();
			count += 1;
			break;

		case MessengerKeys.MarketDevlopmentModule:

			count = daoManager.getSupplierMarketDevelopmentDao().getSupplierMarketDevelopmentCount();
			count += 1;
			break;

		case MessengerKeys.ContractStandardsModule:

			count = daoManager.getContractStandardsDao().getContractStandardsCount();
			count += 1;
			break;

		case MessengerKeys.StandardAgreementModule:

			count = daoManager.getStandardAgreementDao().getStandardAgreementCount();
			count += 1;
			break;
		case MessengerKeys.PriceBenchmarkModule:

			count = daoManager.getPriceBenchmarkDefinitionsDao().getPriceBenchmarkDefinitionsCount();
			count += 1;
			break;
		case MessengerKeys.ContractNegotiations:

			count = daoManager.getContractNegotiationsDao().getContractNegotiationsCount();
			count += 1;
			break;
		case MessengerKeys.ServiceRequestModule:

			count = daoManager.getSroDao().getSROCount();
			count += 1;
			break;
		case MessengerKeys.InstructionToPerformWorkModule:

			count = daoManager.getIpwDao().getIPWsCount();
			count += 1;
			break;

		case MessengerKeys.CommodityMasterAgreementModule:

			// count = core.CommodityMasterAgreements?.ToList()?.Count() ?? 0;
			count += 1;
			break;

		default:
			count += 1;
			break;
		}

		return count;
	}

}
