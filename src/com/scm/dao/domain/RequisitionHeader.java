package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the RequisitionHeaders database table.
 * 
 */
@Entity
@Table(name="RequisitionHeaders")
@NamedQuery(name="RequisitionHeader.findAll", query="SELECT r FROM RequisitionHeader r")
public class RequisitionHeader implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AmountForeignOpen")
	private String amountForeignOpen;

	@Column(name="AmountOrderGross", nullable=false, precision=18, scale=2)
	private BigDecimal amountOrderGross;

	@Column(name="BuyerNo")
	private String buyerNo;

	@Column(name="CarrierNo")
	private String carrierNo;

	@Column(name="ContactPerson")
	private String contactPerson;

	@Column(name="ContainerId")
	private String containerId;

	@Column(name="Counter")
	private Long counter;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CurrencyCodeBase")
	private String currencyCodeBase;

	@Column(name="CurrencyCodeFrom")
	private String currencyCodeFrom;

	@Column(name="CurrencyConversionRateSpotRate")
	private String currencyConversionRateSpotRate;

	@Column(name="CurrencyModeForeignorDomesticEntry")
	private String currencyModeForeignorDomesticEntry;

	@Column(name="DateRequested")
	private Timestamp dateRequested;

	@Column(name="DeliveryAddressLine1")
	private String deliveryAddressLine1;

	@Column(name="DeliveryAddressLine2")
	private String deliveryAddressLine2;

	@Column(name="DeliveryInstructionsLine1")
	private String deliveryInstructionsLine1;

	@Column(name="DeliveryInstructionsLine2")
	private String deliveryInstructionsLine2;

	@Column(name="Description")
	private String description;

	@Column(name="FreightHandlingCode")
	private String freightHandlingCode;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="Language")
	private String language;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="NameRemark")
	private String nameRemark;

	@Column(name="NatureofTransaction")
	private String natureofTransaction;

	@Column(name="OrderNo")
	private String orderNo;

	@Column(name="OrderSuffix")
	private String orderSuffix;

	@Column(name="Reference")
	private String reference;

	@Column(name="Reference2")
	private String reference2;

	@Column(name="ReferenceNo")
	private String referenceNo;

	@Column(name="RequestedDeliveryTime")
	private Timestamp requestedDeliveryTime;

	@Column(name="RequestedShipTime")
	private Timestamp requestedShipTime;

	@Column(name="ShipToSupplierNo")
	private String shipToSupplierNo;

	@Column(name="SupplierNo")
	private String supplierNo;

	@Column(name="TaxRateArea")
	private String taxRateArea;

	@Column(name="TelephoneNumber")
	private String telephoneNumber;

	@Column(name="Title")
	private String title;

	@Column(name="TransactionOrderDate")
	private Timestamp transactionOrderDate;

	@Column(name="UserAmount", nullable=false, precision=18, scale=2)
	private BigDecimal userAmount;

	@Column(name="UserDate")
	private Timestamp userDate;

	@Column(name="UserNo")
	private String userNo;

	@Column(name="UserReference")
	private String userReference;

	@Column(name="ZoneNo")
	private String zoneNo;

	//bi-directional many-to-one association to RequisitionDetail
	@OneToMany(mappedBy="requisitionHeader")
	private Set<RequisitionDetail> requisitionDetails;

	//bi-directional many-to-one association to SupplierMaster
	@ManyToOne
	@JoinColumn(name="ShipToSupplierId")
	private SupplierMaster supplierMaster1;

	//bi-directional many-to-one association to SupplierMaster
	@ManyToOne
	@JoinColumn(name="SupplierId")
	private SupplierMaster supplierMaster2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="OrderedById")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="OrderTakenById")
	private SystemUser systemUser4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="OrderTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RequestingUnitId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RevenueUnitId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UserCodeId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="PriorityId")
	private UserCode userCode5;

	//bi-directional many-to-one association to SupplierQuotation
	@OneToMany(mappedBy="requisitionHeader")
	private Set<SupplierQuotation> supplierQuotations;

	public RequisitionHeader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAmountForeignOpen() {
		return this.amountForeignOpen;
	}

	public void setAmountForeignOpen(String amountForeignOpen) {
		this.amountForeignOpen = amountForeignOpen;
	}

	public BigDecimal getAmountOrderGross() {
		return this.amountOrderGross;
	}

	public void setAmountOrderGross(BigDecimal amountOrderGross) {
		this.amountOrderGross = amountOrderGross;
	}

	public String getBuyerNo() {
		return this.buyerNo;
	}

	public void setBuyerNo(String buyerNo) {
		this.buyerNo = buyerNo;
	}

	public String getCarrierNo() {
		return this.carrierNo;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public Long getCounter() {
		return this.counter;
	}

	public void setCounter(Long counter) {
		this.counter = counter;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCurrencyCodeBase() {
		return this.currencyCodeBase;
	}

	public void setCurrencyCodeBase(String currencyCodeBase) {
		this.currencyCodeBase = currencyCodeBase;
	}

	public String getCurrencyCodeFrom() {
		return this.currencyCodeFrom;
	}

	public void setCurrencyCodeFrom(String currencyCodeFrom) {
		this.currencyCodeFrom = currencyCodeFrom;
	}

	public String getCurrencyConversionRateSpotRate() {
		return this.currencyConversionRateSpotRate;
	}

	public void setCurrencyConversionRateSpotRate(String currencyConversionRateSpotRate) {
		this.currencyConversionRateSpotRate = currencyConversionRateSpotRate;
	}

	public String getCurrencyModeForeignorDomesticEntry() {
		return this.currencyModeForeignorDomesticEntry;
	}

	public void setCurrencyModeForeignorDomesticEntry(String currencyModeForeignorDomesticEntry) {
		this.currencyModeForeignorDomesticEntry = currencyModeForeignorDomesticEntry;
	}

	public Timestamp getDateRequested() {
		return this.dateRequested;
	}

	public void setDateRequested(Timestamp dateRequested) {
		this.dateRequested = dateRequested;
	}

	public String getDeliveryAddressLine1() {
		return this.deliveryAddressLine1;
	}

	public void setDeliveryAddressLine1(String deliveryAddressLine1) {
		this.deliveryAddressLine1 = deliveryAddressLine1;
	}

	public String getDeliveryAddressLine2() {
		return this.deliveryAddressLine2;
	}

	public void setDeliveryAddressLine2(String deliveryAddressLine2) {
		this.deliveryAddressLine2 = deliveryAddressLine2;
	}

	public String getDeliveryInstructionsLine1() {
		return this.deliveryInstructionsLine1;
	}

	public void setDeliveryInstructionsLine1(String deliveryInstructionsLine1) {
		this.deliveryInstructionsLine1 = deliveryInstructionsLine1;
	}

	public String getDeliveryInstructionsLine2() {
		return this.deliveryInstructionsLine2;
	}

	public void setDeliveryInstructionsLine2(String deliveryInstructionsLine2) {
		this.deliveryInstructionsLine2 = deliveryInstructionsLine2;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFreightHandlingCode() {
		return this.freightHandlingCode;
	}

	public void setFreightHandlingCode(String freightHandlingCode) {
		this.freightHandlingCode = freightHandlingCode;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getNameRemark() {
		return this.nameRemark;
	}

	public void setNameRemark(String nameRemark) {
		this.nameRemark = nameRemark;
	}

	public String getNatureofTransaction() {
		return this.natureofTransaction;
	}

	public void setNatureofTransaction(String natureofTransaction) {
		this.natureofTransaction = natureofTransaction;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderSuffix() {
		return this.orderSuffix;
	}

	public void setOrderSuffix(String orderSuffix) {
		this.orderSuffix = orderSuffix;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getReference2() {
		return this.reference2;
	}

	public void setReference2(String reference2) {
		this.reference2 = reference2;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Timestamp getRequestedDeliveryTime() {
		return this.requestedDeliveryTime;
	}

	public void setRequestedDeliveryTime(Timestamp requestedDeliveryTime) {
		this.requestedDeliveryTime = requestedDeliveryTime;
	}

	public Timestamp getRequestedShipTime() {
		return this.requestedShipTime;
	}

	public void setRequestedShipTime(Timestamp requestedShipTime) {
		this.requestedShipTime = requestedShipTime;
	}

	public String getShipToSupplierNo() {
		return this.shipToSupplierNo;
	}

	public void setShipToSupplierNo(String shipToSupplierNo) {
		this.shipToSupplierNo = shipToSupplierNo;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public String getTaxRateArea() {
		return this.taxRateArea;
	}

	public void setTaxRateArea(String taxRateArea) {
		this.taxRateArea = taxRateArea;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getTransactionOrderDate() {
		return this.transactionOrderDate;
	}

	public void setTransactionOrderDate(Timestamp transactionOrderDate) {
		this.transactionOrderDate = transactionOrderDate;
	}

	public BigDecimal getUserAmount() {
		return this.userAmount;
	}

	public void setUserAmount(BigDecimal userAmount) {
		this.userAmount = userAmount;
	}

	public Timestamp getUserDate() {
		return this.userDate;
	}

	public void setUserDate(Timestamp userDate) {
		this.userDate = userDate;
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserReference() {
		return this.userReference;
	}

	public void setUserReference(String userReference) {
		this.userReference = userReference;
	}

	public String getZoneNo() {
		return this.zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public Set<RequisitionDetail> getRequisitionDetails() {
		return this.requisitionDetails;
	}

	public void setRequisitionDetails(Set<RequisitionDetail> requisitionDetails) {
		this.requisitionDetails = requisitionDetails;
	}

	public RequisitionDetail addRequisitionDetail(RequisitionDetail requisitionDetail) {
		getRequisitionDetails().add(requisitionDetail);
		requisitionDetail.setRequisitionHeader(this);

		return requisitionDetail;
	}

	public RequisitionDetail removeRequisitionDetail(RequisitionDetail requisitionDetail) {
		getRequisitionDetails().remove(requisitionDetail);
		requisitionDetail.setRequisitionHeader(null);

		return requisitionDetail;
	}

	public SupplierMaster getSupplierMaster1() {
		return this.supplierMaster1;
	}

	public void setSupplierMaster1(SupplierMaster supplierMaster1) {
		this.supplierMaster1 = supplierMaster1;
	}

	public SupplierMaster getSupplierMaster2() {
		return this.supplierMaster2;
	}

	public void setSupplierMaster2(SupplierMaster supplierMaster2) {
		this.supplierMaster2 = supplierMaster2;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

	public SystemUser getSystemUser3() {
		return this.systemUser3;
	}

	public void setSystemUser3(SystemUser systemUser3) {
		this.systemUser3 = systemUser3;
	}

	public SystemUser getSystemUser4() {
		return this.systemUser4;
	}

	public void setSystemUser4(SystemUser systemUser4) {
		this.systemUser4 = systemUser4;
	}

	public UserCode getUserCode1() {
		return this.userCode1;
	}

	public void setUserCode1(UserCode userCode1) {
		this.userCode1 = userCode1;
	}

	public UserCode getUserCode2() {
		return this.userCode2;
	}

	public void setUserCode2(UserCode userCode2) {
		this.userCode2 = userCode2;
	}

	public UserCode getUserCode3() {
		return this.userCode3;
	}

	public void setUserCode3(UserCode userCode3) {
		this.userCode3 = userCode3;
	}

	public UserCode getUserCode4() {
		return this.userCode4;
	}

	public void setUserCode4(UserCode userCode4) {
		this.userCode4 = userCode4;
	}

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public Set<SupplierQuotation> getSupplierQuotations() {
		return this.supplierQuotations;
	}

	public void setSupplierQuotations(Set<SupplierQuotation> supplierQuotations) {
		this.supplierQuotations = supplierQuotations;
	}

	public SupplierQuotation addSupplierQuotation(SupplierQuotation supplierQuotation) {
		getSupplierQuotations().add(supplierQuotation);
		supplierQuotation.setRequisitionHeader(this);

		return supplierQuotation;
	}

	public SupplierQuotation removeSupplierQuotation(SupplierQuotation supplierQuotation) {
		getSupplierQuotations().remove(supplierQuotation);
		supplierQuotation.setRequisitionHeader(null);

		return supplierQuotation;
	}

}