package com.scm.dao.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.dao.cesar.inventory.EmailDao;
import com.scm.dao.cesar.inventory.SmsDao;
import com.scm.dao.csdlocal.inventory.CsdSupplierDao;
import com.scm.dao.inventory.AccreditationBodiesDao;
import com.scm.dao.inventory.AddressDao;
import com.scm.dao.inventory.AddressTypesDao;
import com.scm.dao.inventory.ApplicationRoleDao;
import com.scm.dao.inventory.ApplicationUserRoleDao;
import com.scm.dao.inventory.ApprovalTemplatesDao;
import com.scm.dao.inventory.AssociationsDao;
import com.scm.dao.inventory.BankAccountTypesDao;
import com.scm.dao.inventory.BankAccountsDao;
import com.scm.dao.inventory.BankVerificationStatusDao;
import com.scm.dao.inventory.BanksDao;
import com.scm.dao.inventory.BbbeeCertificateTypeDao;
import com.scm.dao.inventory.BbbeeDao;
import com.scm.dao.inventory.BbbeeIrbaRegisteredAuditorsDao;
import com.scm.dao.inventory.BbbeeSanasVerificationAgenciesDao;
import com.scm.dao.inventory.BbbeeSectorChartersDao;
import com.scm.dao.inventory.BbbeeStatusLevelOfContributorsDao;
import com.scm.dao.inventory.BbbeeVerificationRegulatorsDao;
import com.scm.dao.inventory.BusinessStatusDao;
import com.scm.dao.inventory.CededSupplierDao;
import com.scm.dao.inventory.CitiesDao;
import com.scm.dao.inventory.ClauseMappingDao;
import com.scm.dao.inventory.CommodityGroupsDao;
import com.scm.dao.inventory.CommodityItemsDao;
import com.scm.dao.inventory.CommodityLocationsDao;
import com.scm.dao.inventory.CommodityProvincesDao;
import com.scm.dao.inventory.ContactTypeListDao;
import com.scm.dao.inventory.ContactsDao;
import com.scm.dao.inventory.ContractDetailsDao;
import com.scm.dao.inventory.ContractMasterDao;
import com.scm.dao.inventory.ContractNegotiationsDao;
import com.scm.dao.inventory.ContractStandardsDao;
import com.scm.dao.inventory.CountryDao;
import com.scm.dao.inventory.DirectorFlagsDao;
import com.scm.dao.inventory.DirectorStatusDao;
import com.scm.dao.inventory.DirectorsDao;
import com.scm.dao.inventory.DistrictsDao;
import com.scm.dao.inventory.DocumentsDao;
import com.scm.dao.inventory.EthnicGroupsDao;
import com.scm.dao.inventory.FundingContactsDao;
import com.scm.dao.inventory.GovernmentTypesDao;
import com.scm.dao.inventory.IdTypesDao;
import com.scm.dao.inventory.InventoryDao;
import com.scm.dao.inventory.InventoryPricingDao;
import com.scm.dao.inventory.InventorySpecificationDao;
import com.scm.dao.inventory.InventoryWarehouseDefaultsDao;
import com.scm.dao.inventory.IpwDao;
import com.scm.dao.inventory.MunicipalitiesDao;
import com.scm.dao.inventory.NextNumberByTransactionTypeDao;
import com.scm.dao.inventory.OwnershipNonNaturalDao;
import com.scm.dao.inventory.PriceBenchmarkDefinitionsDao;
import com.scm.dao.inventory.ProvincesDao;
import com.scm.dao.inventory.RequisitionDetailsDao;
import com.scm.dao.inventory.RoleRelationshipsDao;
import com.scm.dao.inventory.SanasBbbeeVerificationAgenciesDao;
import com.scm.dao.inventory.SignatoriesDao;
import com.scm.dao.inventory.SroDao;
import com.scm.dao.inventory.StandardAgreementDao;
import com.scm.dao.inventory.SuburbsDao;
import com.scm.dao.inventory.SupplierClassificationsDao;
import com.scm.dao.inventory.SupplierCodesDao;
import com.scm.dao.inventory.SupplierCodesWorkDao;
import com.scm.dao.inventory.SupplierCompliantHeaderDao;
import com.scm.dao.inventory.SupplierContactsDao;
import com.scm.dao.inventory.SupplierDao;
import com.scm.dao.inventory.SupplierEnquiryHeaderDao;
import com.scm.dao.inventory.SupplierFlagDetailsDao;
import com.scm.dao.inventory.SupplierFlagsDao;
import com.scm.dao.inventory.SupplierIndustryClassificationsDao;
import com.scm.dao.inventory.SupplierMarketDevelopmentDao;
import com.scm.dao.inventory.SupplierMasterDao;
import com.scm.dao.inventory.SupplierMasterWorkDao;
import com.scm.dao.inventory.SupplierRotationTemplatesDao;
import com.scm.dao.inventory.SupplierStatesDao;
import com.scm.dao.inventory.SupplierSubClassificationsDao;
import com.scm.dao.inventory.TaskComparableRoutesDao;
import com.scm.dao.inventory.TaskManagersDao;
import com.scm.dao.inventory.TaxesDao;
import com.scm.dao.inventory.TendersDao;
import com.scm.dao.inventory.TransactionTypesDao;
import com.scm.dao.inventory.UomConversionDao;
import com.scm.dao.inventory.UserCodeDao;
import com.scm.dao.inventory.UserDao;
import com.scm.dao.inventory.WardsDao;
import com.scm.dao.inventory.WarehouseDao;
import com.scm.dao.inventory.WarehouseInventoryDao;
import com.scm.dao.inventory.WorkflowsDao;

@Repository("daoManager")
public class DaoManager {
	
	@Autowired(required = true)
	private AssociationsDao associationsDao;
	
	@Autowired(required = true)
	private AddressDao addressDao;
	
	@Autowired(required = true)
	private AccreditationBodiesDao accreditationBodiesDao;
	
	@Autowired(required = true)
	private BankAccountsDao bankAccountsDao;
	
	@Autowired(required = true)
	private BankVerificationStatusDao bankVerificationStatusDao;
	
	@Autowired(required = true)
	private BankAccountTypesDao bankAccountTypesDao;
	
	@Autowired(required = true)
	private BanksDao banksDao;
	
	@Autowired(required = true)
	private BbbeeDao bbbeeDao;
	
	@Autowired(required = true)
	private ContactsDao contactsDao;
	
	@Autowired(required = true)
	private CommodityGroupsDao commodityGroupsDao;
	
	@Autowired(required = true)
	private CommodityItemsDao commodityItemsDao;
	
	@Autowired(required = true)
	private CommodityLocationsDao commodityLocationsDao;
	
	@Autowired(required = true)
	private CommodityProvincesDao commodityProvincesDao;

	@Autowired(required = true)
	private ContactTypeListDao contactTypeListDao;
	
	@Autowired(required = true)
	private CededSupplierDao cededSupplierDao;
	
	@Autowired(required = true)
	private DirectorsDao directorsDao;
	
	@Autowired(required = true)
	private DirectorStatusDao directorStatusDao;
	
	@Autowired(required = true)
	private DirectorFlagsDao directorFlagsDao;
	
	@Autowired(required = true)
	private FundingContactsDao fundingContactsDao;

	@Autowired(required = true)
	private SupplierMasterDao supplierMasterDao;
	
	@Autowired(required = true)
	private SupplierDao supplierDao;
	
	@Autowired(required = true)
	private UserDao userDao;
	
	@Autowired(required = true)
	private ApplicationRoleDao applicationRoleDao;
	
	@Autowired(required = true)
	private ApplicationUserRoleDao applicationUserRoleDao; 
	
	@Autowired(required = true)
	private ContractDetailsDao contractDetailsDao;
	
	@Autowired(required = true)
	private SupplierEnquiryHeaderDao supplierEnquiryHeaderDao;
	
	@Autowired(required = true)
	private SupplierCompliantHeaderDao supplierCompliantHeaderDao;
	
	@Autowired(required = true)
	private InventoryDao inventoryDao;
	
	@Autowired(required = true)
	private IpwDao ipwDao;
	
	@Autowired(required = true)
	private SroDao sroDao;
	
	@Autowired(required = true)
	private EmailDao emailDao;
	
	@Autowired(required = true)
	private CsdSupplierDao csdSupplierDao;
	
	@Autowired(required = true)
	private SmsDao smsDao;
	
	@Autowired(required = true)
	private SupplierCodesDao supplierCodesDao;
	
	@Autowired(required = true)
	private SupplierFlagsDao supplierFlagsDao;
	
	@Autowired(required = true)
	private SupplierFlagDetailsDao supplierFlagDetailsDao;
	
	@Autowired(required = true)
	private SupplierIndustryClassificationsDao supplierIndustryClassificationsDao;
	
	@Autowired(required = true)
	private NextNumberByTransactionTypeDao nextNumberByTransactionTypeDao;
	
	@Autowired(required = true)
	private SupplierMasterWorkDao supplierMasterWorkDao;
	
	@Autowired(required = true)
	private SupplierCodesWorkDao supplierCodesWorkDao;
	
	@Autowired(required = true)
	private TaxesDao taxesDao;
	
	@Autowired(required = true)
	private OwnershipNonNaturalDao ownershipNonNaturalDao;
	
	@Autowired(required = true)
	private SupplierContactsDao supplierContactsDao;
	
	@Autowired(required = true)
	private WarehouseDao warehouseDao;
	
	@Autowired(required = true)
	private WarehouseInventoryDao warehouseInventoryDao;
	
	@Autowired(required = true)
	private InventoryWarehouseDefaultsDao inventoryWarehouseDefaultsDao;
		
	@Autowired(required = true)
	private ContractMasterDao contractMasterDao;
	
	@Autowired(required = true)
	private SupplierRotationTemplatesDao supplierRotationTemplatesDao;
	
	@Autowired(required = true)
	private SupplierMarketDevelopmentDao supplierMarketDevelopmentDao;
	
	@Autowired(required = true)
	private ContractStandardsDao contractStandardsDao;
	
	@Autowired(required = true)
	private StandardAgreementDao standardAgreementDao;
	
	@Autowired(required = true)
	private PriceBenchmarkDefinitionsDao priceBenchmarkDefinitionsDao;
	
	@Autowired(required = true)
	private ContractNegotiationsDao contractNegotiationsDao;
	
	@Autowired(required = true)
	private UserCodeDao userCodeDao;
	
	@Autowired(required = true)
	private DocumentsDao documentsDao;
	
	@Autowired(required = true)
	private WorkflowsDao workflowsDao;
	
	@Autowired(required = true)
	private SupplierClassificationsDao supplierClassificationsDao;
	
	@Autowired(required = true)
	private SupplierSubClassificationsDao supplierSubClassificationsDao;
	
	@Autowired(required = true)
	private GovernmentTypesDao governmentTypesDao;
	
	@Autowired(required = true)
	private CountryDao countryDao;
	
	@Autowired(required = true)
	private IdTypesDao idTypesDao;
	
	@Autowired(required = true)
	private BusinessStatusDao businessStatusDao;
	
	@Autowired(required = true)
	private AddressTypesDao addressTypesDao;
	
	@Autowired(required = true)
	private CitiesDao citiesDao;
	
	@Autowired(required = true)
	private DistrictsDao districtsDao;
	
	@Autowired(required = true)
	private MunicipalitiesDao municipalitiesDao;
	
	@Autowired(required = true)
	private ProvincesDao provincesDao;
	
	@Autowired(required = true)
	private SuburbsDao suburbsDao;
	
	@Autowired(required = true)
	private WardsDao wardsDao;
	
	@Autowired(required = true)
	private BbbeeCertificateTypeDao bbbeeCertificateTypeDao;
	
	@Autowired(required = true)
	private BbbeeVerificationRegulatorsDao bbbeeVerificationRegulatorsDao;
	
	@Autowired(required = true)
	private BbbeeIrbaRegisteredAuditorsDao bbbeeIrbaRegisteredAuditorsDao;
	
	@Autowired(required = true)
	private BbbeeSanasVerificationAgenciesDao bbbeeSanasVerificationAgenciesDao;
	
	@Autowired(required = true)
	private SanasBbbeeVerificationAgenciesDao sanasBbbeeVerificationAgenciesDao;
	
	@Autowired(required = true)
	private BbbeeSectorChartersDao bbbeeSectorChartersDao;
	
	@Autowired(required = true)
	private BbbeeStatusLevelOfContributorsDao bbbeeStatusLevelOfContributorsDao;
	
	@Autowired(required = true)
	private EthnicGroupsDao ethnicGroupsDao;
	
	@Autowired(required = true)
	private TendersDao tendersDao;
	
	@Autowired(required = true)
	private TransactionTypesDao transactionTypesDao;
	
	@Autowired(required = true)
	private SignatoriesDao signatoriesDao;
	
	@Autowired(required = true)
	private ClauseMappingDao clauseMappingDao;
	
	@Autowired(required = true)
	private InventoryPricingDao inventoryPricingDao;
	
	@Autowired(required = true)
	private InventorySpecificationDao inventorySpecificationDao;
	
	@Autowired(required = true)
	private UomConversionDao uomConversionDao;
	
	@Autowired(required = true)
	private SupplierStatesDao supplierStatesDao;
	
	@Autowired(required = true)
	private ApprovalTemplatesDao approvalTemplatesDao;
	
	@Autowired(required = true)
	private TaskManagersDao taskManagersDao;
	
	@Autowired(required = true)
	private RequisitionDetailsDao requisitionDetailsDao;
	
	@Autowired(required = true)
	private TaskComparableRoutesDao taskComparableRoutesDao;
	
	@Autowired(required = true)
	private RoleRelationshipsDao roleRelationshipsDao;
	
	public SupplierMasterDao getSupplierMasterDao() {
		return supplierMasterDao;
	}

	public void setSupplierMasterDao(SupplierMasterDao supplierMasterDao) {
		this.supplierMasterDao = supplierMasterDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ApplicationRoleDao getApplicationRoleDao() {
		return applicationRoleDao;
	}

	public void setApplicationRoleDao(ApplicationRoleDao applicationRoleDao) {
		this.applicationRoleDao = applicationRoleDao;
	}

	public ApplicationUserRoleDao getApplicationUserRoleDao() {
		return applicationUserRoleDao;
	}

	public void setApplicationUserRoleDao(ApplicationUserRoleDao applicationUserRoleDao) {
		this.applicationUserRoleDao = applicationUserRoleDao;
	}

	public SupplierDao getSupplierDao() {
		return supplierDao;
	}

	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	}

	public ContractDetailsDao getContractDetailsDao() {
		return contractDetailsDao;
	}

	public void setContractDetailsDao(ContractDetailsDao contractDetailsDao) {
		this.contractDetailsDao = contractDetailsDao;
	}

	public SupplierEnquiryHeaderDao getSupplierEnquiryHeaderDao() {
		return supplierEnquiryHeaderDao;
	}

	public void setSupplierEnquiryHeaderDao(SupplierEnquiryHeaderDao supplierEnquiryHeaderDao) {
		this.supplierEnquiryHeaderDao = supplierEnquiryHeaderDao;
	}

	public SupplierCompliantHeaderDao getSupplierCompliantHeaderDao() {
		return supplierCompliantHeaderDao;
	}

	public void setSupplierCompliantHeaderDao(SupplierCompliantHeaderDao supplierCompliantHeaderDao) {
		this.supplierCompliantHeaderDao = supplierCompliantHeaderDao;
	}

	public IpwDao getIpwDao() {
		return ipwDao;
	}

	public void setIpwDao(IpwDao ipwDao) {
		this.ipwDao = ipwDao;
	}

	public SroDao getSroDao() {
		return sroDao;
	}

	public void setSroDao(SroDao sroDao) {
		this.sroDao = sroDao;
	}

	public EmailDao getEmailDao() {
		return emailDao;
	}

	public void setEmailDao(EmailDao emailDao) {
		this.emailDao = emailDao;
	}

	public CsdSupplierDao getCsdSupplierDao() {
		return csdSupplierDao;
	}

	public void setCsdSupplierDao(CsdSupplierDao csdSupplierDao) {
		this.csdSupplierDao = csdSupplierDao;
	}

	public SmsDao getSmsDao() {
		return smsDao;
	}

	public void setSmsDao(SmsDao smsDao) {
		this.smsDao = smsDao;
	}

	public SupplierCodesDao getSupplierCodesDao() {
		return supplierCodesDao;
	}

	public void setSupplierCodesDao(SupplierCodesDao supplierCodesDao) {
		this.supplierCodesDao = supplierCodesDao;
	}

	public AddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public AssociationsDao getAssociationsDao() {
		return associationsDao;
	}

	public void setAssociationsDao(AssociationsDao associationsDao) {
		this.associationsDao = associationsDao;
	}

	public BankAccountsDao getBankAccountsDao() {
		return bankAccountsDao;
	}

	public void setBankAccountsDao(BankAccountsDao bankAccountsDao) {
		this.bankAccountsDao = bankAccountsDao;
	}

	public BbbeeDao getBbbeeDao() {
		return bbbeeDao;
	}

	public void setBbbeeDao(BbbeeDao bbbeeDao) {
		this.bbbeeDao = bbbeeDao;
	}

	public ContactsDao getContactsDao() {
		return contactsDao;
	}

	public void setContactsDao(ContactsDao contactsDao) {
		this.contactsDao = contactsDao;
	}

	public DirectorsDao getDirectorsDao() {
		return directorsDao;
	}

	public void setDirectorsDao(DirectorsDao directorsDao) {
		this.directorsDao = directorsDao;
	}

	public SupplierIndustryClassificationsDao getSupplierIndustryClassificationsDao() {
		return supplierIndustryClassificationsDao;
	}

	public void setSupplierIndustryClassificationsDao(
			SupplierIndustryClassificationsDao supplierIndustryClassificationsDao) {
		this.supplierIndustryClassificationsDao = supplierIndustryClassificationsDao;
	}

	public TaxesDao getTaxesDao() {
		return taxesDao;
	}

	public void setTaxesDao(TaxesDao taxesDao) {
		this.taxesDao = taxesDao;
	}
	
	public InventoryDao getInventoryDao() {
		return inventoryDao;
	}

	public void setInventoryDao(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}

	public SupplierFlagsDao getSupplierFlagsDao() {
		return supplierFlagsDao;
	}

	public void setSupplierFlagsDao(SupplierFlagsDao supplierFlagsDao) {
		this.supplierFlagsDao = supplierFlagsDao;
	}

	public SupplierFlagDetailsDao getSupplierFlagDetailsDao() {
		return supplierFlagDetailsDao;
	}

	public void setSupplierFlagDetailsDao(SupplierFlagDetailsDao supplierFlagDetailsDao) {
		this.supplierFlagDetailsDao = supplierFlagDetailsDao;
	}

	public SupplierMasterWorkDao getSupplierMasterWorkDao() {
		return supplierMasterWorkDao;
	}

	public void setSupplierMasterWorkDao(SupplierMasterWorkDao supplierMasterWorkDao) {
		this.supplierMasterWorkDao = supplierMasterWorkDao;
	}

	public SupplierCodesWorkDao getSupplierCodesWorkDao() {
		return supplierCodesWorkDao;
	}

	public void setSupplierCodesWorkDao(SupplierCodesWorkDao supplierCodesWorkDao) {
		this.supplierCodesWorkDao = supplierCodesWorkDao;
	}

	public AccreditationBodiesDao getAccreditationBodiesDao() {
		return accreditationBodiesDao;
	}

	public void setAccreditationBodiesDao(AccreditationBodiesDao accreditationBodiesDao) {
		this.accreditationBodiesDao = accreditationBodiesDao;
	}

	public CommodityGroupsDao getCommodityGroupsDao() {
		return commodityGroupsDao;
	}

	public void setCommodityGroupsDao(CommodityGroupsDao commodityGroupsDao) {
		this.commodityGroupsDao = commodityGroupsDao;
	}

	public CommodityItemsDao getCommodityItemsDao() {
		return commodityItemsDao;
	}

	public void setCommodityItemsDao(CommodityItemsDao commodityItemsDao) {
		this.commodityItemsDao = commodityItemsDao;
	}

	public CommodityLocationsDao getCommodityLocationsDao() {
		return commodityLocationsDao;
	}

	public void setCommodityLocationsDao(CommodityLocationsDao commodityLocationsDao) {
		this.commodityLocationsDao = commodityLocationsDao;
	}

	public CommodityProvincesDao getCommodityProvincesDao() {
		return commodityProvincesDao;
	}

	public void setCommodityProvincesDao(CommodityProvincesDao commodityProvincesDao) {
		this.commodityProvincesDao = commodityProvincesDao;
	}

	public ContactTypeListDao getContactTypeListDao() {
		return contactTypeListDao;
	}

	public void setContactTypeListDao(ContactTypeListDao contactTypeListDao) {
		this.contactTypeListDao = contactTypeListDao;
	}

	public DirectorFlagsDao getDirectorFlagsDao() {
		return directorFlagsDao;
	}

	public void setDirectorFlagsDao(DirectorFlagsDao directorFlagsDao) {
		this.directorFlagsDao = directorFlagsDao;
	}

	public FundingContactsDao getFundingContactsDao() {
		return fundingContactsDao;
	}

	public void setFundingContactsDao(FundingContactsDao fundingContactsDao) {
		this.fundingContactsDao = fundingContactsDao;
	}

	public OwnershipNonNaturalDao getOwnershipNonNaturalDao() {
		return ownershipNonNaturalDao;
	}

	public void setOwnershipNonNaturalDao(OwnershipNonNaturalDao ownershipNonNaturalDao) {
		this.ownershipNonNaturalDao = ownershipNonNaturalDao;
	}

	public CededSupplierDao getCededSupplierDao() {
		return cededSupplierDao;
	}

	public void setCededSupplierDao(CededSupplierDao cededSupplierDao) {
		this.cededSupplierDao = cededSupplierDao;
	}

	public SupplierContactsDao getSupplierContactsDao() {
		return supplierContactsDao;
	}

	public void setSupplierContactsDao(SupplierContactsDao supplierContactsDao) {
		this.supplierContactsDao = supplierContactsDao;
	}

	public NextNumberByTransactionTypeDao getNextNumberByTransactionTypeDao() {
		return nextNumberByTransactionTypeDao;
	}

	public void setNextNumberByTransactionTypeDao(NextNumberByTransactionTypeDao nextNumberByTransactionTypeDao) {
		this.nextNumberByTransactionTypeDao = nextNumberByTransactionTypeDao;
	}

	public ContractMasterDao getContractMasterDao() {
		return contractMasterDao;
	}

	public void setContractMasterDao(ContractMasterDao contractMasterDao) {
		this.contractMasterDao = contractMasterDao;
	}

	public SupplierRotationTemplatesDao getSupplierRotationTemplatesDao() {
		return supplierRotationTemplatesDao;
	}

	public void setSupplierRotationTemplatesDao(SupplierRotationTemplatesDao supplierRotationTemplatesDao) {
		this.supplierRotationTemplatesDao = supplierRotationTemplatesDao;
	}

	public SupplierMarketDevelopmentDao getSupplierMarketDevelopmentDao() {
		return supplierMarketDevelopmentDao;
	}

	public void setSupplierMarketDevelopmentDao(SupplierMarketDevelopmentDao supplierMarketDevelopmentDao) {
		this.supplierMarketDevelopmentDao = supplierMarketDevelopmentDao;
	}

	public ContractStandardsDao getContractStandardsDao() {
		return contractStandardsDao;
	}

	public void setContractStandardsDao(ContractStandardsDao contractStandardsDao) {
		this.contractStandardsDao = contractStandardsDao;
	}

	public StandardAgreementDao getStandardAgreementDao() {
		return standardAgreementDao;
	}

	public void setStandardAgreementDao(StandardAgreementDao standardAgreementDao) {
		this.standardAgreementDao = standardAgreementDao;
	}

	public PriceBenchmarkDefinitionsDao getPriceBenchmarkDefinitionsDao() {
		return priceBenchmarkDefinitionsDao;
	}

	public void setPriceBenchmarkDefinitionsDao(PriceBenchmarkDefinitionsDao priceBenchmarkDefinitionsDao) {
		this.priceBenchmarkDefinitionsDao = priceBenchmarkDefinitionsDao;
	}

	public ContractNegotiationsDao getContractNegotiationsDao() {
		return contractNegotiationsDao;
	}

	public void setContractNegotiationsDao(ContractNegotiationsDao contractNegotiationsDao) {
		this.contractNegotiationsDao = contractNegotiationsDao;
	}

	public UserCodeDao getUserCodeDao() {
		return userCodeDao;
	}

	public void setUserCodeDao(UserCodeDao userCodeDao) {
		this.userCodeDao = userCodeDao;
	}

	public DocumentsDao getDocumentsDao() {
		return documentsDao;
	}

	public void setDocumentsDao(DocumentsDao documentsDao) {
		this.documentsDao = documentsDao;
	}

	public WorkflowsDao getWorkflowsDao() {
		return workflowsDao;
	}

	public void setWorkflowsDao(WorkflowsDao workflowsDao) {
		this.workflowsDao = workflowsDao;
	}
	
	public WarehouseDao getWarehouseDao() {
		return warehouseDao;
	}

	public void setWarehouseDao(WarehouseDao warehouseDao) {
		this.warehouseDao = warehouseDao;
	}

	public WarehouseInventoryDao getWarehouseInventoryDao() {
		return warehouseInventoryDao;
	}

	public void setWarehouseInventoryDao(WarehouseInventoryDao warehouseInventoryDao) {
		this.warehouseInventoryDao = warehouseInventoryDao;
	}

	public InventoryWarehouseDefaultsDao getInventoryWarehouseDefaultsDao() {
		return inventoryWarehouseDefaultsDao;
	}

	public void setInventoryWarehouseDefaultsDao(InventoryWarehouseDefaultsDao inventoryWarehouseDefaultsDao) {
		this.inventoryWarehouseDefaultsDao = inventoryWarehouseDefaultsDao;
	}

	public SupplierClassificationsDao getSupplierClassificationsDao() {
		return supplierClassificationsDao;
	}

	public void setSupplierClassificationsDao(SupplierClassificationsDao supplierClassificationsDao) {
		this.supplierClassificationsDao = supplierClassificationsDao;
	}

	public SupplierSubClassificationsDao getSupplierSubClassificationsDao() {
		return supplierSubClassificationsDao;
	}

	public void setSupplierSubClassificationsDao(SupplierSubClassificationsDao supplierSubClassificationsDao) {
		this.supplierSubClassificationsDao = supplierSubClassificationsDao;
	}

	public GovernmentTypesDao getGovernmentTypesDao() {
		return governmentTypesDao;
	}

	public void setGovernmentTypesDao(GovernmentTypesDao governmentTypesDao) {
		this.governmentTypesDao = governmentTypesDao;
	}

	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public IdTypesDao getIdTypesDao() {
		return idTypesDao;
	}

	public void setIdTypesDao(IdTypesDao idTypesDao) {
		this.idTypesDao = idTypesDao;
	}

	public BusinessStatusDao getBusinessStatusDao() {
		return businessStatusDao;
	}

	public void setBusinessStatusDao(BusinessStatusDao businessStatusDao) {
		this.businessStatusDao = businessStatusDao;
	}

	public AddressTypesDao getAddressTypesDao() {
		return addressTypesDao;
	}

	public void setAddressTypesDao(AddressTypesDao addressTypesDao) {
		this.addressTypesDao = addressTypesDao;
	}

	public CitiesDao getCitiesDao() {
		return citiesDao;
	}

	public void setCitiesDao(CitiesDao citiesDao) {
		this.citiesDao = citiesDao;
	}

	public DistrictsDao getDistrictsDao() {
		return districtsDao;
	}

	public void setDistrictsDao(DistrictsDao districtsDao) {
		this.districtsDao = districtsDao;
	}

	public MunicipalitiesDao getMunicipalitiesDao() {
		return municipalitiesDao;
	}

	public void setMunicipalitiesDao(MunicipalitiesDao municipalitiesDao) {
		this.municipalitiesDao = municipalitiesDao;
	}

	public ProvincesDao getProvincesDao() {
		return provincesDao;
	}

	public void setProvincesDao(ProvincesDao provincesDao) {
		this.provincesDao = provincesDao;
	}

	public SuburbsDao getSuburbsDao() {
		return suburbsDao;
	}

	public void setSuburbsDao(SuburbsDao suburbsDao) {
		this.suburbsDao = suburbsDao;
	}

	public WardsDao getWardsDao() {
		return wardsDao;
	}

	public void setWardsDao(WardsDao wardsDao) {
		this.wardsDao = wardsDao;
	}

	public BbbeeCertificateTypeDao getBbbeeCertificateTypeDao() {
		return bbbeeCertificateTypeDao;
	}

	public void setBbbeeCertificateTypeDao(BbbeeCertificateTypeDao bbbeeCertificateTypeDao) {
		this.bbbeeCertificateTypeDao = bbbeeCertificateTypeDao;
	}

	public BbbeeIrbaRegisteredAuditorsDao getBbbeeIrbaRegisteredAuditorsDao() {
		return bbbeeIrbaRegisteredAuditorsDao;
	}

	public void setBbbeeIrbaRegisteredAuditorsDao(BbbeeIrbaRegisteredAuditorsDao bbbeeIrbaRegisteredAuditorsDao) {
		this.bbbeeIrbaRegisteredAuditorsDao = bbbeeIrbaRegisteredAuditorsDao;
	}

	public BbbeeSanasVerificationAgenciesDao getBbbeeSanasVerificationAgenciesDao() {
		return bbbeeSanasVerificationAgenciesDao;
	}

	public void setBbbeeSanasVerificationAgenciesDao(BbbeeSanasVerificationAgenciesDao bbbeeSanasVerificationAgenciesDao) {
		this.bbbeeSanasVerificationAgenciesDao = bbbeeSanasVerificationAgenciesDao;
	}

	public SanasBbbeeVerificationAgenciesDao getSanasBbbeeVerificationAgenciesDao() {
		return sanasBbbeeVerificationAgenciesDao;
	}

	public void setSanasBbbeeVerificationAgenciesDao(SanasBbbeeVerificationAgenciesDao sanasBbbeeVerificationAgenciesDao) {
		this.sanasBbbeeVerificationAgenciesDao = sanasBbbeeVerificationAgenciesDao;
	}

	public BbbeeSectorChartersDao getBbbeeSectorChartersDao() {
		return bbbeeSectorChartersDao;
	}

	public void setBbbeeSectorChartersDao(BbbeeSectorChartersDao bbbeeSectorChartersDao) {
		this.bbbeeSectorChartersDao = bbbeeSectorChartersDao;
	}

	public BbbeeStatusLevelOfContributorsDao getBbbeeStatusLevelOfContributorsDao() {
		return bbbeeStatusLevelOfContributorsDao;
	}

	public void setBbbeeStatusLevelOfContributorsDao(BbbeeStatusLevelOfContributorsDao bbbeeStatusLevelOfContributorsDao) {
		this.bbbeeStatusLevelOfContributorsDao = bbbeeStatusLevelOfContributorsDao;
	}

	public TendersDao getTendersDao() {
		return tendersDao;
	}

	public void setTendersDao(TendersDao tendersDao) {
		this.tendersDao = tendersDao;
	}

	public SignatoriesDao getSignatoriesDao() {
		return signatoriesDao;
	}

	public void setSignatoriesDao(SignatoriesDao signatoriesDao) {
		this.signatoriesDao = signatoriesDao;
	}

	public ClauseMappingDao getClauseMappingDao() {
		return clauseMappingDao;
	}

	public void setClauseMappingDao(ClauseMappingDao clauseMappingDao) {
		this.clauseMappingDao = clauseMappingDao;
	}

	public InventoryPricingDao getInventoryPricingDao() {
		return inventoryPricingDao;
	}

	public void setInventoryPricingDao(InventoryPricingDao inventoryPricingDao) {
		this.inventoryPricingDao = inventoryPricingDao;
	}

	public InventorySpecificationDao getInventorySpecificationDao() {
		return inventorySpecificationDao;
	}

	public void setInventorySpecificationDao(InventorySpecificationDao inventorySpecificationDao) {
		this.inventorySpecificationDao = inventorySpecificationDao;
	}

	public UomConversionDao getUomConversionDao() {
		return uomConversionDao;
	}

	public void setUomConversionDao(UomConversionDao uomConversionDao) {
		this.uomConversionDao = uomConversionDao;
	}

	public BankVerificationStatusDao getBankVerificationStatusDao() {
		return bankVerificationStatusDao;
	}

	public void setBankVerificationStatusDao(BankVerificationStatusDao bankVerificationStatusDao) {
		this.bankVerificationStatusDao = bankVerificationStatusDao;
	}

	public BankAccountTypesDao getBankAccountTypesDao() {
		return bankAccountTypesDao;
	}

	public void setBankAccountTypesDao(BankAccountTypesDao bankAccountTypesDao) {
		this.bankAccountTypesDao = bankAccountTypesDao;
	}

	public BanksDao getBanksDao() {
		return banksDao;
	}

	public void setBanksDao(BanksDao banksDao) {
		this.banksDao = banksDao;
	}

	public DirectorStatusDao getDirectorStatusDao() {
		return directorStatusDao;
	}

	public void setDirectorStatusDao(DirectorStatusDao directorStatusDao) {
		this.directorStatusDao = directorStatusDao;
	}

	public SupplierStatesDao getSupplierStatesDao() {
		return supplierStatesDao;
	}

	public void setSupplierStatesDao(SupplierStatesDao supplierStatesDao) {
		this.supplierStatesDao = supplierStatesDao;
	}

	public BbbeeVerificationRegulatorsDao getBbbeeVerificationRegulatorsDao() {
		return bbbeeVerificationRegulatorsDao;
	}

	public void setBbbeeVerificationRegulatorsDao(BbbeeVerificationRegulatorsDao bbbeeVerificationRegulatorsDao) {
		this.bbbeeVerificationRegulatorsDao = bbbeeVerificationRegulatorsDao;
	}

	public EthnicGroupsDao getEthnicGroupsDao() {
		return ethnicGroupsDao;
	}

	public void setEthnicGroupsDao(EthnicGroupsDao ethnicGroupsDao) {
		this.ethnicGroupsDao = ethnicGroupsDao;
	}

	public TransactionTypesDao getTransactionTypesDao() {
		return transactionTypesDao;
	}

	public void setTransactionTypesDao(TransactionTypesDao transactionTypesDao) {
		this.transactionTypesDao = transactionTypesDao;
	}

	public ApprovalTemplatesDao getApprovalTemplatesDao() {
		return approvalTemplatesDao;
	}

	public void setApprovalTemplatesDao(ApprovalTemplatesDao approvalTemplatesDao) {
		this.approvalTemplatesDao = approvalTemplatesDao;
	}

	public TaskManagersDao getTaskManagersDao() {
		return taskManagersDao;
	}

	public void setTaskManagersDao(TaskManagersDao taskManagersDao) {
		this.taskManagersDao = taskManagersDao;
	}

	public RequisitionDetailsDao getRequisitionDetailsDao() {
		return requisitionDetailsDao;
	}

	public void setRequisitionDetailsDao(RequisitionDetailsDao requisitionDetailsDao) {
		this.requisitionDetailsDao = requisitionDetailsDao;
	}

	public TaskComparableRoutesDao getTaskComparableRoutesDao() {
		return taskComparableRoutesDao;
	}

	public void setTaskComparableRoutesDao(TaskComparableRoutesDao taskComparableRoutesDao) {
		this.taskComparableRoutesDao = taskComparableRoutesDao;
	}

	public RoleRelationshipsDao getRoleRelationshipsDao() {
		return roleRelationshipsDao;
	}

	public void setRoleRelationshipsDao(RoleRelationshipsDao roleRelationshipsDao) {
		this.roleRelationshipsDao = roleRelationshipsDao;
	}
	
}
