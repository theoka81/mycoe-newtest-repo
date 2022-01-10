package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Directors database table.
 * 
 */
@Entity
@Table(name="Directors")
@NamedQuery(name="Director.findAll", query="SELECT d FROM Director d")
public class Director implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AppointmentDate")
	private Timestamp appointmentDate;

	@Column(name="CellphoneNumber")
	private String cellphoneNumber;

	@Column(name="CountryTypeCode")
	private String countryTypeCode;

	@Column(name="CountryTypeId")
	private int countryTypeId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="DirectorStatusTypeCode")
	private String directorStatusTypeCode;

	@Column(name="DirectorStatusTypeId")
	private int directorStatusTypeId;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Email")
	private String email;

	@Column(name="EthnicGroupCode")
	private String ethnicGroupCode;

	@Column(name="EthnicGroupId")
	private int ethnicGroupId;

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

	@Column(name="GenderCode")
	private String genderCode;

	@Column(name="GenderId")
	private int genderId;

	@Column(name="IdTypeCode")
	private String idTypeCode;

	@Column(name="IdTypeId")
	private int idTypeId;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsOwner")
	private boolean isOwner;

	@Column(name="LastVerificationDate")
	private Timestamp lastVerificationDate;

	@Column(name="Name")
	private String name;

	@Column(name="OwnershipDemographics")
	private String ownershipDemographics;

	@Column(name="OwnershipPercentage")
	private String ownershipPercentage;

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

	@Column(name="WorkPermitNumber")
	private String workPermitNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Director() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getAppointmentDate() {
		return this.appointmentDate;
	}

	public void setAppointmentDate(Timestamp appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getCellphoneNumber() {
		return this.cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public String getCountryTypeCode() {
		return this.countryTypeCode;
	}

	public void setCountryTypeCode(String countryTypeCode) {
		this.countryTypeCode = countryTypeCode;
	}

	public int getCountryTypeId() {
		return this.countryTypeId;
	}

	public void setCountryTypeId(int countryTypeId) {
		this.countryTypeId = countryTypeId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDirectorStatusTypeCode() {
		return this.directorStatusTypeCode;
	}

	public void setDirectorStatusTypeCode(String directorStatusTypeCode) {
		this.directorStatusTypeCode = directorStatusTypeCode;
	}

	public int getDirectorStatusTypeId() {
		return this.directorStatusTypeId;
	}

	public void setDirectorStatusTypeId(int directorStatusTypeId) {
		this.directorStatusTypeId = directorStatusTypeId;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEthnicGroupCode() {
		return this.ethnicGroupCode;
	}

	public void setEthnicGroupCode(String ethnicGroupCode) {
		this.ethnicGroupCode = ethnicGroupCode;
	}

	public int getEthnicGroupId() {
		return this.ethnicGroupId;
	}

	public void setEthnicGroupId(int ethnicGroupId) {
		this.ethnicGroupId = ethnicGroupId;
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

	public String getGenderCode() {
		return this.genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public int getGenderId() {
		return this.genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
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

	public boolean getIsOwner() {
		return this.isOwner;
	}

	public void setIsOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}

	public Timestamp getLastVerificationDate() {
		return this.lastVerificationDate;
	}

	public void setLastVerificationDate(Timestamp lastVerificationDate) {
		this.lastVerificationDate = lastVerificationDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnershipDemographics() {
		return this.ownershipDemographics;
	}

	public void setOwnershipDemographics(String ownershipDemographics) {
		this.ownershipDemographics = ownershipDemographics;
	}

	public String getOwnershipPercentage() {
		return this.ownershipPercentage;
	}

	public void setOwnershipPercentage(String ownershipPercentage) {
		this.ownershipPercentage = ownershipPercentage;
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