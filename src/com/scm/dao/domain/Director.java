package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AppointmentDate")
	private Timestamp appointmentDate;

	@Column(name="CellphoneNumber")
	private String cellphoneNumber;

	@Column(name="CountryTypeCode")
	private String countryTypeCode;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="DirectorStatusTypeCode")
	private String directorStatusTypeCode;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Email")
	private String email;

	@Column(name="EthnicGroupCode")
	private String ethnicGroupCode;

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

	@Column(name="IdTypeCode")
	private String idTypeCode;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsOwner")
	private Boolean isOwner;

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
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="Surname")
	private String surname;

	@Column(name="WorkPermitNumber")
	private String workPermitNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="CountryTypeId")
	private Country country;

	//bi-directional many-to-one association to DirectorStatus
	@ManyToOne
	@JoinColumn(name="DirectorStatusTypeId")
	private DirectorStatus directorStatus;

	//bi-directional many-to-one association to EthnicGroup
	@ManyToOne
	@JoinColumn(name="EthnicGroupId")
	private EthnicGroup ethnicGroup;

	//bi-directional many-to-one association to Gender
	@ManyToOne
	@JoinColumn(name="GenderId")
	private Gender gender;

	//bi-directional many-to-one association to IdType
	@ManyToOne
	@JoinColumn(name="IdTypeId")
	private IdType idType;

	public Director() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getIdTypeCode() {
		return this.idTypeCode;
	}

	public void setIdTypeCode(String idTypeCode) {
		this.idTypeCode = idTypeCode;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsOwner() {
		return this.isOwner;
	}

	public void setIsOwner(Boolean isOwner) {
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

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
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

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public DirectorStatus getDirectorStatus() {
		return this.directorStatus;
	}

	public void setDirectorStatus(DirectorStatus directorStatus) {
		this.directorStatus = directorStatus;
	}

	public EthnicGroup getEthnicGroup() {
		return this.ethnicGroup;
	}

	public void setEthnicGroup(EthnicGroup ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public IdType getIdType() {
		return this.idType;
	}

	public void setIdType(IdType idType) {
		this.idType = idType;
	}

}