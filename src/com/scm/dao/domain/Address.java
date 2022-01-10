package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AddressLine1")
	private String addressLine1;

	@Column(name="AddressLine2")
	private String addressLine2;

	@Column(name="AddressTypeCode")
	private String addressTypeCode;

	@Column(name="CityCode")
	private String cityCode;

	@Column(name="CountryCode")
	private String countryCode;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="DistrictCode")
	private String districtCode;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsDeliveryAddress")
	private Boolean isDeliveryAddress;

	@Column(name="IsPaymentAddress")
	private Boolean isPaymentAddress;

	@Column(name="IsPhysicalAddress")
	private Boolean isPhysicalAddress;

	@Column(name="IsPostalAddress")
	private Boolean isPostalAddress;

	@Column(name="IsPreferred")
	private Boolean isPreferred;

	@Column(name="MunicipalityCode")
	private String municipalityCode;

	@Column(name="PostalCode")
	private String postalCode;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ProvinceCode")
	private String provinceCode;

	@Column(name="SuburbCode")
	private String suburbCode;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="WardCode")
	private String wardCode;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to AddressType
	@ManyToOne
	@JoinColumn(name="AddressTypeId")
	private AddressType addressType;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="CityId")
	private City city;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="CountryId")
	private Country country;

	//bi-directional many-to-one association to District
	@ManyToOne
	@JoinColumn(name="DistrictId")
	private District district;

	//bi-directional many-to-one association to Municipality
	@ManyToOne
	@JoinColumn(name="MunicipalityId")
	private Municipality municipality;

	//bi-directional many-to-one association to Province
	@ManyToOne
	@JoinColumn(name="ProvinceId")
	private Province province;

	//bi-directional many-to-one association to Suburb
	@ManyToOne
	@JoinColumn(name="SuburbId")
	private Suburb suburb;

	//bi-directional many-to-one association to Ward
	@ManyToOne
	@JoinColumn(name="WardId")
	private Ward ward;

	public Address() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeliveryAddress() {
		return this.isDeliveryAddress;
	}

	public void setIsDeliveryAddress(Boolean isDeliveryAddress) {
		this.isDeliveryAddress = isDeliveryAddress;
	}

	public Boolean getIsPaymentAddress() {
		return this.isPaymentAddress;
	}

	public void setIsPaymentAddress(Boolean isPaymentAddress) {
		this.isPaymentAddress = isPaymentAddress;
	}

	public Boolean getIsPhysicalAddress() {
		return this.isPhysicalAddress;
	}

	public void setIsPhysicalAddress(Boolean isPhysicalAddress) {
		this.isPhysicalAddress = isPhysicalAddress;
	}

	public Boolean getIsPostalAddress() {
		return this.isPostalAddress;
	}

	public void setIsPostalAddress(Boolean isPostalAddress) {
		this.isPostalAddress = isPostalAddress;
	}

	public Boolean getIsPreferred() {
		return this.isPreferred;
	}

	public void setIsPreferred(Boolean isPreferred) {
		this.isPreferred = isPreferred;
	}

	public String getMunicipalityCode() {
		return this.municipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
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

	public String getSuburbCode() {
		return this.suburbCode;
	}

	public void setSuburbCode(String suburbCode) {
		this.suburbCode = suburbCode;
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

	public String getWardCode() {
		return this.wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Municipality getMunicipality() {
		return this.municipality;
	}

	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Suburb getSuburb() {
		return this.suburb;
	}

	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}

	public Ward getWard() {
		return this.ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

}