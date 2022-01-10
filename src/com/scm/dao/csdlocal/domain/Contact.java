package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Contacts database table.
 * 
 */
@Entity
@Table(name="Contacts")
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CellphoneNumber")
	private String cellphoneNumber;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="CsdUser")
	private boolean csdUser;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="EmailAddress")
	private String emailAddress;

	@Column(name="FaxNumber")
	private String faxNumber;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="ForeignIdNumber")
	private String foreignIdNumber;

	@Column(name="ForeignPassportNumber")
	private String foreignPassportNumber;

	@Column(name="FundingPartnerLegalName")
	private String fundingPartnerLegalName;

	@Column(name="IdTypeId")
	private int idTypeId;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsPreferred")
	private boolean isPreferred;

	@Column(name="Name")
	private String name;

	@Column(name="PreferCellphone")
	private boolean preferCellphone;

	@Column(name="PreferEmail")
	private boolean preferEmail;

	@Column(name="PreferFax")
	private boolean preferFax;

	@Column(name="PreferPostal")
	private boolean preferPostal;

	@Column(name="PreferSms")
	private boolean preferSms;

	@Column(name="PreferTelephone")
	private boolean preferTelephone;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SaIdNumber")
	private String saIdNumber;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="Surname")
	private String surname;

	@Column(name="TelephoneNumber")
	private String telephoneNumber;

	@Column(name="TollFreeNumber")
	private String tollFreeNumber;

	@Column(name="WebsiteAddress")
	private String websiteAddress;

	@Column(name="WorkPermitNumber")
	private String workPermitNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Contact() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCellphoneNumber() {
		return this.cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public boolean getCsdUser() {
		return this.csdUser;
	}

	public void setCsdUser(boolean csdUser) {
		this.csdUser = csdUser;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
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

	public String getFundingPartnerLegalName() {
		return this.fundingPartnerLegalName;
	}

	public void setFundingPartnerLegalName(String fundingPartnerLegalName) {
		this.fundingPartnerLegalName = fundingPartnerLegalName;
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

	public boolean getIsPreferred() {
		return this.isPreferred;
	}

	public void setIsPreferred(boolean isPreferred) {
		this.isPreferred = isPreferred;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getPreferCellphone() {
		return this.preferCellphone;
	}

	public void setPreferCellphone(boolean preferCellphone) {
		this.preferCellphone = preferCellphone;
	}

	public boolean getPreferEmail() {
		return this.preferEmail;
	}

	public void setPreferEmail(boolean preferEmail) {
		this.preferEmail = preferEmail;
	}

	public boolean getPreferFax() {
		return this.preferFax;
	}

	public void setPreferFax(boolean preferFax) {
		this.preferFax = preferFax;
	}

	public boolean getPreferPostal() {
		return this.preferPostal;
	}

	public void setPreferPostal(boolean preferPostal) {
		this.preferPostal = preferPostal;
	}

	public boolean getPreferSms() {
		return this.preferSms;
	}

	public void setPreferSms(boolean preferSms) {
		this.preferSms = preferSms;
	}

	public boolean getPreferTelephone() {
		return this.preferTelephone;
	}

	public void setPreferTelephone(boolean preferTelephone) {
		this.preferTelephone = preferTelephone;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getSaIdNumber() {
		return this.saIdNumber;
	}

	public void setSaIdNumber(String saIdNumber) {
		this.saIdNumber = saIdNumber;
	}

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getTollFreeNumber() {
		return this.tollFreeNumber;
	}

	public void setTollFreeNumber(String tollFreeNumber) {
		this.tollFreeNumber = tollFreeNumber;
	}

	public String getWebsiteAddress() {
		return this.websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
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