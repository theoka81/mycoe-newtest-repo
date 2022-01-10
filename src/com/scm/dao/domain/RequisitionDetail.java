package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the RequisitionDetails database table.
 * 
 */
@Entity
@Table(name="RequisitionDetails")
//@NamedQuery(name="RequisitionDetail.findAll", query="SELECT r FROM RequisitionDetail r")
@org.hibernate.annotations.Table(appliesTo = "RequisitionDetails")
public class RequisitionDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccountID")
	private String accountID;

	@Column(name="AccountNo")
	private String accountNo;

	@Column(name="AmountExtendedCost", nullable=false, precision=18, scale=2)
	private BigDecimal amountExtendedCost;

	@Column(name="AmountExtendedPrice", nullable=false, precision=18, scale=2)
	private BigDecimal amountExtendedPrice;

	@Column(name="AmountForeignChangedAmount", nullable=false, precision=18, scale=2)
	private BigDecimal amountForeignChangedAmount;

	@Column(name="AmountForeignExtendedCost", nullable=false, precision=18, scale=2)
	private BigDecimal amountForeignExtendedCost;

	@Column(name="AmountForeignExtendedPrice", nullable=false, precision=18, scale=2)
	private BigDecimal amountForeignExtendedPrice;

	@Column(name="AmountForeignOpen")
	private String amountForeignOpen;

	@Column(name="AmountForeignUnitCost", nullable=false, precision=18, scale=2)
	private BigDecimal amountForeignUnitCost;

	@Column(name="AmountForeignUnitPrice", nullable=false, precision=18, scale=2)
	private BigDecimal amountForeignUnitPrice;

	@Column(name="AmountOnHold", nullable=false, precision=18, scale=2)
	private BigDecimal amountOnHold;

	@Column(name="AmountOpen", nullable=false, precision=18, scale=2)
	private BigDecimal amountOpen;

	@Column(name="AmountReceived", nullable=false, precision=18, scale=2)
	private BigDecimal amountReceived;

	@Column(name="AmountReceivedForeign")
	private String amountReceivedForeign;

	@Column(name="AmountUnitCost", nullable=false, precision=18, scale=2)
	private BigDecimal amountUnitCost;

	@Column(name="BuyerNo")
	private String buyerNo;

	@Column(name="CarrierNo")
	private String carrierNo;

	@Column(name="Century")
	private String century;

	@Column(name="Comments")
	private String comments;

	@Column(name="CommodityNo")
	private String commodityNo;

	@Column(name="ConditionsofTransport")
	private String conditionsofTransport;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CurrencyCodeFrom")
	private String currencyCodeFrom;

	@Column(name="CurrencyConversionRateSpotRate")
	private String currencyConversionRateSpotRate;

	@Column(name="DateForGlAndVoucher")
	private Timestamp dateForGlAndVoucher;

	@Column(name="DateOrderTransaction")
	private Timestamp dateOrderTransaction;

	@Column(name="DateRequested")
	private Timestamp dateRequested;

	@Column(name="Description")
	private String description;

	@Column(name="DescriptionShort")
	private String descriptionShort;

	@Column(name="FiscalYear")
	private String fiscalYear;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemId")
	private Long itemId;

	@Column(name="LineNo")
	private String lineNo;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ObjectAccount")
	private String objectAccount;

	@Column(name="OrderNo")
	private String orderNo;

	@Column(name="OrderSuffix")
	private String orderSuffix;

	@Column(name="PeriodNoGeneralLedger")
	private String periodNoGeneralLedger;

	@Column(name="ProjectNo")
	private String projectNo;

	@Column(name="Reference")
	private String reference;

	@Column(name="Reference2")
	private String reference2;

	@Column(name="Segment1")
	private String segment1;

	@Column(name="Segment2")
	private String segment2;

	@Column(name="Segment3")
	private String segment3;

	@Column(name="Segment4")
	private String segment4;

	@Column(name="Segment5")
	private String segment5;

	@Column(name="Segment6")
	private String segment6;

	@Column(name="Segment7")
	private String segment7;

	@Column(name="SerialNo")
	private String serialNo;

	@Column(name="Subsidiary")
	private String subsidiary;

	@Column(name="UnitCostPurchasing", nullable=false, precision=18, scale=2)
	private BigDecimal unitCostPurchasing;

	@Column(name="UnitsOnHold")
	private Long unitsOnHold;

	@Column(name="UnitsOpen")
	private Long unitsOpen;

	@Column(name="UnitsOrderTransactionQuantity")
	private Long unitsOrderTransactionQuantity;

	@Column(name="UnitsReceived")
	private Long unitsReceived;

	@Column(name="UserAmount")
	private String userAmount;

	@Column(name="UserCode")
	private String userCode;

	@Column(name="UserDate")
	private Timestamp userDate;

	@Column(name="UserNo")
	private String userNo;

	@Column(name="UserReference")
	private String userReference;

	//bi-directional many-to-one association to RequisitionHeader
	@ManyToOne
	@JoinColumn(name="RequisitionHeaderId")
	private RequisitionHeader requisitionHeader;

	//bi-directional many-to-one association to SupplierMaster
	@ManyToOne
	@JoinColumn(name="SupplierId")
	private SupplierMaster supplierMaster;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CommodityCodeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CompanyId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LineStatusId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LineTypeId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ModeofTransportId")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="OrderTypeId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ProjectBusinessUnitId")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RequestingUnitId")
	private UserCode userCode8;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RevenueUnitId")
	private UserCode userCode9;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ShippingCommodityClassId")
	private UserCode userCode10;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ShippingConditionsCodeId")
	private UserCode userCode11;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ShipToId")
	private UserCode userCode12;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusCodeLastId")
	private UserCode userCode13;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusCodeNextId")
	private UserCode userCode14;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TaxExplCodeId")
	private UserCode userCode15;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TransactionOriginatorId")
	private UserCode userCode16;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitofMeasureId")
	private UserCode userCode17;

	public RequisitionDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountID() {
		return this.accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAmountExtendedCost() {
		return this.amountExtendedCost;
	}

	public void setAmountExtendedCost(BigDecimal amountExtendedCost) {
		this.amountExtendedCost = amountExtendedCost;
	}

	public BigDecimal getAmountExtendedPrice() {
		return this.amountExtendedPrice;
	}

	public void setAmountExtendedPrice(BigDecimal amountExtendedPrice) {
		this.amountExtendedPrice = amountExtendedPrice;
	}

	public BigDecimal getAmountForeignChangedAmount() {
		return this.amountForeignChangedAmount;
	}

	public void setAmountForeignChangedAmount(BigDecimal amountForeignChangedAmount) {
		this.amountForeignChangedAmount = amountForeignChangedAmount;
	}

	public BigDecimal getAmountForeignExtendedCost() {
		return this.amountForeignExtendedCost;
	}

	public void setAmountForeignExtendedCost(BigDecimal amountForeignExtendedCost) {
		this.amountForeignExtendedCost = amountForeignExtendedCost;
	}

	public BigDecimal getAmountForeignExtendedPrice() {
		return this.amountForeignExtendedPrice;
	}

	public void setAmountForeignExtendedPrice(BigDecimal amountForeignExtendedPrice) {
		this.amountForeignExtendedPrice = amountForeignExtendedPrice;
	}

	public String getAmountForeignOpen() {
		return this.amountForeignOpen;
	}

	public void setAmountForeignOpen(String amountForeignOpen) {
		this.amountForeignOpen = amountForeignOpen;
	}

	public BigDecimal getAmountForeignUnitCost() {
		return this.amountForeignUnitCost;
	}

	public void setAmountForeignUnitCost(BigDecimal amountForeignUnitCost) {
		this.amountForeignUnitCost = amountForeignUnitCost;
	}

	public BigDecimal getAmountForeignUnitPrice() {
		return this.amountForeignUnitPrice;
	}

	public void setAmountForeignUnitPrice(BigDecimal amountForeignUnitPrice) {
		this.amountForeignUnitPrice = amountForeignUnitPrice;
	}

	public BigDecimal getAmountOnHold() {
		return this.amountOnHold;
	}

	public void setAmountOnHold(BigDecimal amountOnHold) {
		this.amountOnHold = amountOnHold;
	}

	public BigDecimal getAmountOpen() {
		return this.amountOpen;
	}

	public void setAmountOpen(BigDecimal amountOpen) {
		this.amountOpen = amountOpen;
	}

	public BigDecimal getAmountReceived() {
		return this.amountReceived;
	}

	public void setAmountReceived(BigDecimal amountReceived) {
		this.amountReceived = amountReceived;
	}

	public String getAmountReceivedForeign() {
		return this.amountReceivedForeign;
	}

	public void setAmountReceivedForeign(String amountReceivedForeign) {
		this.amountReceivedForeign = amountReceivedForeign;
	}

	public BigDecimal getAmountUnitCost() {
		return this.amountUnitCost;
	}

	public void setAmountUnitCost(BigDecimal amountUnitCost) {
		this.amountUnitCost = amountUnitCost;
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

	public String getCentury() {
		return this.century;
	}

	public void setCentury(String century) {
		this.century = century;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCommodityNo() {
		return this.commodityNo;
	}

	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}

	public String getConditionsofTransport() {
		return this.conditionsofTransport;
	}

	public void setConditionsofTransport(String conditionsofTransport) {
		this.conditionsofTransport = conditionsofTransport;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public Timestamp getDateForGlAndVoucher() {
		return this.dateForGlAndVoucher;
	}

	public void setDateForGlAndVoucher(Timestamp dateForGlAndVoucher) {
		this.dateForGlAndVoucher = dateForGlAndVoucher;
	}

	public Timestamp getDateOrderTransaction() {
		return this.dateOrderTransaction;
	}

	public void setDateOrderTransaction(Timestamp dateOrderTransaction) {
		this.dateOrderTransaction = dateOrderTransaction;
	}

	public Timestamp getDateRequested() {
		return this.dateRequested;
	}

	public void setDateRequested(Timestamp dateRequested) {
		this.dateRequested = dateRequested;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionShort() {
		return this.descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	public String getFiscalYear() {
		return this.fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
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

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLineNo() {
		return this.lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getObjectAccount() {
		return this.objectAccount;
	}

	public void setObjectAccount(String objectAccount) {
		this.objectAccount = objectAccount;
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

	public String getPeriodNoGeneralLedger() {
		return this.periodNoGeneralLedger;
	}

	public void setPeriodNoGeneralLedger(String periodNoGeneralLedger) {
		this.periodNoGeneralLedger = periodNoGeneralLedger;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
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

	public String getSegment1() {
		return this.segment1;
	}

	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}

	public String getSegment2() {
		return this.segment2;
	}

	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}

	public String getSegment3() {
		return this.segment3;
	}

	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}

	public String getSegment4() {
		return this.segment4;
	}

	public void setSegment4(String segment4) {
		this.segment4 = segment4;
	}

	public String getSegment5() {
		return this.segment5;
	}

	public void setSegment5(String segment5) {
		this.segment5 = segment5;
	}

	public String getSegment6() {
		return this.segment6;
	}

	public void setSegment6(String segment6) {
		this.segment6 = segment6;
	}

	public String getSegment7() {
		return this.segment7;
	}

	public void setSegment7(String segment7) {
		this.segment7 = segment7;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSubsidiary() {
		return this.subsidiary;
	}

	public void setSubsidiary(String subsidiary) {
		this.subsidiary = subsidiary;
	}

	public BigDecimal getUnitCostPurchasing() {
		return this.unitCostPurchasing;
	}

	public void setUnitCostPurchasing(BigDecimal unitCostPurchasing) {
		this.unitCostPurchasing = unitCostPurchasing;
	}

	public Long getUnitsOnHold() {
		return this.unitsOnHold;
	}

	public void setUnitsOnHold(Long unitsOnHold) {
		this.unitsOnHold = unitsOnHold;
	}

	public Long getUnitsOpen() {
		return this.unitsOpen;
	}

	public void setUnitsOpen(Long unitsOpen) {
		this.unitsOpen = unitsOpen;
	}

	public Long getUnitsOrderTransactionQuantity() {
		return this.unitsOrderTransactionQuantity;
	}

	public void setUnitsOrderTransactionQuantity(Long unitsOrderTransactionQuantity) {
		this.unitsOrderTransactionQuantity = unitsOrderTransactionQuantity;
	}

	public Long getUnitsReceived() {
		return this.unitsReceived;
	}

	public void setUnitsReceived(Long unitsReceived) {
		this.unitsReceived = unitsReceived;
	}

	public String getUserAmount() {
		return this.userAmount;
	}

	public void setUserAmount(String userAmount) {
		this.userAmount = userAmount;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
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

	public RequisitionHeader getRequisitionHeader() {
		return this.requisitionHeader;
	}

	public void setRequisitionHeader(RequisitionHeader requisitionHeader) {
		this.requisitionHeader = requisitionHeader;
	}

	public SupplierMaster getSupplierMaster() {
		return this.supplierMaster;
	}

	public void setSupplierMaster(SupplierMaster supplierMaster) {
		this.supplierMaster = supplierMaster;
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

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

	public UserCode getUserCode8() {
		return this.userCode8;
	}

	public void setUserCode8(UserCode userCode8) {
		this.userCode8 = userCode8;
	}

	public UserCode getUserCode9() {
		return this.userCode9;
	}

	public void setUserCode9(UserCode userCode9) {
		this.userCode9 = userCode9;
	}

	public UserCode getUserCode10() {
		return this.userCode10;
	}

	public void setUserCode10(UserCode userCode10) {
		this.userCode10 = userCode10;
	}

	public UserCode getUserCode11() {
		return this.userCode11;
	}

	public void setUserCode11(UserCode userCode11) {
		this.userCode11 = userCode11;
	}

	public UserCode getUserCode12() {
		return this.userCode12;
	}

	public void setUserCode12(UserCode userCode12) {
		this.userCode12 = userCode12;
	}

	public UserCode getUserCode13() {
		return this.userCode13;
	}

	public void setUserCode13(UserCode userCode13) {
		this.userCode13 = userCode13;
	}

	public UserCode getUserCode14() {
		return this.userCode14;
	}

	public void setUserCode14(UserCode userCode14) {
		this.userCode14 = userCode14;
	}

	public UserCode getUserCode15() {
		return this.userCode15;
	}

	public void setUserCode15(UserCode userCode15) {
		this.userCode15 = userCode15;
	}

	public UserCode getUserCode16() {
		return this.userCode16;
	}

	public void setUserCode16(UserCode userCode16) {
		this.userCode16 = userCode16;
	}

	public UserCode getUserCode17() {
		return this.userCode17;
	}

	public void setUserCode17(UserCode userCode17) {
		this.userCode17 = userCode17;
	}

}