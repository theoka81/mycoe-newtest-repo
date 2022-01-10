package com.scm.modal;

public class SuppliersBean {
	
	private Long supplierId;
	private Long supplierMasterId;
	private Long supplierCodesId;
	private Long supplierCodesSupplierId;
	private String supplierMasterSupplierRefId;
	private String supplierMasterSupplierRefNo;
	private String supplierMasterSupplierXRef1;
	private String supplierMasterParentNo;
	private Long supplierMasterClusterId; // userCode1
	private Long supplierMasterCompanyId; // userCode2
	private Long supplierMasterDepartmentId; // userCode3
	private Long supplierMasterUnitId; // userCode12
	private Long supplierMasterStatusId; // userCode8
	private Long supplierMasterSupplierHoldId; // userCode10
	private Long supplierMasterSupplierTypeId; // userCode11
	private Long supplierMasterSupplierCodeId; // userCode9
	private Long supplierMasterPaymentTermsId; // userCode5
	private Long supplierMasterPaymentInstrumentId; // userCode4
	private Long supplierMasterPrintMessageId; // userCode6
	private Long supplierMasterRemitTypeId; // userCode7
	
	private Long supplierCodesCategoryCode1Id; //userCode11
	private Long supplierCodesCategoryCode2Id; //userCode13
	private Long supplierCodesCategoryCode3Id; //userCode14
	private Long supplierCodesCategoryCode4Id; //userCode15
	private Long supplierCodesCategoryCode5Id; //userCode16
	private Long supplierCodesCategoryCode6Id; //userCode17
	private Long supplierCodesCategoryCode7Id; //userCode18
	private Long supplierCodesCategoryCode8Id; //userCode19
	private Long supplierCodesCategoryCode9Id; //userCode20
	private Long supplierCodesCategoryCode10Id; //userCode1
	
	
	private String supplierMasterDeliveryInstructions;
	
	private String cededSupplierSupplierNumber;
	private String cededSupplierSupplierName;
	private String cededSupplierSupplierPostalAddress;
	private String cededSupplierSupplierPostalCode;
	private String cededSupplierSupplierFileReference;
	private String cededSupplierSupplierPaymentInstrument;
	private String cededSupplierAuthoriseUser;

	private String supplierMasterLastInvoiceDate;
	private String supplierMasterLastPaymentDate;

	private String cededSupplierSupplierStartDate;
	private String cededSupplierSupplierEndDate;
	private String cededSupplierAuthoriseDate;

	private String supplierInactiveDate;
	private String supplierRegistrationDate;
	private String supplierDateOperationsStarted;
	private String supplierBusinessStatusLastVerificationDate;
	private String supplierFinancialYearStartDate;

	private String bbbeeCertificateIssueDate;
	private String bbbeeCertificateExpiryDate;
	private String bbbeeCertificateSignDate;

	private String supplierNumber;
	private String legalName;
	private String supplierXref1 = "";
	private String supplierRefNo = "";
	private String saCompanyNumber;
	private String status = "";
	
	private boolean supplierIsActive;
	private String supplierInactiveReason;
	private Long supplierStateId;
	private boolean supplierIsAssociated;
	private Long supplierClassificationId;
	private Long supplierSubClassificationId;
	private Long supplierGovernmentTypeId;
	private Long supplierCountryOfOriginId;
	private Long supplierIdTypeId;
	private String supplierLegalName;
	private String supplierTradingName;
	private String supplierSaIdNumber;
	private String supplierForeignIdNumber;
	private String supplierForeignPassportNumber;
	private String supplierWorkPermitNumber;
	private String supplierSaCompanyNumber;
	private String supplierForeignCompanyRegistrationNumber;
	private String supplierSaTrustRegistrationNumber;
	private String supplierForeignTrustRegistrationNumber;
	private String supplierNonProfitOrganisationNumber;
	private boolean supplierHaveBankAccount;
	private Long supplierBusinessStatusId;
	private boolean supplierIsListedOnStockExchange;
	private boolean supplierIsOwnedByNaturalSAPerson;
	private Long supplierTotalAnnualTurnoverId;
	private Long bbbeeCertificateTypeId;
	private Long bbbeeVerificationRegulatorId;
	private String bbbeeCertificateNumber;
	private Long bbbeeStatusLevelOfContributorId;
	private String bbbeeBlackOwnership;
	private String bbbeeBlackWomanOwnership;
	private boolean bbbeeIsAcceptUnderstandAffidavid;
	private String bbbeeCertificateSignedBy;
	private Long bbbeeSectorCharterId;
	private boolean bbbeeValueAddingSupplier;
	private boolean bbbeeEmpoweringSupplier;
	private Long bbbeeIrbaRegisteredAuditor;
	private Long sanasBbbeeVerificationAgencyId;
	private String bbbeeOwnershipScore;
	private String bbbeeManagementControlScore;
	private String bbbeeEmploymentEquityScore;
	private String bbbeeSkillsDevelopmentScore;
	private String bbbeePreferentialProcurementScore;
	private String bbbeeEnterpriseDevelopmentScore;
	private String bbbeeSocioEconomicDevelopmentScore;
	private String bbbeeEnterpriseSupplierDevelopmentScore;
	private String bbbeeLandOwnershipScore;
	private String bbbeeEmpowermentFinancingScore;
	private String bbbeeAccessFinancialServicesScore;
	private String bbbeeEconomicDevelopmentScore;
	private String bbbeeForeignOwnershipScore;
	private String supplierContactSalesContactPerson;
	private String supplierContactSalesTelephoneNumber;
	private String supplierContactSalesFaxNumber;
	private String supplierContactSalesEmail;
	private String supplierContactQuoteFaxNumber;
	private String supplierContactQuoteEmail;
	private String supplierContactAccountsContactPerson;
	private String supplierContactAccountsTelephoneNumber;
	private String supplierContactAccountsFaxNumber;
	private String supplierContactAccountsEmail;
	
	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getSupplierXref1() {
		return supplierXref1;
	}

	public void setSupplierXref1(String supplierXref1) {
		this.supplierXref1 = supplierXref1;
	}

	public String getSupplierRefNo() {
		return supplierRefNo;
	}

	public void setSupplierRefNo(String supplierRefNo) {
		this.supplierRefNo = supplierRefNo;
	}

	public String getSaCompanyNumber() {
		return saCompanyNumber;
	}

	public void setSaCompanyNumber(String saCompanyNumber) {
		this.saCompanyNumber = saCompanyNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public Long getSupplierMasterId() {
		return supplierMasterId;
	}

	public void setSupplierMasterId(Long supplierMasterId) {
		this.supplierMasterId = supplierMasterId;
	}

	public Long getSupplierCodesId() {
		return supplierCodesId;
	}

	public void setSupplierCodesId(Long supplierCodesId) {
		this.supplierCodesId = supplierCodesId;
	}

	public Long getSupplierCodesSupplierId() {
		return supplierCodesSupplierId;
	}

	public void setSupplierCodesSupplierId(Long supplierCodesSupplierId) {
		this.supplierCodesSupplierId = supplierCodesSupplierId;
	}

	public String getSupplierMasterSupplierRefId() {
		return supplierMasterSupplierRefId;
	}

	public void setSupplierMasterSupplierRefId(String supplierMasterSupplierRefId) {
		this.supplierMasterSupplierRefId = supplierMasterSupplierRefId;
	}

	public String getSupplierMasterSupplierRefNo() {
		return supplierMasterSupplierRefNo;
	}

	public void setSupplierMasterSupplierRefNo(String supplierMasterSupplierRefNo) {
		this.supplierMasterSupplierRefNo = supplierMasterSupplierRefNo;
	}

	public String getSupplierMasterSupplierXRef1() {
		return supplierMasterSupplierXRef1;
	}

	public void setSupplierMasterSupplierXRef1(String supplierMasterSupplierXRef1) {
		this.supplierMasterSupplierXRef1 = supplierMasterSupplierXRef1;
	}

	public Long getSupplierMasterClusterId() {
		return supplierMasterClusterId;
	}

	public void setSupplierMasterClusterId(Long supplierMasterClusterId) {
		this.supplierMasterClusterId = supplierMasterClusterId;
	}

	public Long getSupplierMasterCompanyId() {
		return supplierMasterCompanyId;
	}

	public void setSupplierMasterCompanyId(Long supplierMasterCompanyId) {
		this.supplierMasterCompanyId = supplierMasterCompanyId;
	}

	public Long getSupplierMasterDepartmentId() {
		return supplierMasterDepartmentId;
	}

	public void setSupplierMasterDepartmentId(Long supplierMasterDepartmentId) {
		this.supplierMasterDepartmentId = supplierMasterDepartmentId;
	}

	public Long getSupplierMasterUnitId() {
		return supplierMasterUnitId;
	}

	public void setSupplierMasterUnitId(Long supplierMasterUnitId) {
		this.supplierMasterUnitId = supplierMasterUnitId;
	}

	public Long getSupplierMasterStatusId() {
		return supplierMasterStatusId;
	}

	public void setSupplierMasterStatusId(Long supplierMasterStatusId) {
		this.supplierMasterStatusId = supplierMasterStatusId;
	}

	public Long getSupplierMasterSupplierHoldId() {
		return supplierMasterSupplierHoldId;
	}

	public void setSupplierMasterSupplierHoldId(Long supplierMasterSupplierHoldId) {
		this.supplierMasterSupplierHoldId = supplierMasterSupplierHoldId;
	}

	public Long getSupplierMasterSupplierTypeId() {
		return supplierMasterSupplierTypeId;
	}

	public void setSupplierMasterSupplierTypeId(Long supplierMasterSupplierTypeId) {
		this.supplierMasterSupplierTypeId = supplierMasterSupplierTypeId;
	}

	public Long getSupplierMasterSupplierCodeId() {
		return supplierMasterSupplierCodeId;
	}

	public void setSupplierMasterSupplierCodeId(Long supplierMasterSupplierCodeId) {
		this.supplierMasterSupplierCodeId = supplierMasterSupplierCodeId;
	}

	public Long getSupplierMasterPaymentTermsId() {
		return supplierMasterPaymentTermsId;
	}

	public void setSupplierMasterPaymentTermsId(Long supplierMasterPaymentTermsId) {
		this.supplierMasterPaymentTermsId = supplierMasterPaymentTermsId;
	}

	public Long getSupplierMasterPaymentInstrumentId() {
		return supplierMasterPaymentInstrumentId;
	}

	public void setSupplierMasterPaymentInstrumentId(Long supplierMasterPaymentInstrumentId) {
		this.supplierMasterPaymentInstrumentId = supplierMasterPaymentInstrumentId;
	}

	public Long getSupplierMasterRemitTypeId() {
		return supplierMasterRemitTypeId;
	}

	public void setSupplierMasterRemitTypeId(Long supplierMasterRemitTypeId) {
		this.supplierMasterRemitTypeId = supplierMasterRemitTypeId;
	}

	public String getSupplierMasterLastInvoiceDate() {
		return supplierMasterLastInvoiceDate;
	}

	public void setSupplierMasterLastInvoiceDate(String supplierMasterLastInvoiceDate) {
		this.supplierMasterLastInvoiceDate = supplierMasterLastInvoiceDate;
	}

	public String getSupplierMasterLastPaymentDate() {
		return supplierMasterLastPaymentDate;
	}

	public void setSupplierMasterLastPaymentDate(String supplierMasterLastPaymentDate) {
		this.supplierMasterLastPaymentDate = supplierMasterLastPaymentDate;
	}

	public String getCededSupplierSupplierStartDate() {
		return cededSupplierSupplierStartDate;
	}

	public void setCededSupplierSupplierStartDate(String cededSupplierSupplierStartDate) {
		this.cededSupplierSupplierStartDate = cededSupplierSupplierStartDate;
	}

	public String getCededSupplierSupplierEndDate() {
		return cededSupplierSupplierEndDate;
	}

	public void setCededSupplierSupplierEndDate(String cededSupplierSupplierEndDate) {
		this.cededSupplierSupplierEndDate = cededSupplierSupplierEndDate;
	}

	public String getCededSupplierAuthoriseDate() {
		return cededSupplierAuthoriseDate;
	}

	public void setCededSupplierAuthoriseDate(String cededSupplierAuthoriseDate) {
		this.cededSupplierAuthoriseDate = cededSupplierAuthoriseDate;
	}

	public String getSupplierInactiveDate() {
		return supplierInactiveDate;
	}

	public void setSupplierInactiveDate(String supplierInactiveDate) {
		this.supplierInactiveDate = supplierInactiveDate;
	}

	public String getSupplierRegistrationDate() {
		return supplierRegistrationDate;
	}

	public void setSupplierRegistrationDate(String supplierRegistrationDate) {
		this.supplierRegistrationDate = supplierRegistrationDate;
	}

	public String getSupplierDateOperationsStarted() {
		return supplierDateOperationsStarted;
	}

	public void setSupplierDateOperationsStarted(String supplierDateOperationsStarted) {
		this.supplierDateOperationsStarted = supplierDateOperationsStarted;
	}

	public String getSupplierBusinessStatusLastVerificationDate() {
		return supplierBusinessStatusLastVerificationDate;
	}

	public void setSupplierBusinessStatusLastVerificationDate(String supplierBusinessStatusLastVerificationDate) {
		this.supplierBusinessStatusLastVerificationDate = supplierBusinessStatusLastVerificationDate;
	}

	public String getSupplierFinancialYearStartDate() {
		return supplierFinancialYearStartDate;
	}

	public void setSupplierFinancialYearStartDate(String supplierFinancialYearStartDate) {
		this.supplierFinancialYearStartDate = supplierFinancialYearStartDate;
	}

	public String getBbbeeCertificateIssueDate() {
		return bbbeeCertificateIssueDate;
	}

	public void setBbbeeCertificateIssueDate(String bbbeeCertificateIssueDate) {
		this.bbbeeCertificateIssueDate = bbbeeCertificateIssueDate;
	}

	public String getBbbeeCertificateExpiryDate() {
		return bbbeeCertificateExpiryDate;
	}

	public void setBbbeeCertificateExpiryDate(String bbbeeCertificateExpiryDate) {
		this.bbbeeCertificateExpiryDate = bbbeeCertificateExpiryDate;
	}

	public String getBbbeeCertificateSignDate() {
		return bbbeeCertificateSignDate;
	}

	public void setBbbeeCertificateSignDate(String bbbeeCertificateSignDate) {
		this.bbbeeCertificateSignDate = bbbeeCertificateSignDate;
	}

	public String getSupplierMasterParentNo() {
		return supplierMasterParentNo;
	}

	public void setSupplierMasterParentNo(String supplierMasterParentNo) {
		this.supplierMasterParentNo = supplierMasterParentNo;
	}

	public Long getSupplierMasterPrintMessageId() {
		return supplierMasterPrintMessageId;
	}

	public void setSupplierMasterPrintMessageId(Long supplierMasterPrintMessageId) {
		this.supplierMasterPrintMessageId = supplierMasterPrintMessageId;
	}

	public Long getSupplierCodesCategoryCode1Id() {
		return supplierCodesCategoryCode1Id;
	}

	public void setSupplierCodesCategoryCode1Id(Long supplierCodesCategoryCode1Id) {
		this.supplierCodesCategoryCode1Id = supplierCodesCategoryCode1Id;
	}

	public Long getSupplierCodesCategoryCode2Id() {
		return supplierCodesCategoryCode2Id;
	}

	public void setSupplierCodesCategoryCode2Id(Long supplierCodesCategoryCode2Id) {
		this.supplierCodesCategoryCode2Id = supplierCodesCategoryCode2Id;
	}

	public Long getSupplierCodesCategoryCode3Id() {
		return supplierCodesCategoryCode3Id;
	}

	public void setSupplierCodesCategoryCode3Id(Long supplierCodesCategoryCode3Id) {
		this.supplierCodesCategoryCode3Id = supplierCodesCategoryCode3Id;
	}

	public Long getSupplierCodesCategoryCode4Id() {
		return supplierCodesCategoryCode4Id;
	}

	public void setSupplierCodesCategoryCode4Id(Long supplierCodesCategoryCode4Id) {
		this.supplierCodesCategoryCode4Id = supplierCodesCategoryCode4Id;
	}

	public Long getSupplierCodesCategoryCode5Id() {
		return supplierCodesCategoryCode5Id;
	}

	public void setSupplierCodesCategoryCode5Id(Long supplierCodesCategoryCode5Id) {
		this.supplierCodesCategoryCode5Id = supplierCodesCategoryCode5Id;
	}

	public Long getSupplierCodesCategoryCode6Id() {
		return supplierCodesCategoryCode6Id;
	}

	public void setSupplierCodesCategoryCode6Id(Long supplierCodesCategoryCode6Id) {
		this.supplierCodesCategoryCode6Id = supplierCodesCategoryCode6Id;
	}

	public Long getSupplierCodesCategoryCode7Id() {
		return supplierCodesCategoryCode7Id;
	}

	public void setSupplierCodesCategoryCode7Id(Long supplierCodesCategoryCode7Id) {
		this.supplierCodesCategoryCode7Id = supplierCodesCategoryCode7Id;
	}

	public Long getSupplierCodesCategoryCode8Id() {
		return supplierCodesCategoryCode8Id;
	}

	public void setSupplierCodesCategoryCode8Id(Long supplierCodesCategoryCode8Id) {
		this.supplierCodesCategoryCode8Id = supplierCodesCategoryCode8Id;
	}

	public Long getSupplierCodesCategoryCode9Id() {
		return supplierCodesCategoryCode9Id;
	}

	public void setSupplierCodesCategoryCode9Id(Long supplierCodesCategoryCode9Id) {
		this.supplierCodesCategoryCode9Id = supplierCodesCategoryCode9Id;
	}

	public Long getSupplierCodesCategoryCode10Id() {
		return supplierCodesCategoryCode10Id;
	}

	public void setSupplierCodesCategoryCode10Id(Long supplierCodesCategoryCode10Id) {
		this.supplierCodesCategoryCode10Id = supplierCodesCategoryCode10Id;
	}

	public String getSupplierMasterDeliveryInstructions() {
		return supplierMasterDeliveryInstructions;
	}

	public void setSupplierMasterDeliveryInstructions(String supplierMasterDeliveryInstructions) {
		this.supplierMasterDeliveryInstructions = supplierMasterDeliveryInstructions;
	}

	public String getCededSupplierSupplierNumber() {
		return cededSupplierSupplierNumber;
	}

	public void setCededSupplierSupplierNumber(String cededSupplierSupplierNumber) {
		this.cededSupplierSupplierNumber = cededSupplierSupplierNumber;
	}

	public String getCededSupplierSupplierName() {
		return cededSupplierSupplierName;
	}

	public void setCededSupplierSupplierName(String cededSupplierSupplierName) {
		this.cededSupplierSupplierName = cededSupplierSupplierName;
	}

	public String getCededSupplierSupplierPostalAddress() {
		return cededSupplierSupplierPostalAddress;
	}

	public void setCededSupplierSupplierPostalAddress(String cededSupplierSupplierPostalAddress) {
		this.cededSupplierSupplierPostalAddress = cededSupplierSupplierPostalAddress;
	}

	public String getCededSupplierSupplierPostalCode() {
		return cededSupplierSupplierPostalCode;
	}

	public void setCededSupplierSupplierPostalCode(String cededSupplierSupplierPostalCode) {
		this.cededSupplierSupplierPostalCode = cededSupplierSupplierPostalCode;
	}

	public String getCededSupplierSupplierFileReference() {
		return cededSupplierSupplierFileReference;
	}

	public void setCededSupplierSupplierFileReference(String cededSupplierSupplierFileReference) {
		this.cededSupplierSupplierFileReference = cededSupplierSupplierFileReference;
	}

	public String getCededSupplierSupplierPaymentInstrument() {
		return cededSupplierSupplierPaymentInstrument;
	}

	public void setCededSupplierSupplierPaymentInstrument(String cededSupplierSupplierPaymentInstrument) {
		this.cededSupplierSupplierPaymentInstrument = cededSupplierSupplierPaymentInstrument;
	}

	public String getCededSupplierAuthoriseUser() {
		return cededSupplierAuthoriseUser;
	}

	public void setCededSupplierAuthoriseUser(String cededSupplierAuthoriseUser) {
		this.cededSupplierAuthoriseUser = cededSupplierAuthoriseUser;
	}

	public boolean isSupplierIsActive() {
		return supplierIsActive;
	}

	public void setSupplierIsActive(boolean supplierIsActive) {
		this.supplierIsActive = supplierIsActive;
	}

	public String getSupplierInactiveReason() {
		return supplierInactiveReason;
	}

	public void setSupplierInactiveReason(String supplierInactiveReason) {
		this.supplierInactiveReason = supplierInactiveReason;
	}

	public Long getSupplierStateId() {
		return supplierStateId;
	}

	public void setSupplierStateId(Long supplierStateId) {
		this.supplierStateId = supplierStateId;
	}

	public boolean isSupplierIsAssociated() {
		return supplierIsAssociated;
	}

	public void setSupplierIsAssociated(boolean supplierIsAssociated) {
		this.supplierIsAssociated = supplierIsAssociated;
	}

	public Long getSupplierClassificationId() {
		return supplierClassificationId;
	}

	public void setSupplierClassificationId(Long supplierClassificationId) {
		this.supplierClassificationId = supplierClassificationId;
	}

	public Long getSupplierSubClassificationId() {
		return supplierSubClassificationId;
	}

	public void setSupplierSubClassificationId(Long supplierSubClassificationId) {
		this.supplierSubClassificationId = supplierSubClassificationId;
	}

	public Long getSupplierGovernmentTypeId() {
		return supplierGovernmentTypeId;
	}

	public void setSupplierGovernmentTypeId(Long supplierGovernmentTypeId) {
		this.supplierGovernmentTypeId = supplierGovernmentTypeId;
	}

	public Long getSupplierCountryOfOriginId() {
		return supplierCountryOfOriginId;
	}

	public void setSupplierCountryOfOriginId(Long supplierCountryOfOriginId) {
		this.supplierCountryOfOriginId = supplierCountryOfOriginId;
	}

	public Long getSupplierIdTypeId() {
		return supplierIdTypeId;
	}

	public void setSupplierIdTypeId(Long supplierIdTypeId) {
		this.supplierIdTypeId = supplierIdTypeId;
	}

	public String getSupplierLegalName() {
		return supplierLegalName;
	}

	public void setSupplierLegalName(String supplierLegalName) {
		this.supplierLegalName = supplierLegalName;
	}

	public String getSupplierTradingName() {
		return supplierTradingName;
	}

	public void setSupplierTradingName(String supplierTradingName) {
		this.supplierTradingName = supplierTradingName;
	}

	public String getSupplierSaIdNumber() {
		return supplierSaIdNumber;
	}

	public void setSupplierSaIdNumber(String supplierSaIdNumber) {
		this.supplierSaIdNumber = supplierSaIdNumber;
	}

	public String getSupplierForeignIdNumber() {
		return supplierForeignIdNumber;
	}

	public void setSupplierForeignIdNumber(String supplierForeignIdNumber) {
		this.supplierForeignIdNumber = supplierForeignIdNumber;
	}

	public String getSupplierForeignPassportNumber() {
		return supplierForeignPassportNumber;
	}

	public void setSupplierForeignPassportNumber(String supplierForeignPassportNumber) {
		this.supplierForeignPassportNumber = supplierForeignPassportNumber;
	}

	public String getSupplierWorkPermitNumber() {
		return supplierWorkPermitNumber;
	}

	public void setSupplierWorkPermitNumber(String supplierWorkPermitNumber) {
		this.supplierWorkPermitNumber = supplierWorkPermitNumber;
	}

	public String getSupplierSaCompanyNumber() {
		return supplierSaCompanyNumber;
	}

	public void setSupplierSaCompanyNumber(String supplierSaCompanyNumber) {
		this.supplierSaCompanyNumber = supplierSaCompanyNumber;
	}

	public String getSupplierForeignCompanyRegistrationNumber() {
		return supplierForeignCompanyRegistrationNumber;
	}

	public void setSupplierForeignCompanyRegistrationNumber(String supplierForeignCompanyRegistrationNumber) {
		this.supplierForeignCompanyRegistrationNumber = supplierForeignCompanyRegistrationNumber;
	}

	public String getSupplierSaTrustRegistrationNumber() {
		return supplierSaTrustRegistrationNumber;
	}

	public void setSupplierSaTrustRegistrationNumber(String supplierSaTrustRegistrationNumber) {
		this.supplierSaTrustRegistrationNumber = supplierSaTrustRegistrationNumber;
	}

	public String getSupplierForeignTrustRegistrationNumber() {
		return supplierForeignTrustRegistrationNumber;
	}

	public void setSupplierForeignTrustRegistrationNumber(String supplierForeignTrustRegistrationNumber) {
		this.supplierForeignTrustRegistrationNumber = supplierForeignTrustRegistrationNumber;
	}

	public String getSupplierNonProfitOrganisationNumber() {
		return supplierNonProfitOrganisationNumber;
	}

	public void setSupplierNonProfitOrganisationNumber(String supplierNonProfitOrganisationNumber) {
		this.supplierNonProfitOrganisationNumber = supplierNonProfitOrganisationNumber;
	}

	public boolean isSupplierHaveBankAccount() {
		return supplierHaveBankAccount;
	}

	public void setSupplierHaveBankAccount(boolean supplierHaveBankAccount) {
		this.supplierHaveBankAccount = supplierHaveBankAccount;
	}

	public Long getSupplierBusinessStatusId() {
		return supplierBusinessStatusId;
	}

	public void setSupplierBusinessStatusId(Long supplierBusinessStatusId) {
		this.supplierBusinessStatusId = supplierBusinessStatusId;
	}

	public boolean isSupplierIsListedOnStockExchange() {
		return supplierIsListedOnStockExchange;
	}

	public void setSupplierIsListedOnStockExchange(boolean supplierIsListedOnStockExchange) {
		this.supplierIsListedOnStockExchange = supplierIsListedOnStockExchange;
	}

	public boolean isSupplierIsOwnedByNaturalSAPerson() {
		return supplierIsOwnedByNaturalSAPerson;
	}

	public void setSupplierIsOwnedByNaturalSAPerson(boolean supplierIsOwnedByNaturalSAPerson) {
		this.supplierIsOwnedByNaturalSAPerson = supplierIsOwnedByNaturalSAPerson;
	}

	public Long getSupplierTotalAnnualTurnoverId() {
		return supplierTotalAnnualTurnoverId;
	}

	public void setSupplierTotalAnnualTurnoverId(Long supplierTotalAnnualTurnoverId) {
		this.supplierTotalAnnualTurnoverId = supplierTotalAnnualTurnoverId;
	}

	public Long getBbbeeCertificateTypeId() {
		return bbbeeCertificateTypeId;
	}

	public void setBbbeeCertificateTypeId(Long bbbeeCertificateTypeId) {
		this.bbbeeCertificateTypeId = bbbeeCertificateTypeId;
	}

	public Long getBbbeeVerificationRegulatorId() {
		return bbbeeVerificationRegulatorId;
	}

	public void setBbbeeVerificationRegulatorId(Long bbbeeVerificationRegulatorId) {
		this.bbbeeVerificationRegulatorId = bbbeeVerificationRegulatorId;
	}

	public String getBbbeeCertificateNumber() {
		return bbbeeCertificateNumber;
	}

	public void setBbbeeCertificateNumber(String bbbeeCertificateNumber) {
		this.bbbeeCertificateNumber = bbbeeCertificateNumber;
	}

	public Long getBbbeeStatusLevelOfContributorId() {
		return bbbeeStatusLevelOfContributorId;
	}

	public void setBbbeeStatusLevelOfContributorId(Long bbbeeStatusLevelOfContributorId) {
		this.bbbeeStatusLevelOfContributorId = bbbeeStatusLevelOfContributorId;
	}

	public String getBbbeeBlackOwnership() {
		return bbbeeBlackOwnership;
	}

	public void setBbbeeBlackOwnership(String bbbeeBlackOwnership) {
		this.bbbeeBlackOwnership = bbbeeBlackOwnership;
	}

	public String getBbbeeBlackWomanOwnership() {
		return bbbeeBlackWomanOwnership;
	}

	public void setBbbeeBlackWomanOwnership(String bbbeeBlackWomanOwnership) {
		this.bbbeeBlackWomanOwnership = bbbeeBlackWomanOwnership;
	}

	public boolean isBbbeeIsAcceptUnderstandAffidavid() {
		return bbbeeIsAcceptUnderstandAffidavid;
	}

	public void setBbbeeIsAcceptUnderstandAffidavid(boolean bbbeeIsAcceptUnderstandAffidavid) {
		this.bbbeeIsAcceptUnderstandAffidavid = bbbeeIsAcceptUnderstandAffidavid;
	}

	public String getBbbeeCertificateSignedBy() {
		return bbbeeCertificateSignedBy;
	}

	public void setBbbeeCertificateSignedBy(String bbbeeCertificateSignedBy) {
		this.bbbeeCertificateSignedBy = bbbeeCertificateSignedBy;
	}

	public Long getBbbeeSectorCharterId() {
		return bbbeeSectorCharterId;
	}

	public void setBbbeeSectorCharterId(Long bbbeeSectorCharterId) {
		this.bbbeeSectorCharterId = bbbeeSectorCharterId;
	}

	public boolean isBbbeeValueAddingSupplier() {
		return bbbeeValueAddingSupplier;
	}

	public void setBbbeeValueAddingSupplier(boolean bbbeeValueAddingSupplier) {
		this.bbbeeValueAddingSupplier = bbbeeValueAddingSupplier;
	}

	public boolean isBbbeeEmpoweringSupplier() {
		return bbbeeEmpoweringSupplier;
	}

	public void setBbbeeEmpoweringSupplier(boolean bbbeeEmpoweringSupplier) {
		this.bbbeeEmpoweringSupplier = bbbeeEmpoweringSupplier;
	}

	public Long getBbbeeIrbaRegisteredAuditor() {
		return bbbeeIrbaRegisteredAuditor;
	}

	public void setBbbeeIrbaRegisteredAuditor(Long bbbeeIrbaRegisteredAuditor) {
		this.bbbeeIrbaRegisteredAuditor = bbbeeIrbaRegisteredAuditor;
	}

	public Long getSanasBbbeeVerificationAgencyId() {
		return sanasBbbeeVerificationAgencyId;
	}

	public void setSanasBbbeeVerificationAgencyId(Long sanasBbbeeVerificationAgencyId) {
		this.sanasBbbeeVerificationAgencyId = sanasBbbeeVerificationAgencyId;
	}

	public String getBbbeeOwnershipScore() {
		return bbbeeOwnershipScore;
	}

	public void setBbbeeOwnershipScore(String bbbeeOwnershipScore) {
		this.bbbeeOwnershipScore = bbbeeOwnershipScore;
	}

	public String getBbbeeManagementControlScore() {
		return bbbeeManagementControlScore;
	}

	public void setBbbeeManagementControlScore(String bbbeeManagementControlScore) {
		this.bbbeeManagementControlScore = bbbeeManagementControlScore;
	}

	public String getBbbeeEmploymentEquityScore() {
		return bbbeeEmploymentEquityScore;
	}

	public void setBbbeeEmploymentEquityScore(String bbbeeEmploymentEquityScore) {
		this.bbbeeEmploymentEquityScore = bbbeeEmploymentEquityScore;
	}

	public String getBbbeeSkillsDevelopmentScore() {
		return bbbeeSkillsDevelopmentScore;
	}

	public void setBbbeeSkillsDevelopmentScore(String bbbeeSkillsDevelopmentScore) {
		this.bbbeeSkillsDevelopmentScore = bbbeeSkillsDevelopmentScore;
	}

	public String getBbbeePreferentialProcurementScore() {
		return bbbeePreferentialProcurementScore;
	}

	public void setBbbeePreferentialProcurementScore(String bbbeePreferentialProcurementScore) {
		this.bbbeePreferentialProcurementScore = bbbeePreferentialProcurementScore;
	}

	public String getBbbeeEnterpriseDevelopmentScore() {
		return bbbeeEnterpriseDevelopmentScore;
	}

	public void setBbbeeEnterpriseDevelopmentScore(String bbbeeEnterpriseDevelopmentScore) {
		this.bbbeeEnterpriseDevelopmentScore = bbbeeEnterpriseDevelopmentScore;
	}

	public String getBbbeeSocioEconomicDevelopmentScore() {
		return bbbeeSocioEconomicDevelopmentScore;
	}

	public void setBbbeeSocioEconomicDevelopmentScore(String bbbeeSocioEconomicDevelopmentScore) {
		this.bbbeeSocioEconomicDevelopmentScore = bbbeeSocioEconomicDevelopmentScore;
	}

	public String getBbbeeEnterpriseSupplierDevelopmentScore() {
		return bbbeeEnterpriseSupplierDevelopmentScore;
	}

	public void setBbbeeEnterpriseSupplierDevelopmentScore(String bbbeeEnterpriseSupplierDevelopmentScore) {
		this.bbbeeEnterpriseSupplierDevelopmentScore = bbbeeEnterpriseSupplierDevelopmentScore;
	}

	public String getBbbeeLandOwnershipScore() {
		return bbbeeLandOwnershipScore;
	}

	public void setBbbeeLandOwnershipScore(String bbbeeLandOwnershipScore) {
		this.bbbeeLandOwnershipScore = bbbeeLandOwnershipScore;
	}

	public String getBbbeeEmpowermentFinancingScore() {
		return bbbeeEmpowermentFinancingScore;
	}

	public void setBbbeeEmpowermentFinancingScore(String bbbeeEmpowermentFinancingScore) {
		this.bbbeeEmpowermentFinancingScore = bbbeeEmpowermentFinancingScore;
	}

	public String getBbbeeAccessFinancialServicesScore() {
		return bbbeeAccessFinancialServicesScore;
	}

	public void setBbbeeAccessFinancialServicesScore(String bbbeeAccessFinancialServicesScore) {
		this.bbbeeAccessFinancialServicesScore = bbbeeAccessFinancialServicesScore;
	}

	public String getBbbeeEconomicDevelopmentScore() {
		return bbbeeEconomicDevelopmentScore;
	}

	public void setBbbeeEconomicDevelopmentScore(String bbbeeEconomicDevelopmentScore) {
		this.bbbeeEconomicDevelopmentScore = bbbeeEconomicDevelopmentScore;
	}

	public String getBbbeeForeignOwnershipScore() {
		return bbbeeForeignOwnershipScore;
	}

	public void setBbbeeForeignOwnershipScore(String bbbeeForeignOwnershipScore) {
		this.bbbeeForeignOwnershipScore = bbbeeForeignOwnershipScore;
	}

	public String getSupplierContactSalesContactPerson() {
		return supplierContactSalesContactPerson;
	}

	public void setSupplierContactSalesContactPerson(String supplierContactSalesContactPerson) {
		this.supplierContactSalesContactPerson = supplierContactSalesContactPerson;
	}

	public String getSupplierContactSalesTelephoneNumber() {
		return supplierContactSalesTelephoneNumber;
	}

	public void setSupplierContactSalesTelephoneNumber(String supplierContactSalesTelephoneNumber) {
		this.supplierContactSalesTelephoneNumber = supplierContactSalesTelephoneNumber;
	}

	public String getSupplierContactSalesFaxNumber() {
		return supplierContactSalesFaxNumber;
	}

	public void setSupplierContactSalesFaxNumber(String supplierContactSalesFaxNumber) {
		this.supplierContactSalesFaxNumber = supplierContactSalesFaxNumber;
	}

	public String getSupplierContactSalesEmail() {
		return supplierContactSalesEmail;
	}

	public void setSupplierContactSalesEmail(String supplierContactSalesEmail) {
		this.supplierContactSalesEmail = supplierContactSalesEmail;
	}

	public String getSupplierContactQuoteFaxNumber() {
		return supplierContactQuoteFaxNumber;
	}

	public void setSupplierContactQuoteFaxNumber(String supplierContactQuoteFaxNumber) {
		this.supplierContactQuoteFaxNumber = supplierContactQuoteFaxNumber;
	}

	public String getSupplierContactQuoteEmail() {
		return supplierContactQuoteEmail;
	}

	public void setSupplierContactQuoteEmail(String supplierContactQuoteEmail) {
		this.supplierContactQuoteEmail = supplierContactQuoteEmail;
	}

	public String getSupplierContactAccountsContactPerson() {
		return supplierContactAccountsContactPerson;
	}

	public void setSupplierContactAccountsContactPerson(String supplierContactAccountsContactPerson) {
		this.supplierContactAccountsContactPerson = supplierContactAccountsContactPerson;
	}

	public String getSupplierContactAccountsTelephoneNumber() {
		return supplierContactAccountsTelephoneNumber;
	}

	public void setSupplierContactAccountsTelephoneNumber(String supplierContactAccountsTelephoneNumber) {
		this.supplierContactAccountsTelephoneNumber = supplierContactAccountsTelephoneNumber;
	}

	public String getSupplierContactAccountsFaxNumber() {
		return supplierContactAccountsFaxNumber;
	}

	public void setSupplierContactAccountsFaxNumber(String supplierContactAccountsFaxNumber) {
		this.supplierContactAccountsFaxNumber = supplierContactAccountsFaxNumber;
	}

	public String getSupplierContactAccountsEmail() {
		return supplierContactAccountsEmail;
	}

	public void setSupplierContactAccountsEmail(String supplierContactAccountsEmail) {
		this.supplierContactAccountsEmail = supplierContactAccountsEmail;
	}


}
