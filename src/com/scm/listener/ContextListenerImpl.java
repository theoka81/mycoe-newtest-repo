package com.scm.listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scm.dao.common.DaoManager;
import com.scm.keys.UserCodeKeys;

public class ContextListenerImpl implements ServletContextListener {

	private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:scm.xml");

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextDestroyed(sce);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			ServletContext sc = sce.getServletContext();
			DaoManager daoManager = applicationContext.getBean(DaoManager.class);

			Map<Integer, String> verificationRegulator = daoManager.getSupplierDao().goBbbeeVerificationRegulatorsMap();
			sc.setAttribute("verificationRegulatorMap", verificationRegulator);

			Map<Integer, String> businessStatus = daoManager.getSupplierDao().goBusinessStatusMap();
			sc.setAttribute("businessStatus", businessStatus);

			Map<Integer, String> countryOfOrigin = daoManager.getSupplierDao().goCountriesMap();
			sc.setAttribute("countryOfOrigin", countryOfOrigin);

			Map<Integer, String> governmentTypes = daoManager.getSupplierDao().goGovernmentTypesMap();
			sc.setAttribute("governmentTypes", governmentTypes);

			Map<Integer, String> idType = daoManager.getSupplierDao().goIdTypesMap();
			sc.setAttribute("idType", idType);

			Map<Integer, String> supplierStates = daoManager.getSupplierDao().goSupplierStatesMap();
			sc.setAttribute("supplierStates", supplierStates);

			Map<Integer, String> supplierSubType = daoManager.getSupplierDao().goSupplierSubClassificationsMap();
			sc.setAttribute("supplierSubType", supplierSubType);

			Map<Integer, String> supplierType = daoManager.getSupplierDao().goSupplierClassificationsMap();
			sc.setAttribute("supplierType", supplierType);

			Map<Integer, String> totalAnnualTurnover = daoManager.getSupplierDao().goBbbeeTotalAnnualTurnoversMap();
			sc.setAttribute("totalAnnualTurnover", totalAnnualTurnover);

			Map<Integer, String> certificateType = daoManager.getSupplierDao().goBbbeeCertificateTypesMap();
			sc.setAttribute("certificateType", certificateType);

			Map<Integer, String> irbaRegisteredAuditor = daoManager.getSupplierDao().goBbbeeIrbaRegisteredAuditorsMap();
			sc.setAttribute("irbaRegisteredAuditor", irbaRegisteredAuditor);

			Map<Integer, String> sanasAccreditedAgency = daoManager.getSupplierDao()
					.goSanasBbbeeVerificationAgenciesMap();
			sc.setAttribute("sanasAccreditedAgency", sanasAccreditedAgency);

			Map<Integer, String> sectorCharter = daoManager.getSupplierDao().goBbbeeSectorChartersMap();
			sc.setAttribute("sectorCharter", sectorCharter);

			Map<Integer, String> statusLevelOfContributor = daoManager.getSupplierDao()
					.goBbbeeStatusLevelOfContributorsMap();
			sc.setAttribute("statusLevelOfContributor", statusLevelOfContributor);

			Map<Integer, String> subSectorCharter = daoManager.getSupplierDao().goBbbeeSectorChartersMap();
			sc.setAttribute("subSectorCharter", subSectorCharter);

			Map<Integer, String> cluster = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.Cluster);
			sc.setAttribute("cluster", cluster);

			Map<Integer, String> company = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.Company);
			sc.setAttribute("company", company);

			Map<Integer, String> department = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.Department);
			sc.setAttribute("department", department);

			Map<Integer, String> unit = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.Unit);
			sc.setAttribute("unit", unit);

			Map<Integer, String> status = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.SupplierStatus);
			sc.setAttribute("status", status);

			Map<Integer, String> transactionType = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.TransactionType);
			sc.setAttribute("transactionType", transactionType);

			Map<Integer, String> supplierHold = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.SupplierHold);
			sc.setAttribute("supplierHold", supplierHold);

			Map<Integer, String> supplierCode = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.SupplierCode);
			sc.setAttribute("supplierCode", supplierCode);

			Map<Integer, String> paymentTerms = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.PaymentTerms);
			sc.setAttribute("paymentTerms", paymentTerms);

			Map<Integer, String> paymentInstrument = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.PaymentInstrument);
			sc.setAttribute("paymentInstrument", paymentInstrument);

			Map<Integer, String> remitType = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.RemitType);
			sc.setAttribute("remitType", remitType);

			Map<Integer, String> printMessage = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.PrintMessage);
			sc.setAttribute("printMessage", printMessage);

			Map<Integer, String> categoryCode1 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode1);
			sc.setAttribute("categoryCode1", categoryCode1);

			Map<Integer, String> categoryCode10 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode10);
			sc.setAttribute("categoryCode10", categoryCode10);

			Map<Integer, String> categoryCode11 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode11);
			sc.setAttribute("categoryCode11", categoryCode11);

			Map<Integer, String> categoryCode12 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode12);
			sc.setAttribute("categoryCode12", categoryCode12);

			Map<Integer, String> categoryCode13 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode13);
			sc.setAttribute("categoryCode13", categoryCode13);

			Map<Integer, String> categoryCode14 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode14);
			sc.setAttribute("categoryCode14", categoryCode14);

			Map<Integer, String> categoryCode15 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode15);
			sc.setAttribute("categoryCode15", categoryCode15);

			Map<Integer, String> categoryCode16 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode16);
			sc.setAttribute("categoryCode16", categoryCode16);

			Map<Integer, String> categoryCode17 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode17);
			sc.setAttribute("categoryCode17", categoryCode17);

			Map<Integer, String> categoryCode18 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode18);
			sc.setAttribute("categoryCode18", categoryCode18);

			Map<Integer, String> categoryCode19 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode19);
			sc.setAttribute("categoryCode19", categoryCode19);

			Map<Integer, String> categoryCode2 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode2);
			sc.setAttribute("categoryCode2", categoryCode2);

			Map<Integer, String> categoryCode3 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode3);
			sc.setAttribute("categoryCode3", categoryCode3);

			Map<Integer, String> categoryCode4 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode4);
			sc.setAttribute("categoryCode4", categoryCode4);

			Map<Integer, String> categoryCode5 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode5);
			sc.setAttribute("categoryCode5", categoryCode5);

			Map<Integer, String> categoryCode6 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode6);
			sc.setAttribute("categoryCode6", categoryCode6);

			Map<Integer, String> categoryCode7 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode7);
			sc.setAttribute("categoryCode7", categoryCode7);

			Map<Integer, String> categoryCode8 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode8);
			sc.setAttribute("categoryCode8", categoryCode8);

			Map<Integer, String> categoryCode9 = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SupplierCategoryCode9);
			sc.setAttribute("categoryCode9", categoryCode9);

			// Contract Master

			Map<Long, String> contractTypeMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.ContractType,
					true);
			sc.setAttribute("contractTypeMap", contractTypeMap);

			Map<Long, String> statusMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.ContractStatus,
					false);
			sc.setAttribute("statusMap", statusMap);

			Map<Long, String> procurementTypeMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ProcurementType, false);
			sc.setAttribute("procurementTypeMap", procurementTypeMap);

			Map<Long, String> requestedUnitMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.Unit,
					false);
			sc.setAttribute("requestedUnitMap", requestedUnitMap);

			Map<Long, String> contractCategoryMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ContractCategory, false);
			sc.setAttribute("contractCategoryMap", contractCategoryMap);

			Map<Long, String> contractHeaderTypeMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ContractHeaderType, false);
			sc.setAttribute("contractHeaderTypeMap", contractHeaderTypeMap);

			Map<Long, String> teamIdMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.Team, false);
			sc.setAttribute("teamIdMap", teamIdMap);

			Map<Long, String> supplierTradingMap = daoManager.getSupplierDao().getSuppliersMap();
			sc.setAttribute("supplierTradingMap", supplierTradingMap);

			Map<Long, String> requesterIdMap = daoManager.getUserDao().getUsersKeyMap();
			sc.setAttribute("requesterIdMap", requesterIdMap);

			Map<Long, String> uomRecievedOrShippingMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.Uom,
					false);
			sc.setAttribute("uomRecievedOrShippingMap", uomRecievedOrShippingMap);

			Map<Long, String> contractDetailsStatusMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ContractDetailsStatus, false);
			sc.setAttribute("contractDetailsStatusMap", contractDetailsStatusMap);

			Map<Long, String> contractDetailsStatusReasonMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ContractDetailsStatusReason, false);
			sc.setAttribute("contractDetailsStatusReasonMap", contractDetailsStatusReasonMap);

			Map<Long, String> contractMasterIdMap = daoManager.getContractMasterDao().getContractMastersKeyMap();
			sc.setAttribute("contractMasterIdMap", contractMasterIdMap);

			Map<Long, String> hodAccountingOfficerMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.HodAccountingOfficers, false);
			sc.setAttribute("hodAccountingOfficerMap", hodAccountingOfficerMap);

			Map<Long, String> currencyMap = daoManager.getUserCodeDao().getUserCodeKeyMap(UserCodeKeys.Currency, false);
			sc.setAttribute("currencyMap", currencyMap);

			Map<Long, String> deliveryInstructionMap = daoManager.getUserCodeDao()
					.getUserCodeKeyMap(UserCodeKeys.ContractDetailsDeliveryInstruction, false);
			sc.setAttribute("deliveryInstructionMap", deliveryInstructionMap);

			Map<Long, String> activeSuppliersMap = daoManager.getSupplierDao().getActiveSuppliersMap();
			sc.setAttribute("activeSuppliersMap", activeSuppliersMap);

			Map<Integer, String> stockType = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.StockingType);
			sc.setAttribute("stockType", stockType);

			// Commodity

			Map<Integer, String> itemStatus = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemTransactionStatus);
			sc.setAttribute("itemStatus", itemStatus);
			// TODO Need to hard Code for S & I
			Map<Integer, String> commodityType = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemCategoryCode1);
			sc.setAttribute("commodityType", commodityType);
			Map<Integer, String> productFamily = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ProductFamily);
			sc.setAttribute("productFamily", productFamily);
			Map<Integer, String> familySection = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.FamilySection);
			sc.setAttribute("familySection", familySection);
			Map<Integer, String> productLine = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ProductLine);
			sc.setAttribute("productLine", productLine);
			Map<Integer, String> productGroup = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ProductGroup);
			sc.setAttribute("productGroup", productGroup);
			Map<Integer, String> commodityClass = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.CommodityClass);
			sc.setAttribute("commodityClass", commodityClass);
			Map<Integer, String> commoditySubClass = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.CommoditySubClass);
			sc.setAttribute("commoditySubClass", commoditySubClass);
			Map<Integer, String> commodityCode = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.CommodityCode);
			sc.setAttribute("commodityCode", commodityCode);
			Map<Integer, String> planningCode = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.PlanningCode);
			sc.setAttribute("planningCode", planningCode);
			Map<Integer, String> costingMethod = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ItemCode1);
			sc.setAttribute("costingMethod", costingMethod);
			Map<Integer, String> itemCategory = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ItemCode2);
			sc.setAttribute("itemCategory", itemCategory);
			Map<Integer, String> itemSubCategory = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ItemCode3);
			sc.setAttribute("itemSubCategory", itemSubCategory);
			Map<Integer, String> strategicSourcingParent = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemCode4);
			sc.setAttribute("strategicSourcingParent", strategicSourcingParent);
			Map<Integer, String> strategicSourcingChild = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemCode5);
			sc.setAttribute("strategicSourcingChild", strategicSourcingChild);
			Map<Integer, String> aBCCoding = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ItemCode6);
			sc.setAttribute("aBCCoding", aBCCoding);
			Map<Integer, String> transversalContract = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemCode7);
			sc.setAttribute("transversalContract", transversalContract);
			Map<Integer, String> sIC = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.ItemCode8);
			sc.setAttribute("sIC", sIC);
			Map<Integer, String> itemTemperature = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemTemperaturePreferred);
			sc.setAttribute("itemTemperature", itemTemperature);

			Map<Integer, String> unitOfMeasure = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.Uom);
			sc.setAttribute("unitOfMeasure", unitOfMeasure);
			Map<Integer, String> mscoaItemSegment = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.MscoaItemSegment);
			sc.setAttribute("mscoaItemSegment", mscoaItemSegment);
			Map<Integer, String> standardAgreementTemplate = daoManager.getStandardAgreementDao()
					.getStandardAgreementDropDown();
			sc.setAttribute("standardAgreementTemplate", standardAgreementTemplate);
			Map<Integer, String> cycleCountCategory = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.CycleCountCategory);
			sc.setAttribute("cycleCountCategory", cycleCountCategory);
			Map<Integer, String> categoryGl = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.CategoryGL);
			sc.setAttribute("categoryGl", categoryGl);
			Map<Integer, String> methodKitConfiguratorPricing = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.MethodKitConfiguratorPricing);
			sc.setAttribute("methodKitConfiguratorPricing", methodKitConfiguratorPricing);
			Map<Integer, String> typeWarranty = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.TypeWarranty);
			sc.setAttribute("typeWarranty", typeWarranty);
			Map<Integer, String> commissionCategory = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.CommissionCategory);
			sc.setAttribute("commissionCategory", commissionCategory);
			Map<Integer, String> serialNoRequired = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.SerialNoRequired);
			sc.setAttribute("serialNoRequired", serialNoRequired);
			Map<Integer, String> fifoProcessing = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.FIFOProcessing);
			sc.setAttribute("fifoProcessing", fifoProcessing);
			Map<Integer, String> lotStatusCode = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.LotStatusCode);
			sc.setAttribute("lotStatusCode", lotStatusCode);
			Map<Integer, String> shippingConditionsCode = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ShippingConditionsCode);
			sc.setAttribute("shippingConditionsCode", shippingConditionsCode);
			Map<Integer, String> shippingCommodityClass = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ShippingCommodityClass);
			sc.setAttribute("shippingCommodityClass", shippingCommodityClass);
			Map<Integer, String> pricingType = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.PricingType);
			sc.setAttribute("pricingType", pricingType);
			Map<Integer, String> itemPricingStatus = daoManager.getSupplierDao()
					.goUserCodeKeyMap(UserCodeKeys.ItemPriceStatus);
			sc.setAttribute("itemPricingStatus", itemPricingStatus);
			Map<Integer, String> rebateType = daoManager.getSupplierDao().goUserCodeKeyMap(UserCodeKeys.RebateCode);
			sc.setAttribute("rebateType", rebateType);

		} catch (Throwable th) {
			th.printStackTrace();
		}
	}

}
