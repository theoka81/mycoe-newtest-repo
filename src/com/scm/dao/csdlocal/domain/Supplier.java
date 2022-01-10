package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Suppliers database table.
 * 
 */
@Entity
@Table(name="Suppliers")
@NamedQuery(name="Supplier.findAll", query="SELECT s FROM Supplier s")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="BusinessStatusCode")
	private String businessStatusCode;

	@Column(name="BusinessStatusId")
	private int businessStatusId;

	@Column(name="BusinessStatusLastVerificationDate")
	private Timestamp businessStatusLastVerificationDate;

	@Column(name="CountryOfOriginCode")
	private String countryOfOriginCode;

	@Column(name="CountryOfOriginId")
	private int countryOfOriginId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="DateOperationsStarted")
	private Timestamp dateOperationsStarted;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="FinancialYearStartDate")
	private Timestamp financialYearStartDate;

	@Column(name="ForeignCompanyRegistrationNumber")
	private String foreignCompanyRegistrationNumber;

	@Column(name="ForeignIdNumber")
	private String foreignIdNumber;

	@Column(name="ForeignPassportNumber")
	private String foreignPassportNumber;

	@Column(name="ForeignTrustRegistrationNumber")
	private String foreignTrustRegistrationNumber;

	@Column(name="GovernmentTypeCode")
	private String governmentTypeCode;

	@Column(name="GovernmentTypeId")
	private int governmentTypeId;

	@Column(name="HaveBankAccount")
	private boolean haveBankAccount;

	@Column(name="IdTypeCode")
	private String idTypeCode;

	@Column(name="IdTypeId")
	private int idTypeId;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsAssociated")
	private boolean isAssociated;

	@Column(name="IsListedOnStockExchange")
	private boolean isListedOnStockExchange;

	@Column(name="IsOwnedByNaturalSAPerson")
	private boolean isOwnedByNaturalSAPerson;

	@Column(name="LegalName")
	private String legalName;

	@Column(name="NonProfitOrganisationNumber")
	private String nonProfitOrganisationNumber;

	@Column(name="OosIdNumber")
	private String oosIdNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RegistrationDate")
	private Timestamp registrationDate;

	@Column(name="SaCompanyNumber")
	private String saCompanyNumber;

	@Column(name="SaIdNumber")
	private String saIdNumber;

	@Column(name="SaTrustRegistrationNumber")
	private String saTrustRegistrationNumber;

	@Column(name="SupplierInactiveDate")
	private Timestamp supplierInactiveDate;

	@Column(name="SupplierInactiveReason")
	private String supplierInactiveReason;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="SupplierStateCode")
	private String supplierStateCode;

	@Column(name="SupplierStateId")
	private int supplierStateId;

	@Column(name="SupplierSubTypeCode")
	private String supplierSubTypeCode;

	@Column(name="SupplierSubTypeId")
	private int supplierSubTypeId;

	@Column(name="SupplierTypeCode")
	private String supplierTypeCode;

	@Column(name="SupplierTypeId")
	private int supplierTypeId;

	@Column(name="TotalAnnualTurnoverCode")
	private String totalAnnualTurnoverCode;

	@Column(name="TotalAnnualTurnoverId")
	private int totalAnnualTurnoverId;

	@Column(name="TradingName")
	private String tradingName;

	@Column(name="UniqueRegistrationReferenceNumber")
	private String uniqueRegistrationReferenceNumber;

	@Column(name="WorkPermitNumber")
	private String workPermitNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Supplier() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusinessStatusCode() {
		return this.businessStatusCode;
	}

	public void setBusinessStatusCode(String businessStatusCode) {
		this.businessStatusCode = businessStatusCode;
	}

	public int getBusinessStatusId() {
		return this.businessStatusId;
	}

	public void setBusinessStatusId(int businessStatusId) {
		this.businessStatusId = businessStatusId;
	}

	public Timestamp getBusinessStatusLastVerificationDate() {
		return this.businessStatusLastVerificationDate;
	}

	public void setBusinessStatusLastVerificationDate(Timestamp businessStatusLastVerificationDate) {
		this.businessStatusLastVerificationDate = businessStatusLastVerificationDate;
	}

	public String getCountryOfOriginCode() {
		return this.countryOfOriginCode;
	}

	public void setCountryOfOriginCode(String countryOfOriginCode) {
		this.countryOfOriginCode = countryOfOriginCode;
	}

	public int getCountryOfOriginId() {
		return this.countryOfOriginId;
	}

	public void setCountryOfOriginId(int countryOfOriginId) {
		this.countryOfOriginId = countryOfOriginId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getDateOperationsStarted() {
		return this.dateOperationsStarted;
	}

	public void setDateOperationsStarted(Timestamp dateOperationsStarted) {
		this.dateOperationsStarted = dateOperationsStarted;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public Timestamp getFinancialYearStartDate() {
		return this.financialYearStartDate;
	}

	public void setFinancialYearStartDate(Timestamp financialYearStartDate) {
		this.financialYearStartDate = financialYearStartDate;
	}

	public String getForeignCompanyRegistrationNumber() {
		return this.foreignCompanyRegistrationNumber;
	}

	public void setForeignCompanyRegistrationNumber(String foreignCompanyRegistrationNumber) {
		this.foreignCompanyRegistrationNumber = foreignCompanyRegistrationNumber;
	}

	public String getForeignIdNumber() {
		return this.foreignIdNumber;
	}

	public void setForeignIdNumber(String foreignIdNumber) {
		this.foreignIdNumber = foreignIdNumber;
	}

	public String getForeignPassportNumber() {
		return this.foreignPassportNumber;
	}

	public void setForeignPassportNumber(String foreignPassportNumber) {
		this.foreignPassportNumber = foreignPassportNumber;
	}

	public String getForeignTrustRegistrationNumber() {
		return this.foreignTrustRegistrationNumber;
	}

	public void setForeignTrustRegistrationNumber(String foreignTrustRegistrationNumber) {
		this.foreignTrustRegistrationNumber = foreignTrustRegistrationNumber;
	}

	public String getGovernmentTypeCode() {
		return this.governmentTypeCode;
	}

	public void setGovernmentTypeCode(String governmentTypeCode) {
		this.governmentTypeCode = governmentTypeCode;
	}

	public int getGovernmentTypeId() {
		return this.governmentTypeId;
	}

	public void setGovernmentTypeId(int governmentTypeId) {
		this.governmentTypeId = governmentTypeId;
	}

	public boolean getHaveBankAccount() {
		return this.haveBankAccount;
	}

	public void setHaveBankAccount(boolean haveBankAccount) {
		this.haveBankAccount = haveBankAccount;
	}

	public String getIdTypeCode() {
		return this.idTypeCode;
	}

	public void setIdTypeCode(String idTypeCode) {
		this.idTypeCode = idTypeCode;
	}

	public int getIdTypeId() {
		return this.idTypeId;
	}

	public void setIdTypeId(int idTypeId) {
		this.idTypeId = idTypeId;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsAssociated() {
		return this.isAssociated;
	}

	public void setIsAssociated(boolean isAssociated) {
		this.isAssociated = isAssociated;
	}

	public boolean getIsListedOnStockExchange() {
		return this.isListedOnStockExchange;
	}

	public void setIsListedOnStockExchange(boolean isListedOnStockExchange) {
		this.isListedOnStockExchange = isListedOnStockExchange;
	}

	public boolean getIsOwnedByNaturalSAPerson() {
		return this.isOwnedByNaturalSAPerson;
	}

	public void setIsOwnedByNaturalSAPerson(boolean isOwnedByNaturalSAPerson) {
		this.isOwnedByNaturalSAPerson = isOwnedByNaturalSAPerson;
	}

	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getNonProfitOrganisationNumber() {
		return this.nonProfitOrganisationNumber;
	}

	public void setNonProfitOrganisationNumber(String nonProfitOrganisationNumber) {
		this.nonProfitOrganisationNumber = nonProfitOrganisationNumber;
	}

	public String getOosIdNumber() {
		return this.oosIdNumber;
	}

	public void setOosIdNumber(String oosIdNumber) {
		this.oosIdNumber = oosIdNumber;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Timestamp getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getSaCompanyNumber() {
		return this.saCompanyNumber;
	}

	public void setSaCompanyNumber(String saCompanyNumber) {
		this.saCompanyNumber = saCompanyNumber;
	}

	public String getSaIdNumber() {
		return this.saIdNumber;
	}

	public void setSaIdNumber(String saIdNumber) {
		this.saIdNumber = saIdNumber;
	}

	public String getSaTrustRegistrationNumber() {
		return this.saTrustRegistrationNumber;
	}

	public void setSaTrustRegistrationNumber(String saTrustRegistrationNumber) {
		this.saTrustRegistrationNumber = saTrustRegistrationNumber;
	}

	public Timestamp getSupplierInactiveDate() {
		return this.supplierInactiveDate;
	}

	public void setSupplierInactiveDate(Timestamp supplierInactiveDate) {
		this.supplierInactiveDate = supplierInactiveDate;
	}

	public String getSupplierInactiveReason() {
		return this.supplierInactiveReason;
	}

	public void setSupplierInactiveReason(String supplierInactiveReason) {
		this.supplierInactiveReason = supplierInactiveReason;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getSupplierStateCode() {
		return this.supplierStateCode;
	}

	public void setSupplierStateCode(String supplierStateCode) {
		this.supplierStateCode = supplierStateCode;
	}

	public int getSupplierStateId() {
		return this.supplierStateId;
	}

	public void setSupplierStateId(int supplierStateId) {
		this.supplierStateId = supplierStateId;
	}

	public String getSupplierSubTypeCode() {
		return this.supplierSubTypeCode;
	}

	public void setSupplierSubTypeCode(String supplierSubTypeCode) {
		this.supplierSubTypeCode = supplierSubTypeCode;
	}

	public int getSupplierSubTypeId() {
		return this.supplierSubTypeId;
	}

	public void setSupplierSubTypeId(int supplierSubTypeId) {
		this.supplierSubTypeId = supplierSubTypeId;
	}

	public String getSupplierTypeCode() {
		return this.supplierTypeCode;
	}

	public void setSupplierTypeCode(String supplierTypeCode) {
		this.supplierTypeCode = supplierTypeCode;
	}

	public int getSupplierTypeId() {
		return this.supplierTypeId;
	}

	public void setSupplierTypeId(int supplierTypeId) {
		this.supplierTypeId = supplierTypeId;
	}

	public String getTotalAnnualTurnoverCode() {
		return this.totalAnnualTurnoverCode;
	}

	public void setTotalAnnualTurnoverCode(String totalAnnualTurnoverCode) {
		this.totalAnnualTurnoverCode = totalAnnualTurnoverCode;
	}

	public int getTotalAnnualTurnoverId() {
		return this.totalAnnualTurnoverId;
	}

	public void setTotalAnnualTurnoverId(int totalAnnualTurnoverId) {
		this.totalAnnualTurnoverId = totalAnnualTurnoverId;
	}

	public String getTradingName() {
		return this.tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getUniqueRegistrationReferenceNumber() {
		return this.uniqueRegistrationReferenceNumber;
	}

	public void setUniqueRegistrationReferenceNumber(String uniqueRegistrationReferenceNumber) {
		this.uniqueRegistrationReferenceNumber = uniqueRegistrationReferenceNumber;
	}

	public String getWorkPermitNumber() {
		return this.workPermitNumber;
	}

	public void setWorkPermitNumber(String workPermitNumber) {
		this.workPermitNumber = workPermitNumber;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}