package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Addresses database table.
 * 
 */
@Entity
@Table(name="Addresses")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AddressLine1")
	private String addressLine1;

	@Column(name="AddressLine2")
	private String addressLine2;

	@Column(name="AddressTypeCode")
	private String addressTypeCode;

	@Column(name="AddressTypeId")
	private int addressTypeId;

	@Column(name="CityCode")
	private String cityCode;

	@Column(name="CityId")
	private int cityId;

	@Column(name="CountryCode")
	private String countryCode;

	@Column(name="CountryId")
	private int countryId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="DistrictCode")
	private String districtCode;

	@Column(name="DistrictId")
	private int districtId;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeliveryAddress")
	private boolean isDeliveryAddress;

	@Column(name="IsPaymentAddress")
	private boolean isPaymentAddress;

	@Column(name="IsPhysicalAddress")
	private boolean isPhysicalAddress;

	@Column(name="IsPostalAddress")
	private boolean isPostalAddress;

	@Column(name="IsPreferred")
	private boolean isPreferred;

	@Column(name="MunicipalityCode")
	private String municipalityCode;

	@Column(name="MunicipalityId")
	private int municipalityId;

	@Column(name="PostalCode")
	private String postalCode;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ProvinceCode")
	private String provinceCode;

	@Column(name="ProvinceId")
	private int provinceId;

	@Column(name="SuburbCode")
	private String suburbCode;

	@Column(name="SuburbId")
	private int suburbId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="WardCode")
	private String wardCode;

	@Column(name="WardId")
	private int wardId;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Address() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressTypeCode() {
		return this.addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public int getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public int getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeliveryAddress() {
		return this.isDeliveryAddress;
	}

	public void setIsDeliveryAddress(boolean isDeliveryAddress) {
		this.isDeliveryAddress = isDeliveryAddress;
	}

	public boolean getIsPaymentAddress() {
		return this.isPaymentAddress;
	}

	public void setIsPaymentAddress(boolean isPaymentAddress) {
		this.isPaymentAddress = isPaymentAddress;
	}

	public boolean getIsPhysicalAddress() {
		return this.isPhysicalAddress;
	}

	public void setIsPhysicalAddress(boolean isPhysicalAddress) {
		this.isPhysicalAddress = isPhysicalAddress;
	}

	public boolean getIsPostalAddress() {
		return this.isPostalAddress;
	}

	public void setIsPostalAddress(boolean isPostalAddress) {
		this.isPostalAddress = isPostalAddress;
	}

	public boolean getIsPreferred() {
		return this.isPreferred;
	}

	public void setIsPreferred(boolean isPreferred) {
		this.isPreferred = isPreferred;
	}

	public String getMunicipalityCode() {
		return this.municipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	public int getMunicipalityId() {
		return this.municipalityId;
	}

	public void setMunicipalityId(int municipalityId) {
		this.municipalityId = municipalityId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public int getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getSuburbCode() {
		return this.suburbCode;
	}

	public void setSuburbCode(String suburbCode) {
		this.suburbCode = suburbCode;
	}

	public int getSuburbId() {
		return this.suburbId;
	}

	public void setSuburbId(int suburbId) {
		this.suburbId = suburbId;
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

	public String getWardCode() {
		return this.wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public int getWardId() {
		return this.wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}