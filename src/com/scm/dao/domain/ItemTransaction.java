package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ItemTransactions database table.
 * 
 */
@Entity
@Table(name="ItemTransactions")
@NamedQuery(name="ItemTransaction.findAll", query="SELECT i FROM ItemTransaction i")
public class ItemTransaction implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private ItemTransactionPK id;

	@Column(name="AccountId")
	private String accountId;

	@Column(name="AddressNumber")
	private String addressNumber;

	@Column(name="AddressNumberShipToId")
	private Long addressNumberShipToId;

	@Column(name="AgreementNumberDistribution")
	private String agreementNumberDistribution;

	@Column(name="AgreementSupplementDistribution")
	private Long agreementSupplementDistribution;

	@Column(name="AmountExtendedCostPrice", nullable=false, precision=18, scale=2)
	private BigDecimal amountExtendedCostPrice;

	@Column(name="AmountUnitCost", nullable=false, precision=18, scale=2)
	private BigDecimal amountUnitCost;

	@Column(name="AsOfPostedCodeId")
	private Long asOfPostedCodeId;

	@Column(name="BatchNumber")
	private Long batchNumber;

	@Column(name="BranchId")
	private Long branchId;

	@Column(name="BusinessUnitAlternateId")
	private String businessUnitAlternateId;

	@Column(name="CategoryGl")
	private String categoryGl;

	@Column(name="CommingledOtherOwner")
	private String commingledOtherOwner;

	@Column(name="DateForGlVoucher")
	private String dateForGlVoucher;

	@Column(name="DateOrderTransaction")
	private String dateOrderTransaction;

	@Column(name="DepartmentId")
	private Long departmentId;

	@Column(name="DocumentCompany")
	private String documentCompany;

	@Column(name="DocumentOrderNoInvoice")
	private Long documentOrderNoInvoice;

	@Column(name="DocumentPayItem")
	private String documentPayItem;

	@Column(name="DocumentTypeId")
	private Long documentTypeId;

	@Column(name="DocumentVoucherInvoice")
	private Long documentVoucherInvoice;

	@Column(name="ExplanationTransaction")
	private String explanationTransaction;

	@Column(name="FromTo")
	private String fromTo;

	@Column(name="HistoricalDate")
	private String historicalDate;

	@Column(name="ItemNumber2")
	private String itemNumber2;

	@Column(name="ItemNumber3")
	private String itemNumber3;

	@Column(name="JournalEntryLineNumber")
	private Long journalEntryLineNumber;

	@Column(name="LicensePlateNumber")
	private String licensePlateNumber;

	@Column(name="LineNumber")
	private Long lineNumber;

	@Column(name="LocationId")
	private Long locationId;

	@Column(name="LotGradeId")
	private Long lotGradeId;

	@Column(name="LotMasterCardexYN")
	private String lotMasterCardexYN;

	@Column(name="LotPotencyId")
	private Long lotPotencyId;

	@Column(name="LotSerialNumber")
	private String lotSerialNumber;

	@Column(name="LotStatusCodeExpanded")
	private String lotStatusCodeExpanded;

	@Column(name="LotStatusCodeId")
	private Long lotStatusCodeId;

	@Column(name="LotStatusReasonCodeId")
	private Long lotStatusReasonCodeId;

	@Column(name="NumberOfLines")
	private Long numberOfLines;

	@Column(name="ObjectAccount")
	private String objectAccount;

	@Column(name="OrderCompanyOrderNumber")
	private String orderCompanyOrderNumber;

	@Column(name="OrderTypeId")
	private Long orderTypeId;

	@Column(name="ParentItemNumberShort")
	private Long parentItemNumberShort;

	@Column(name="ParentLot")
	private String parentLot;

	@Column(name="ProductionNumber")
	private String productionNumber;

	@Column(name="ProductionNumberShort")
	private Long productionNumberShort;

	@Column(name="QuantityAvailable")
	private Long quantityAvailable;

	@Column(name="ReasonCodeId")
	private Long reasonCodeId;

	@Column(name="ReconciliationDate")
	private String reconciliationDate;

	@Column(name="RelatedFromLineNumber")
	private Long relatedFromLineNumber;

	@Column(name="ReverseOrVoid")
	private String reverseOrVoid;

	@Column(name="SequenceNumberLocationDetail")
	private Long sequenceNumberLocationDetail;

	@Column(name="SequenceNumberOperations")
	private Long sequenceNumberOperations;

	@Column(name="SerialNumber")
	private String serialNumber;

	@Column(name="StorageUnitNumber")
	private Long storageUnitNumber;

	@Column(name="SubledgerGl")
	private String subledgerGl;

	@Column(name="SubledgerType")
	private String subledgerType;

	@Column(name="Subsidiary")
	private String subsidiary;

	@Column(name="SupplierLotNumber")
	private String supplierLotNumber;

	@Column(name="TerminalIdentification")
	private String terminalIdentification;

	@Column(name="TimeOfDay")
	private String timeOfDay;

	@Column(name="TransactionGroupNumber")
	private Long transactionGroupNumber;

	@Column(name="TransactionLineNumber")
	private Long transactionLineNumber;

	@Column(name="TransactionReference")
	private String transactionReference;

	@Column(name="UnitofMeasureSecondaryId")
	private String unitofMeasureSecondaryId;

	@Column(name="UnitofMeasureTransactionId")
	private Long unitofMeasureTransactionId;

	@Column(name="UnitsSecondaryQuantityOrdered")
	private String unitsSecondaryQuantityOrdered;

	@Column(name="ValuationPeriodEndingDate")
	private String valuationPeriodEndingDate;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="InventoryId", nullable=false, insertable=false, updatable=false)
	private InventoryDefinition inventoryDefinition;

	//bi-directional many-to-one association to ItemTransactionMaster
	@ManyToOne
	@JoinColumn(name="ItemTransMasterId", nullable=false, insertable=false, updatable=false)
	private ItemTransactionMaster itemTransactionMaster;

	public ItemTransaction() {
	}

	public ItemTransactionPK getId() {
		return this.id;
	}

	public void setId(ItemTransactionPK id) {
		this.id = id;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAddressNumber() {
		return this.addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public Long getAddressNumberShipToId() {
		return this.addressNumberShipToId;
	}

	public void setAddressNumberShipToId(Long addressNumberShipToId) {
		this.addressNumberShipToId = addressNumberShipToId;
	}

	public String getAgreementNumberDistribution() {
		return this.agreementNumberDistribution;
	}

	public void setAgreementNumberDistribution(String agreementNumberDistribution) {
		this.agreementNumberDistribution = agreementNumberDistribution;
	}

	public Long getAgreementSupplementDistribution() {
		return this.agreementSupplementDistribution;
	}

	public void setAgreementSupplementDistribution(Long agreementSupplementDistribution) {
		this.agreementSupplementDistribution = agreementSupplementDistribution;
	}

	public BigDecimal getAmountExtendedCostPrice() {
		return this.amountExtendedCostPrice;
	}

	public void setAmountExtendedCostPrice(BigDecimal amountExtendedCostPrice) {
		this.amountExtendedCostPrice = amountExtendedCostPrice;
	}

	public BigDecimal getAmountUnitCost() {
		return this.amountUnitCost;
	}

	public void setAmountUnitCost(BigDecimal amountUnitCost) {
		this.amountUnitCost = amountUnitCost;
	}

	public Long getAsOfPostedCodeId() {
		return this.asOfPostedCodeId;
	}

	public void setAsOfPostedCodeId(Long asOfPostedCodeId) {
		this.asOfPostedCodeId = asOfPostedCodeId;
	}

	public Long getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(Long batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Long getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBusinessUnitAlternateId() {
		return this.businessUnitAlternateId;
	}

	public void setBusinessUnitAlternateId(String businessUnitAlternateId) {
		this.businessUnitAlternateId = businessUnitAlternateId;
	}

	public String getCategoryGl() {
		return this.categoryGl;
	}

	public void setCategoryGl(String categoryGl) {
		this.categoryGl = categoryGl;
	}

	public String getCommingledOtherOwner() {
		return this.commingledOtherOwner;
	}

	public void setCommingledOtherOwner(String commingledOtherOwner) {
		this.commingledOtherOwner = commingledOtherOwner;
	}

	public String getDateForGlVoucher() {
		return this.dateForGlVoucher;
	}

	public void setDateForGlVoucher(String dateForGlVoucher) {
		this.dateForGlVoucher = dateForGlVoucher;
	}

	public String getDateOrderTransaction() {
		return this.dateOrderTransaction;
	}

	public void setDateOrderTransaction(String dateOrderTransaction) {
		this.dateOrderTransaction = dateOrderTransaction;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDocumentCompany() {
		return this.documentCompany;
	}

	public void setDocumentCompany(String documentCompany) {
		this.documentCompany = documentCompany;
	}

	public Long getDocumentOrderNoInvoice() {
		return this.documentOrderNoInvoice;
	}

	public void setDocumentOrderNoInvoice(Long documentOrderNoInvoice) {
		this.documentOrderNoInvoice = documentOrderNoInvoice;
	}

	public String getDocumentPayItem() {
		return this.documentPayItem;
	}

	public void setDocumentPayItem(String documentPayItem) {
		this.documentPayItem = documentPayItem;
	}

	public Long getDocumentTypeId() {
		return this.documentTypeId;
	}

	public void setDocumentTypeId(Long documentTypeId) {
		this.documentTypeId = documentTypeId;
	}

	public Long getDocumentVoucherInvoice() {
		return this.documentVoucherInvoice;
	}

	public void setDocumentVoucherInvoice(Long documentVoucherInvoice) {
		this.documentVoucherInvoice = documentVoucherInvoice;
	}

	public String getExplanationTransaction() {
		return this.explanationTransaction;
	}

	public void setExplanationTransaction(String explanationTransaction) {
		this.explanationTransaction = explanationTransaction;
	}

	public String getFromTo() {
		return this.fromTo;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	public String getHistoricalDate() {
		return this.historicalDate;
	}

	public void setHistoricalDate(String historicalDate) {
		this.historicalDate = historicalDate;
	}

	public String getItemNumber2() {
		return this.itemNumber2;
	}

	public void setItemNumber2(String itemNumber2) {
		this.itemNumber2 = itemNumber2;
	}

	public String getItemNumber3() {
		return this.itemNumber3;
	}

	public void setItemNumber3(String itemNumber3) {
		this.itemNumber3 = itemNumber3;
	}

	public Long getJournalEntryLineNumber() {
		return this.journalEntryLineNumber;
	}

	public void setJournalEntryLineNumber(Long journalEntryLineNumber) {
		this.journalEntryLineNumber = journalEntryLineNumber;
	}

	public String getLicensePlateNumber() {
		return this.licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public Long getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getLotGradeId() {
		return this.lotGradeId;
	}

	public void setLotGradeId(Long lotGradeId) {
		this.lotGradeId = lotGradeId;
	}

	public String getLotMasterCardexYN() {
		return this.lotMasterCardexYN;
	}

	public void setLotMasterCardexYN(String lotMasterCardexYN) {
		this.lotMasterCardexYN = lotMasterCardexYN;
	}

	public Long getLotPotencyId() {
		return this.lotPotencyId;
	}

	public void setLotPotencyId(Long lotPotencyId) {
		this.lotPotencyId = lotPotencyId;
	}

	public String getLotSerialNumber() {
		return this.lotSerialNumber;
	}

	public void setLotSerialNumber(String lotSerialNumber) {
		this.lotSerialNumber = lotSerialNumber;
	}

	public String getLotStatusCodeExpanded() {
		return this.lotStatusCodeExpanded;
	}

	public void setLotStatusCodeExpanded(String lotStatusCodeExpanded) {
		this.lotStatusCodeExpanded = lotStatusCodeExpanded;
	}

	public Long getLotStatusCodeId() {
		return this.lotStatusCodeId;
	}

	public void setLotStatusCodeId(Long lotStatusCodeId) {
		this.lotStatusCodeId = lotStatusCodeId;
	}

	public Long getLotStatusReasonCodeId() {
		return this.lotStatusReasonCodeId;
	}

	public void setLotStatusReasonCodeId(Long lotStatusReasonCodeId) {
		this.lotStatusReasonCodeId = lotStatusReasonCodeId;
	}

	public Long getNumberOfLines() {
		return this.numberOfLines;
	}

	public void setNumberOfLines(Long numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public String getObjectAccount() {
		return this.objectAccount;
	}

	public void setObjectAccount(String objectAccount) {
		this.objectAccount = objectAccount;
	}

	public String getOrderCompanyOrderNumber() {
		return this.orderCompanyOrderNumber;
	}

	public void setOrderCompanyOrderNumber(String orderCompanyOrderNumber) {
		this.orderCompanyOrderNumber = orderCompanyOrderNumber;
	}

	public Long getOrderTypeId() {
		return this.orderTypeId;
	}

	public void setOrderTypeId(Long orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	public Long getParentItemNumberShort() {
		return this.parentItemNumberShort;
	}

	public void setParentItemNumberShort(Long parentItemNumberShort) {
		this.parentItemNumberShort = parentItemNumberShort;
	}

	public String getParentLot() {
		return this.parentLot;
	}

	public void setParentLot(String parentLot) {
		this.parentLot = parentLot;
	}

	public String getProductionNumber() {
		return this.productionNumber;
	}

	public void setProductionNumber(String productionNumber) {
		this.productionNumber = productionNumber;
	}

	public Long getProductionNumberShort() {
		return this.productionNumberShort;
	}

	public void setProductionNumberShort(Long productionNumberShort) {
		this.productionNumberShort = productionNumberShort;
	}

	public Long getQuantityAvailable() {
		return this.quantityAvailable;
	}

	public void setQuantityAvailable(Long quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public Long getReasonCodeId() {
		return this.reasonCodeId;
	}

	public void setReasonCodeId(Long reasonCodeId) {
		this.reasonCodeId = reasonCodeId;
	}

	public String getReconciliationDate() {
		return this.reconciliationDate;
	}

	public void setReconciliationDate(String reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}

	public Long getRelatedFromLineNumber() {
		return this.relatedFromLineNumber;
	}

	public void setRelatedFromLineNumber(Long relatedFromLineNumber) {
		this.relatedFromLineNumber = relatedFromLineNumber;
	}

	public String getReverseOrVoid() {
		return this.reverseOrVoid;
	}

	public void setReverseOrVoid(String reverseOrVoid) {
		this.reverseOrVoid = reverseOrVoid;
	}

	public Long getSequenceNumberLocationDetail() {
		return this.sequenceNumberLocationDetail;
	}

	public void setSequenceNumberLocationDetail(Long sequenceNumberLocationDetail) {
		this.sequenceNumberLocationDetail = sequenceNumberLocationDetail;
	}

	public Long getSequenceNumberOperations() {
		return this.sequenceNumberOperations;
	}

	public void setSequenceNumberOperations(Long sequenceNumberOperations) {
		this.sequenceNumberOperations = sequenceNumberOperations;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Long getStorageUnitNumber() {
		return this.storageUnitNumber;
	}

	public void setStorageUnitNumber(Long storageUnitNumber) {
		this.storageUnitNumber = storageUnitNumber;
	}

	public String getSubledgerGl() {
		return this.subledgerGl;
	}

	public void setSubledgerGl(String subledgerGl) {
		this.subledgerGl = subledgerGl;
	}

	public String getSubledgerType() {
		return this.subledgerType;
	}

	public void setSubledgerType(String subledgerType) {
		this.subledgerType = subledgerType;
	}

	public String getSubsidiary() {
		return this.subsidiary;
	}

	public void setSubsidiary(String subsidiary) {
		this.subsidiary = subsidiary;
	}

	public String getSupplierLotNumber() {
		return this.supplierLotNumber;
	}

	public void setSupplierLotNumber(String supplierLotNumber) {
		this.supplierLotNumber = supplierLotNumber;
	}

	public String getTerminalIdentification() {
		return this.terminalIdentification;
	}

	public void setTerminalIdentification(String terminalIdentification) {
		this.terminalIdentification = terminalIdentification;
	}

	public String getTimeOfDay() {
		return this.timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public Long getTransactionGroupNumber() {
		return this.transactionGroupNumber;
	}

	public void setTransactionGroupNumber(Long transactionGroupNumber) {
		this.transactionGroupNumber = transactionGroupNumber;
	}

	public Long getTransactionLineNumber() {
		return this.transactionLineNumber;
	}

	public void setTransactionLineNumber(Long transactionLineNumber) {
		this.transactionLineNumber = transactionLineNumber;
	}

	public String getTransactionReference() {
		return this.transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getUnitofMeasureSecondaryId() {
		return this.unitofMeasureSecondaryId;
	}

	public void setUnitofMeasureSecondaryId(String unitofMeasureSecondaryId) {
		this.unitofMeasureSecondaryId = unitofMeasureSecondaryId;
	}

	public Long getUnitofMeasureTransactionId() {
		return this.unitofMeasureTransactionId;
	}

	public void setUnitofMeasureTransactionId(Long unitofMeasureTransactionId) {
		this.unitofMeasureTransactionId = unitofMeasureTransactionId;
	}

	public String getUnitsSecondaryQuantityOrdered() {
		return this.unitsSecondaryQuantityOrdered;
	}

	public void setUnitsSecondaryQuantityOrdered(String unitsSecondaryQuantityOrdered) {
		this.unitsSecondaryQuantityOrdered = unitsSecondaryQuantityOrdered;
	}

	public String getValuationPeriodEndingDate() {
		return this.valuationPeriodEndingDate;
	}

	public void setValuationPeriodEndingDate(String valuationPeriodEndingDate) {
		this.valuationPeriodEndingDate = valuationPeriodEndingDate;
	}

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

	public ItemTransactionMaster getItemTransactionMaster() {
		return this.itemTransactionMaster;
	}

	public void setItemTransactionMaster(ItemTransactionMaster itemTransactionMaster) {
		this.itemTransactionMaster = itemTransactionMaster;
	}

}