package com.scm.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.common.cache.SCMProperties;
import com.scm.dao.domain.Address;
import com.scm.dao.domain.AddressType;
import com.scm.dao.domain.Bank;
import com.scm.dao.domain.BankAccount;
import com.scm.dao.domain.BankAccountType;
import com.scm.dao.domain.BankVerificationStatus;
import com.scm.dao.domain.BbbeeCertificateType;
import com.scm.dao.domain.BbbeeIrbaRegisteredAuditor;
import com.scm.dao.domain.BbbeeSanasVerificationAgency;
import com.scm.dao.domain.BbbeeSectorCharter;
import com.scm.dao.domain.BbbeeStatusLevelOfContributor;
import com.scm.dao.domain.BbbeeVerificationRegulator;
import com.scm.dao.domain.BusinessStatus;
import com.scm.dao.domain.CommodityItem;
import com.scm.dao.domain.Contact;
import com.scm.dao.domain.Country;
import com.scm.dao.domain.Director;
import com.scm.dao.domain.DirectorStatus;
import com.scm.dao.domain.District;
import com.scm.dao.domain.Document;
import com.scm.dao.domain.EthnicGroup;
import com.scm.dao.domain.GovernmentType;
import com.scm.dao.domain.IdType;
import com.scm.dao.domain.Municipality;
import com.scm.dao.domain.Province;
import com.scm.dao.domain.Suburb;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierClassification;
import com.scm.dao.domain.SupplierCode;
import com.scm.dao.domain.SupplierCodesWork;
import com.scm.dao.domain.SupplierCompliantHeader;
import com.scm.dao.domain.SupplierEnquiryHeader;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.domain.SupplierMasterWork;
import com.scm.dao.domain.SupplierState;
import com.scm.dao.domain.SupplierSubClassification;
import com.scm.dao.domain.SystemUser;
import com.scm.dao.domain.Taxes;
import com.scm.dao.domain.UserCode;
import com.scm.dao.domain.Ward;
import com.scm.dao.domain.Workflow;
import com.scm.keys.MessengerKeys;
import com.scm.keys.UserCodeIdKeys;
import com.scm.keys.UserCodeKeys;
import com.scm.modal.BidSpecificationsBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.DashBoardViewModal;
import com.scm.modal.DocumentBean;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.IPWBean;
import com.scm.modal.Pagination;
import com.scm.modal.RequisitionDetailBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SroBean;
import com.scm.modal.SummaryResponse;
import com.scm.modal.SupplierViewModel;
import com.scm.modal.SuppliersBean;
import com.scm.modal.WorkFlowGraphModal;
import com.scm.service.SupplierUIService;
import com.scm.service.common.BaseUIservice;
import com.scm.service.common.NextNumberEngine;
import com.scm.util.Utility;
import com.scm.ws.impl.data.SupplierDetailsFull;

@Service
public class SupplierUIServiceImpl extends BaseUIservice implements SupplierUIService {

	@Autowired
	private NextNumberEngine nextNumberEngine;

	@Autowired
	private CloneHelper cloneHelper;

	@Override
	public SummaryResponse<SroBean> getSupplierSRODetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		SummaryResponse<SroBean> summary = new SummaryResponse<SroBean>();
		summary.setTotalRecords(daoManager.getSupplierDao().getSupplierSRODetailsCount(searchSortObj));
		summary.setEntities(daoManager.getSupplierDao().getSupplierSRODetailsSummary(pagination, searchSortObj));

		return summary;

	}

	@Override
	public List<ContractDetailBean> getContractDetailsList(String maaaNumber) throws Throwable {
		return daoManager.getContractDetailsDao().getContractDetailsList(maaaNumber);
	}

	@Override
	public List<RequisitionDetailBean> loadRequisitionDetails(String maaaNumber, Integer orderTypeId) throws Throwable {
		return daoManager.getSupplierDao().loadRequisitionDetails(maaaNumber, orderTypeId);
	}

	@Override
	public List<RequisitionDetailBean> loadQuotationDetails(String maaaNumber, Integer orderTypeId) throws Throwable {
		return daoManager.getSupplierDao().loadQuotationDetails(maaaNumber, orderTypeId);
	}

	@Override
	public List<BidSpecificationsBean> loadBidSpecifications(String maaaNumber) throws Throwable {
		return daoManager.getSupplierDao().loadBidSpecifications(maaaNumber);
	}

	@Override
	public List<SroBean> getSROList(String maaaNumber) throws Throwable {
		return daoManager.getSroDao().getSROList(maaaNumber);
	}

	@Override
	public List<IPWBean> getIPWList(String maaaNumber) throws Throwable {
		return daoManager.getIpwDao().getIPWList(maaaNumber);
	}

	@Override
	public List<SupplierCompliantHeader> getSCHList(String maaaNumber) throws Throwable {
		return daoManager.getSupplierCompliantHeaderDao().getSCHList(maaaNumber);
	}

	@Override
	public List<SupplierEnquiryHeader> getSEHList(String maaaNumber) throws Throwable {
		return daoManager.getSupplierEnquiryHeaderDao().getSEHList(maaaNumber);
	}

	@Override
	@Transactional("transactionManager")
	public Supplier getSupplierDetails(String maaaNumber) throws Throwable {
		return daoManager.getSupplierDao().getSupplierDetails(maaaNumber);
	}

	@Override
	@Transactional("transactionManager")
	public SupplierViewModel getSupplierVewModalDetails(Long supplierId, String maaaNumber, Long systemUserId)
			throws Throwable {
		String isCSDLocalEnabled = SCMProperties.get("USE_CSD_LOCAL_DB");
		SupplierViewModel svm = new SupplierViewModel();
		if (supplierId == null && StringHelper.isNotEmpty(maaaNumber)) {
			if (!SCMProperties.isEmpty(isCSDLocalEnabled) && SCMProperties.isOn(isCSDLocalEnabled)) {
				if (!isCsdSupplierExists(maaaNumber)) {
					// return null;
				} else {
					svm = getSupplier(maaaNumber);
				}
			} else {
				// WS call
				String token = serviceManager.getCsdApiService().authenticate();
				SupplierDetailsFull supplierDetailsFull = serviceManager.getCsdApiService().getSupplier(token,
						maaaNumber);

				if (supplierDetailsFull != null && supplierDetailsFull.getSupplierIdentificationDetails() != null
						&& StringHelper.isNotEmpty(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber())) {
					serviceManager.getCsdApiService().mapSupplierDto(svm, supplierDetailsFull);

					// JK.20210220a - Checks if the supplier is already in the system, update
					// supplier instead, for now returning null.
					SupplierMaster sm = daoManager.getSupplierMasterDao().getSupplierMasterDetails(maaaNumber, false);
					if (sm != null && sm.getId() != null) {

					} else {
						if (svm != null) {
							if (svm.getSupplier() != null) {
								// region All Foreign keys set to null
								// JK.20210422a - Checks if the data is in the database first.
								if (svm.getSupplier().getIdTypeId() != null) {
									IdType idType = daoManager.getIdTypesDao().get(svm.getSupplier().getIdTypeId());
									if (idType == null) {
										svm.getSupplier().setIdTypeId(null);
									}
								}

								if (svm.getSupplier().getSupplierClassification() != null) {
									SupplierClassification supplierClassification = daoManager
											.getSupplierClassificationsDao().get(svm.getSupplier()
													.getSupplierClassification().getSupplierClassificationId());
									if (supplierClassification == null) {
										svm.getSupplier().setSupplierClassification(null);
									}
								}

								if (svm.getSupplier().getGovernmentTypeId() != null) {
									GovernmentType governmentType = daoManager.getGovernmentTypesDao()
											.get(svm.getSupplier().getGovernmentTypeId());

									if (governmentType == null) {
										svm.getSupplier().setGovernmentTypeId(null);
									}
								}

								if (svm.getSupplier().getSupplierState() != null) {
									SupplierState supplierState = daoManager.getSupplierStatesDao()
											.get(svm.getSupplier().getSupplierState().getSupplierStateId());
									if (supplierState == null) {
										svm.getSupplier().setSupplierState(null);
									}
								}

								if (svm.getSupplier().getSupplierSubClassification() != null) {
									SupplierSubClassification supplierSubClassification = daoManager
											.getSupplierSubClassificationsDao().get(svm.getSupplier()
													.getSupplierSubClassification().getSupplierSubClassificationId());
									if (supplierSubClassification == null) {
										svm.getSupplier().setSupplierSubClassification(null);
									}
								}

								if (svm.getSupplier().getCountryOfOriginId() != null) {
									Country country = daoManager.getCountryDao()
											.get(svm.getSupplier().getCountryOfOriginId());
									if (country == null) {
										svm.getSupplier().setCountryOfOriginId(null);
									}
								}

								if (svm.getSupplier().getBusinessStatusId() != null) {
									BusinessStatus businessStatus = daoManager.getBusinessStatusDao()
											.get(svm.getSupplier().getBusinessStatusId());
									if (businessStatus == null) {
										svm.getSupplier().setBusinessStatusId(null);
									}
								}
								daoManager.getSupplierDao().save(svm.getSupplier());
							}

							if (svm.getBbbee() != null) {
								if (svm.getBbbee().getBbbeeCertificateType() != null) {
									BbbeeCertificateType bbbeeCertificateType = daoManager.getBbbeeCertificateTypeDao()
											.get(svm.getBbbee().getBbbeeCertificateType().getCertificateTypeId());
									if (bbbeeCertificateType == null) {
										svm.getBbbee().setBbbeeCertificateType(null);
									}
								}

								if (svm.getBbbee().getBbbeeVerificationRegulator() != null) {
									BbbeeVerificationRegulator bbbeeVerificationRegulator = daoManager
											.getBbbeeVerificationRegulatorsDao().get(svm.getBbbee()
													.getBbbeeVerificationRegulator().getVerificationRegulatorId());
									if (bbbeeVerificationRegulator == null) {
										svm.getBbbee().setBbbeeVerificationRegulator(null);
									}
								}

								if (svm.getBbbee().getBbbeeStatusLevelOfContributor() != null) {
									BbbeeStatusLevelOfContributor bbbeeStatusLevelOfContributor = daoManager
											.getBbbeeStatusLevelOfContributorsDao()
											.get(svm.getBbbee().getBbbeeStatusLevelOfContributor()
													.getBBBEEStatusLevelOfContributorId());

									if (bbbeeStatusLevelOfContributor == null) {
										svm.getBbbee().setBbbeeStatusLevelOfContributor(null);
									}
								}

								if (svm.getBbbee().getBbbeeSectorCharter1() != null) {
									BbbeeSectorCharter bbbeeSectorCharters = daoManager.getBbbeeSectorChartersDao()
											.get(svm.getBbbee().getBbbeeSectorCharter1().getSectorCharterId());
									if (bbbeeSectorCharters == null) {
										svm.getBbbee().setBbbeeSectorCharter1(null);
									}
								}

								if (svm.getBbbee().getBbbeeSectorCharter2() != null) {
									BbbeeSectorCharter bbbeeSubSectorCharters = daoManager.getBbbeeSectorChartersDao()
											.get(svm.getBbbee().getBbbeeSectorCharter2().getSectorCharterId());
									if (bbbeeSubSectorCharters == null) {
										svm.getBbbee().setBbbeeSectorCharter2(null);
									}
								}

								if (svm.getBbbee().getBbbeeIrbaRegisteredAuditor() != null) {
									BbbeeIrbaRegisteredAuditor bbbeeIrbaRegisteredAuditor = daoManager
											.getBbbeeIrbaRegisteredAuditorsDao().get(svm.getBbbee()
													.getBbbeeIrbaRegisteredAuditor().getIrbaRegisteredAuditorId());
									if (bbbeeIrbaRegisteredAuditor == null) {
										svm.getBbbee().setBbbeeIrbaRegisteredAuditor(null);
									}
								}

								if (svm.getBbbee().getSanasBbbeeVerificationAgency() != null) {
									BbbeeSanasVerificationAgency bbbeeSanasVerificationAgency = daoManager
											.getBbbeeSanasVerificationAgenciesDao()
											.get(svm.getBbbee().getSanasBbbeeVerificationAgency()
													.getSanasBbbeeVerificationAgencyId());
									if (bbbeeSanasVerificationAgency == null) {
										svm.getBbbee().setSanasBbbeeVerificationAgency(null);
									}
								}

								svm.getBbbee().setSupplierId(svm.getSupplier().getId());
								svm.getBbbee().setSupplierNumber(svm.getSupplier().getSupplierNumber());

								daoManager.getBbbeeDao().save(svm.getBbbee());
							}

							if (svm.getTaxes() != null && svm.getTaxes().size() > 0) {
								for (Taxes tax : svm.getTaxes()) {
									tax.setSupplierId(svm.getSupplier().getId());
									tax.setSupplierNumber(svm.getSupplier().getSupplierNumber());
									daoManager.getTaxesDao().save(tax);
								}
							}

							if (svm.getAddresses() != null && svm.getAddresses().size() > 0) {
								for (Address addr : svm.getAddresses()) {
									if (addr.getWard() != null) {
										Ward ward = daoManager.getWardsDao().get(addr.getWard().getWardId());
										if (ward == null) {
											addr.setWard(null);
										}
									}

									if (addr.getAddressType() != null) {
										AddressType addrType = daoManager.getAddressTypesDao()
												.get(addr.getAddressType().getAddressTypeId());
										if (addrType == null) {
											addr.setAddressType(null);
										}
									}

									if (addr.getCountry() != null) {
										Country country = daoManager.getCountryDao()
												.get(addr.getCountry().getCountryId());
										if (country == null) {
											addr.setCountry(null);
										}
									}

									if (addr.getProvince() != null) {
										Province province = daoManager.getProvincesDao()
												.get(addr.getProvince().getProvinceId());
										if (province == null) {
											addr.setProvince(null);
										}
									}

									if (addr.getDistrict() != null) {
										District district = daoManager.getDistrictsDao()
												.get(addr.getDistrict().getDistrictId());
										if (district == null) {
											addr.setDistrict(null);
											;
										}
									}

									if (addr.getMunicipality() != null) {
										Municipality municipality = daoManager.getMunicipalitiesDao()
												.get(addr.getMunicipality().getMunicipalityId());
										if (municipality == null) {
											addr.setMunicipality(null);
										}
									}

									if (addr.getSuburb() != null) {
										Suburb suburb = daoManager.getSuburbsDao().get(addr.getSuburb().getSuburbId());
										if (suburb == null) {
											addr.setSuburb(null);
											;
										}
									}

									addr.setSupplierId(svm.getSupplier().getId());
									addr.setSupplierNumber(svm.getSupplier().getSupplierNumber());

									daoManager.getAddressDao().save(addr);
								}
							}

							if (svm.getDirectors() != null && svm.getDirectors().size() > 0) {
								for (Director director : svm.getDirectors()) {
									if (director.getCountry() != null) {
										Country country = daoManager.getCountryDao()
												.get(director.getCountry().getCountryId());
										if (country == null) {
											director.setCountry(null);
										}
									}

									if (director.getIdType() != null) {
										IdType idType = daoManager.getIdTypesDao()
												.get(director.getIdType().getIdTypeId());
										if (idType == null) {
											director.setIdType(null);
										}
									}

									if (director.getDirectorStatus() != null) {
										DirectorStatus ds = daoManager.getDirectorStatusDao()
												.get(director.getDirectorStatus().getDirectorStatusId());
										if (ds == null) {
											director.setDirectorStatus(null);
										}
									}

									if (director.getEthnicGroup() != null) {
										EthnicGroup ethnicGroups = daoManager.getEthnicGroupsDao()
												.get(director.getEthnicGroup().getEthnicGroupId());
										if (ethnicGroups == null) {
											director.setEthnicGroup(null);
										}
									}

									if (director.getIsOwner() == null) {
										director.setIsOwner(false);
									}

									director.setSupplierId(svm.getSupplier().getId());
									director.setSupplierNumber(svm.getSupplier().getSupplierNumber());

									daoManager.getDirectorsDao().save(director);
								}

							}
							if (svm.getContact() != null & svm.getContact().size() > 0) {
								for (Contact c : svm.getContact()) {
									c.setSupplierId(svm.getSupplier().getId());
									c.setSupplierNumber(svm.getSupplier().getSupplierNumber());

									daoManager.getContactsDao().save(c);
								}
							}

							if (svm.getBankAccounts() != null && svm.getBankAccounts().size() > 0) {
								for (BankAccount ba : svm.getBankAccounts()) {
									if (ba.getBankAccountType() != null) {
										BankAccountType bat = daoManager.getBankAccountTypesDao()
												.get(ba.getBankAccountType().getBankAccountTypeId());
										if (bat == null) {
											ba.setBankAccountType(null);
										}
									}

									if (ba.getBank() != null) {
										Bank bank = daoManager.getBanksDao().get(ba.getBank().getBankId());
										if (bank == null) {
											ba.setBank(null);
										}
									}

									if (ba.getBankVerificationStatus() != null) {
										BankVerificationStatus bvs = daoManager.getBankVerificationStatusDao()
												.get(ba.getBankVerificationStatus().getBankVerificationStatusId());
										if (bvs == null) {
											ba.setBankVerificationStatus(null);
										}
									}

									if (ba.getCountry() != null) {
										Country c = daoManager.getCountryDao().get(ba.getCountry().getCountryId());
										if (c == null) {
											ba.setCountry(null);
										}
									}

									ba.setSupplierId(svm.getSupplier().getId());
									ba.setSupplierNumber(svm.getSupplier().getSupplierNumber());

									daoManager.getBankAccountsDao().save(ba);
								}
							}

							if (svm.getCommodityItems() != null && svm.getCommodityItems().size() > 0) {
								for (CommodityItem ci : svm.getCommodityItems()) {
									ci.setSupplierId(svm.getSupplier().getId());
									ci.setSupplierNumber(svm.getSupplier().getSupplierNumber());
									daoManager.getCommodityItemsDao().save(ci);
								}
							}

							// JK.20210203a - had to remove because it reverts the svm to null, it needs to
							// create the supplier master first,
							// - this is done in the supplier controller.
							// svm = SupplierHelper.GetSupplier(svm.Supplier.Id);
						}
					}
				}
			}
			SupplierMaster sm = new SupplierMaster();
			sm.setSupplierRefId(svm.getSupplier().getId());
			sm.setSupplierRefNo(maaaNumber);
			sm.setSupplierXRef1(nextNumberEngine.GenerateNextNumber(MessengerKeys.SupplierModule,
					svm.getSupplier().getLegalName()));
			UserCode userCodeVendorObj = daoManager.getUserCodeDao()
					.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.TransactionType_Vendor));
			sm.setSupplierType(userCodeVendorObj.getCodeValue());
			sm.setUserCode11(userCodeVendorObj);

			UserCode userCodePendingObj = daoManager.getUserCodeDao()
					.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.SupplierStatusPending));
			sm.setUserCode8(userCodePendingObj);
			sm.setSupplierStatus(userCodePendingObj.getCodeValue());

			SystemUser sysUser = new SystemUser();
			sysUser.setId(systemUserId);

			sm.setSystemUser1(sysUser);
			sm.setSystemUser2(sysUser);

			Date date = new Date();
			Timestamp ts = new Timestamp(date.getTime());
			sm.setCreatedDateTime(ts);
			sm.setModifiedDateTime(ts);

			sm.setIsActive(true);
			sm.setIsDeleted(false);
			sm.setIsLocked(true);
			sm.setIsCsdRegistered(true);
			sm.setIsApplicationSubmitted(true);

			sm = daoManager.getSupplierMasterDao().save(sm);

			SupplierCode sc = new SupplierCode();
			sc.setSupplierId(sm.getId());

			UserCode userCodeObj = daoManager.getUserCodeDao()
					.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.SupplierCategoryCode9_TakeOnIndicator_NO));
			sc.setCategoryCode9(userCodeObj.getCodeKey());
			sc.setUserCode20(userCodeObj);
			sc.setIsActive(true);
			sc.setIsDeleted(false);
			sc.setIsLocked(true);

			sc.setSystemUser1(sysUser);
			sc.setSystemUser2(sysUser);

			ts = new Timestamp(date.getTime());
			sc.setCreatedDateTime(ts);
			sc.setModifiedDateTime(ts);

			sc = daoManager.getSupplierCodesDao().save(sc);

			SupplierMasterWork smw = cloneHelper.Copy(sm);
			SupplierCodesWork scw = cloneHelper.Copy(sc);

			// Supplier is wanting his information active for processing, so works needs to
			// be active.
			userCodeObj = daoManager.getUserCodeDao()
					.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.SupplierStatusActive));
			smw.setUserCode8(userCodeObj);

			smw = daoManager.getSupplierMasterWorkDao().save(smw);
			scw = daoManager.getSupplierCodesWorkDao().save(scw);

			svm.setSupplierMaster(sm);
			svm.setSupplierMasterWork(smw);
			svm.setSupplierCodes(sc);
			svm.setSupplierCodesWork(scw);

		} else {
			Supplier supplier = daoManager.getSupplierDao().get(supplierId);
			maaaNumber = supplier.getSupplierNumber();
			SupplierMaster sm = daoManager.getSupplierMasterDao().getSupplierMasterDetails(maaaNumber, false);
			if (sm != null) {
				SupplierCode supplierCode = daoManager.getSupplierCodesDao().getSupplierCodeDetails(sm.getId());// core.SupplierCodes.FirstOrDefault(o
																												// =>
																												// o.SupplierId
																												// ==
																												// maaa.Id)?.CategoryCode9Id
																												// ??
																												// svm.SupplierCodes.CategoryCode9Id;
				if (supplierCode != null) {
					svm.setTakeOn(supplierCode.getUserCode20());
				}
			}
			svm.setSupplierMasterWork(daoManager.getSupplierMasterWorkDao().getSupplierMasterWorkDetails(maaaNumber));
			if (svm.getSupplierMasterWork() != null) {
				UserCode userCodeObj = daoManager.getUserCodeDao()
						.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.TransactionType_Vendor));
				svm.getSupplierMasterWork().setSupplierType(userCodeObj.getCodeValue());
				svm.getSupplierMasterWork().setUserCode11(userCodeObj);
				daoManager.getSupplierMasterWorkDao().update(svm.getSupplierMasterWork());
			}
		}

		if (svm.getSupplierMasterWork() != null) {
			includeCsd(svm);
			SupplierMaster sm = daoManager.getSupplierMasterDao()
					.getSupplierMasterDetails(svm.getSupplierMasterWork().getSupplierRefNo(), false);
			svm.setSupplierMaster(sm);
		}
		List<Workflow> workflowList = daoManager.getWorkflowsDao().getWorkflowsDetails(svm.getSupplierMaster().getId(),
				Long.valueOf(UserCodeIdKeys.TransactionType_Vendor), null);
		if (workflowList != null && workflowList.size() > 0) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			switch (workflowList.get(0).getUserCode4().getId().intValue()) {
			case UserCodeIdKeys.SupplierStatusActive: {
				svm.setMessage(String.format("{0} - Supplier information has been approved on {1}. Reason: {2}",
						df.format(new Date()), df.format(workflowList.get(0).getApprovedDate()),
						StringHelper.isEmpty(workflowList.get(0).getApprovedMessage()) ? "No Reason captured."
								: workflowList.get(0).getApprovedMessage()));
				break;
			}
			case UserCodeIdKeys.SupplierStatusInactive: {
				svm.setMessage(String.format("{0} - Supplier information has been rejected on {1}. Reason: {2}",
						df.format(new Date()), df.format(workflowList.get(0).getApprovedDate()),
						workflowList.get(0).getApprovedMessage()));
				break;
			}
			case UserCodeIdKeys.SupplierStatusPending: {
				svm.setMessage(String.format("{0} - Supplier information still pending approval.",
						df.format(new Date()), df.format(workflowList.get(0).getApprovedDate())));
				break;
			}
			default:
				break;
			}
		}
		// svm.setSupplierDepartmentDesc(svm.getSupplierMaster().getUserCode3().getDescription());
		return svm;
	}

	@Transactional
	public void includeCsd(SupplierViewModel svm) throws Throwable {
		try {

			svm.setSupplier(getSupplierDetails(svm.getSupplierMasterWork().getSupplierRefNo()));
			svm.setAddresses(daoManager.getAddressDao().getAddressDetails(svm.getSupplier().getId()));
			svm.setDirectors(daoManager.getDirectorsDao().getDirectorsDetails(svm.getSupplier().getId()));
			svm.setBankAccounts(daoManager.getBankAccountsDao().getBankAccountsDetails(svm.getSupplier().getId()));
			svm.setBbbee(daoManager.getBbbeeDao().getBbbeeDetails(svm.getSupplier().getId()));
			svm.setContact(daoManager.getContactsDao().getContactsDetails(svm.getSupplier().getId()));
			svm.setSupplierIndustryClassifications(daoManager.getSupplierIndustryClassificationsDao()
					.getSupplierIndustryClassificationsDetails(svm.getSupplier().getId()));
			svm.setCommodityGroups(
					daoManager.getCommodityGroupsDao().getCommodityGroupsDetails(svm.getSupplier().getId()));

			DocumentViewModel dmv = new DocumentViewModel();
			List<UserCode> userCodeList = daoManager.getUserCodeDao()
					.getUserCodeDetails(UserCodeKeys.SupplierRegistrationDocumentsUpload);
			List<Document> documentList = daoManager.getDocumentsDao().getDocumentsDetails(svm.getSupplier().getId());
			
			if(documentList != null)
			for(Document d :documentList) {
				d.setUserCodeDesc(daoManager.getUserCodeDao().getUserCodeDetailsDesc(d.getUserCodeId()));
			}
			dmv.setReferenceId(svm.getSupplier().getId());
			dmv.setUploadView(true); // TODO: set based on role
			dmv.setDocumentCheckLists(userCodeList);
			dmv.setDocuments(documentList);
			svm.setDocumentViewModel(dmv);

		} catch (Throwable th) {
			th.printStackTrace();
			throw th;
		}
	}

	@Transactional("csdTransactionManager")
	private boolean isCsdSupplierExists(String maaaNumber) throws Throwable {
		com.scm.dao.csdlocal.domain.Supplier csdSupplier = daoManager.getCsdSupplierDao()
				.getSupplierDetails(maaaNumber);
		if (csdSupplier == null) {
			daoManager.getCsdSupplierDao().flush();
			return false;
		} else {
			daoManager.getCsdSupplierDao().flush();
			return true;
		}
	}

	@Transactional("transactionManager")
	private SupplierViewModel getSupplier(String reference) throws Throwable {

		daoManager.getSupplierDao().importSupplierAsync(reference);
		daoManager.getSupplierDao().flush();
		String maaaNumber = "";
		SupplierViewModel svm = new SupplierViewModel();
		SupplierMaster sm = daoManager.getSupplierMasterDao().getSupplierMasterDetails(reference, true);
		if (sm != null) {
			maaaNumber = sm.getSupplierRefNo();
			svm.setSupplierMaster(sm);

			SupplierCode supplierCode = daoManager.getSupplierCodesDao().getSupplierCodeDetails(sm.getId());
			svm.setSupplierCodes(supplierCode);
		} else {
			maaaNumber = reference;
		}
		svm.setSupplier(getSupplierDetails(maaaNumber));
		svm.setAddresses(daoManager.getAddressDao().getAddressDetails(svm.getSupplier().getId()));
		svm.setAssociations(daoManager.getAssociationsDao().getAssociationsDetails(svm.getSupplier().getId()));
		svm.setBankAccounts(daoManager.getBankAccountsDao().getBankAccountsDetails(svm.getSupplier().getId()));
		svm.setBbbee(daoManager.getBbbeeDao().getBbbeeDetails(svm.getSupplier().getId()));
		svm.setContact(daoManager.getContactsDao().getContactsDetails(svm.getSupplier().getId()));
		svm.setDirectors(daoManager.getDirectorsDao().getDirectorsDetails(svm.getSupplier().getId()));
		svm.setSupplierIndustryClassifications(daoManager.getSupplierIndustryClassificationsDao()
				.getSupplierIndustryClassificationsDetails(svm.getSupplier().getId()));
		svm.setTaxes(daoManager.getTaxesDao().getTaxesDetails(svm.getSupplier().getId()));
		svm.setSupplierFlags(daoManager.getSupplierFlagsDao().getSupplierFlagsDetails(svm.getSupplier().getId()));
		svm.setSupplierFlagDetails(
				daoManager.getSupplierFlagDetailsDao().getSupplierFlagsDetails(svm.getSupplier().getId()));

		svm.setSupplierMasterWork(
				daoManager.getSupplierMasterWorkDao().getSupplierMasterWorkDetails(svm.getSupplierMaster().getId()));
		svm.setSupplierCodesWork(
				daoManager.getSupplierCodesWorkDao().getSupplierCodesWorkDetails(svm.getSupplierMaster().getId()));

		svm.setAccreditationBodies(
				daoManager.getAccreditationBodiesDao().getAccreditationBodiesDetails(svm.getSupplier().getId()));
		svm.setCommodityGroups(daoManager.getCommodityGroupsDao().getCommodityGroupsDetails(svm.getSupplier().getId()));
		svm.setCommodityItems(daoManager.getCommodityItemsDao().getCommodityItemsDetails(svm.getSupplier().getId()));
		svm.setCommodityLocations(
				daoManager.getCommodityLocationsDao().getCommodityLocationsDetails(svm.getSupplier().getId()));
		svm.setCommodityProvinces(
				daoManager.getCommodityProvincesDao().getCommodityProvincesDetails(svm.getSupplier().getId()));
		svm.setContactTypeList(daoManager.getContactTypeListDao().getContactTypeListDetails(svm.getSupplier().getId()));
		svm.setDirectorFlags(daoManager.getDirectorFlagsDao().getDirectorFlagsDetails(svm.getSupplier().getId()));
		svm.setFundingContacts(daoManager.getFundingContactsDao().getFundingContactsDetails(svm.getSupplier().getId()));
		svm.setOwnershipNonNatural(
				daoManager.getOwnershipNonNaturalDao().getOwnershipNonNaturalDetails(svm.getSupplier().getId()));

		svm.setCededSupplier(daoManager.getCededSupplierDao().getCededSupplierDetails(svm.getSupplierMaster().getId()));
		svm.setSupplierContact(
				daoManager.getSupplierContactsDao().getSupplierContactsDetails(svm.getSupplier().getId()));
		return svm;
	}

	@Override
	@Transactional
	public List<DashBoardViewModal> getBackOfficeEnquiryCompliantCount() throws Throwable {
		List<DashBoardViewModal> dashBoardDetailsList = new ArrayList<DashBoardViewModal>();

		DashBoardViewModal dbm = new DashBoardViewModal();
		dbm.setType("New");
		dbm.setComplaints(daoManager.getSupplierCompliantHeaderDao().getNewCount());
		dbm.setEnquiries(daoManager.getSupplierEnquiryHeaderDao().getNewCount());
		dashBoardDetailsList.add(dbm);

		dbm = new DashBoardViewModal();
		dbm.setType("Pending");
		dbm.setComplaints(daoManager.getSupplierCompliantHeaderDao().getPendingCount());
		dbm.setEnquiries(daoManager.getSupplierEnquiryHeaderDao().getPendingCount());
		dashBoardDetailsList.add(dbm);

		dbm = new DashBoardViewModal();
		dbm.setType("Escalated");
		dbm.setComplaints(daoManager.getSupplierCompliantHeaderDao().getEscalatedCount());
		dbm.setEnquiries(daoManager.getSupplierEnquiryHeaderDao().getEscalatedCount());
		dashBoardDetailsList.add(dbm);

		dbm = new DashBoardViewModal();
		dbm.setType("Closed");
		dbm.setComplaints(daoManager.getSupplierCompliantHeaderDao().getClosedCount());
		dbm.setEnquiries(daoManager.getSupplierEnquiryHeaderDao().getClosedCount());
		dashBoardDetailsList.add(dbm);

		return dashBoardDetailsList;
	}

	@Override
	public List<WorkFlowGraphModal> getWorkFlowGraphData(String transactionType) throws Throwable {
		return daoManager.getWorkflowsDao().getWorkFlowGraphDetails(transactionType);
	}

	@Override
	public Map<Long, String> getSuppliersMap() throws Throwable {
		return daoManager.getSupplierDao().getSuppliersMap();
	}

	@Override
	public SummaryResponse<SuppliersBean> getSupplierMastersSummary(Pagination paginationObject,
			SearchSortContainer searchSortContainer) throws Throwable {
		SummaryResponse<SuppliersBean> summary = new SummaryResponse<SuppliersBean>();
		summary.setTotalRecords(daoManager.getSupplierDao().getSupplierMastersCount(searchSortContainer));
		summary.setEntities(
				daoManager.getSupplierDao().getSupplierMastersSummary(paginationObject, searchSortContainer));

		return summary;
	}

	@Override
	public SupplierViewModel saveSupplierDetails(SuppliersBean supplierBean, DocumentBean documentBean,
			Long systemUserId) throws Throwable {

		SupplierViewModel svm = new SupplierViewModel();

		svm.setSupplierMasterWork(daoManager.getSupplierMasterWorkDao()
				.getSupplierMasterWorkDetails(supplierBean.getSupplierMasterSupplierRefNo()));
		UserCode uc = daoManager.getUserCodeDao()
				.getUserCodeDetails(Long.valueOf(UserCodeIdKeys.TransactionType_Vendor));

		svm.getSupplierMasterWork().setSupplierType(uc.getCodeValue());
		svm.getSupplierMasterWork().setUserCode11(uc);

		SupplierMaster sm = daoManager.getSupplierMasterDao()
				.getSupplierMasterDetails(supplierBean.getSupplierMasterSupplierRefNo(), false);
		if (sm == null) {
			sm = cloneHelper.copy(svm.getSupplierMasterWork());
		}
		sm.setIsApplicationSubmitted(true);
		sm = daoManager.getSupplierMasterDao().save(sm);
		svm.setSupplierMaster(sm);

		svm.setSupplierCodesWork(
				daoManager.getSupplierCodesWorkDao().getSupplierCodesWorkDetails(svm.getSupplierMaster().getId()));

		SupplierCode sc = daoManager.getSupplierCodesDao().getSupplierCodeDetails(svm.getSupplierMaster().getId());
		if (sc == null) {
			sc = cloneHelper.copy(svm.getSupplierCodesWork());
			svm.getSupplierCodesWork().setSupplierId(svm.getSupplierMaster().getId());
			sc = daoManager.getSupplierCodesDao().save(sc);
		}
		;
		svm.setSupplierCodes(sc);
		;
		svm.getSupplierMasterWork().setIsApplicationSubmitted(true);

		svm.setSupplier(daoManager.getSupplierDao().getSupplierDetails(supplierBean.getSupplierMasterSupplierRefNo()));
		svm.setAddresses(daoManager.getAddressDao().getAddressDetails(svm.getSupplier().getId()));
		svm.setDirectors(daoManager.getDirectorsDao().getDirectorsDetails(svm.getSupplier().getId()));

		svm.setAssociations(daoManager.getAssociationsDao().getAssociationsDetails(svm.getSupplier().getId()));
		svm.setBankAccounts(daoManager.getBankAccountsDao().getBankAccountsDetails(svm.getSupplier().getId()));
		svm.setBbbee(daoManager.getBbbeeDao().getBbbeeDetails(svm.getSupplier().getId()));
		svm.setContact(daoManager.getContactsDao().getContactsDetails(svm.getSupplier().getId()));

		svm.setSupplierIndustryClassifications(daoManager.getSupplierIndustryClassificationsDao()
				.getSupplierIndustryClassificationsDetails(svm.getSupplier().getId()));

		svm.setCommodityGroups(daoManager.getCommodityGroupsDao().getCommodityGroupsDetails(svm.getSupplier().getId()));

		DocumentViewModel dmv = new DocumentViewModel();
		List<UserCode> userCodeList = daoManager.getUserCodeDao()
				.getUserCodeDetails(UserCodeKeys.SupplierRegistrationDocumentsUpload);
		List<Document> documentList = daoManager.getDocumentsDao()
				.getDocumentsDetails(UserCodeKeys.SupplierRegistrationDocumentsUpload, svm.getSupplier().getId());

		dmv.setReferenceId(svm.getSupplier().getId());
		dmv.setUploadView(true); // TODO: set based on role
		dmv.setDocumentCheckLists(userCodeList);
		dmv.setDocuments(documentList);

		svm.setDocumentViewModel(dmv);
		List<Document> findDocumentsActive = new ArrayList<Document>();
		for (UserCode dcl : svm.getDocumentViewModel().getDocumentCheckLists()) {
			List<Document> d = daoManager.getDocumentsDao().getDocumentsDetails(dcl.getId(), svm.getSupplier().getId());
			if(d != null && d.size() > 0) {
				findDocumentsActive.addAll(d);
			}
		}

		if (findDocumentsActive.size() == 0
				|| findDocumentsActive.size() < svm.getDocumentViewModel().getDocumentCheckLists().size()) {
			List<Integer> userCodeIdList = Utility.getListFromCommaSeparated(documentBean.getChecklists());
			if (documentBean != null && documentBean.getFileNames() != null && documentBean.getFileNames().size() > 0)
				for (int i = 0; i < documentBean.getFileNames().size(); i++) {

					UserCode u = daoManager.getUserCodeDao().get(Long.valueOf(userCodeIdList.get(i)));
					Document d = new Document();
					d.setContentType(documentBean.getContentTypes().get(i));
					d.setDocumentName(documentBean.getFileNames().get(i));
					d.setContent(FileUtils.readFileToByteArray(documentBean.getFiles().get(i)));
					d.setFileSize(documentBean.getFiles().get(i).length());
					d.setCodeValue(u.getCodeValue());
					d.setUserCodeId(u.getId());
					d.setUserCodeDesc(u.getDescription());
					d.setIsActive(true);
					d.setIsDeleted(false);
					d.setReferenceId(svm.getSupplier().getId());
					Date date = new Date();
					Timestamp ts = new Timestamp(date.getTime());
					d.setCreatedDateTime(ts);
					d.setModifiedDateTime(ts);
					d.setIsLocked(false);
					d.setCreatedBySystemUserId(systemUserId);

					d = daoManager.getDocumentsDao().save(d);
				}

		}
		return svm;
	}

	@Override
	public SummaryResponse<Address> getSupplierAddressSummary(Pagination pagination,
			SearchSortContainer searchSortContainer) throws Throwable {
		SummaryResponse<Address> summary = new SummaryResponse<Address>();
		summary.setTotalRecords(daoManager.getAddressDao().getSupplierAddressCount(searchSortContainer));
		summary.setEntities(daoManager.getAddressDao().getSupplierAddressSummary(pagination, searchSortContainer));

		return summary;
	}
	
	
	@Override
	public Address getSupplierAddressDetails(Long id) throws Throwable {
		return daoManager.getAddressDao().get(id);
	}
}
