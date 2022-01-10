package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ContractDetailsWorkAudits database table.
 * 
 */
@Entity
@Table(name="ContractDetailsWorkAudits")
@NamedQuery(name="ContractDetailsWorkAudit.findAll", query="SELECT c FROM ContractDetailsWorkAudit c")
public class ContractDetailsWorkAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="ActualShipDate")
	private Timestamp actualShipDate;

	@Column(name="BidSpecificationDocumentNumber")
	private String bidSpecificationDocumentNumber;

	@Column(name="CancelDate")
	private Timestamp cancelDate;

	@Column(name="CommodityCode")
	private String commodityCode;

	@Column(name="ContractEndDate")
	private Timestamp contractEndDate;

	@Column(name="ContractNo")
	private Long contractNo;

	@Column(name="ContractStartDate")
	private Timestamp contractStartDate;

	@Column(name="ContractType")
	private String contractType;

	@Column(name="ContractTypeId")
	private Long contractTypeId;

	@Column(name="Currency")
	private String currency;

	@Column(name="CurrencyId")
	private Long currencyId;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="DeliveryInstructionsId")
	private Long deliveryInstructionsId;

	@Column(name="DeliveryInstructionsType")
	private String deliveryInstructionsType;

	@Column(name="EscalationDate")
	private Timestamp escalationDate;

	@Column(name="ExtendedPrice")
	private Long extendedPrice;

	@Column(name="FiscalYear")
	private String fiscalYear;

	@Column(name="FreightNo")
	private Long freightNo;

	@Column(name="FutureDate2")
	private Timestamp futureDate2;

	@Column(name="Gldate")
	private Timestamp gldate;

	@Column(name="GrossWeight")
	private Long grossWeight;

	@Column(name="HeadDepartmentAccountingOffice")
	private String headDepartmentAccountingOffice;

	@Column(name="HodAccountingOfficerId")
	private Long hodAccountingOfficerId;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemNo")
	private Long itemNo;

	@Column(name="LineNo")
	private Long lineNo;

	@Column(name="LoadNo")
	private Long loadNo;

	@Column(name="ModeOfTransport")
	private String modeOfTransport;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="OnHoldAmount")
	private Long onHoldAmount;

	@Column(name="OpenAmount")
	private Long openAmount;

	@Column(name="OrderTransaction")
	private Timestamp orderTransaction;

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="OriginalPromisedDeliveryDate")
	private Timestamp originalPromisedDeliveryDate;

	@Column(name="ParentItemNo")
	private Long parentItemNo;

	@Column(name="PeriodNo")
	private String periodNo;

	@Column(name="PriceEffectiveDate")
	private Timestamp priceEffectiveDate;

	@Column(name="QuantityOnHold")
	private Long quantityOnHold;

	@Column(name="QuantityOpen")
	private Long quantityOpen;

	@Column(name="QuantityOrdered")
	private Long quantityOrdered;

	@Column(name="QuantityReceipted")
	private Long quantityReceipted;

	@Column(name="QuantityRelieved")
	private Long quantityRelieved;

	@Column(name="QuantityReturned")
	private Long quantityReturned;

	@Column(name="ReceivedAmount")
	private Long receivedAmount;

	@Column(name="ReceivingUnit")
	private String receivingUnit;

	@Column(name="RelievedAmount")
	private Long relievedAmount;

	@Column(name="RepresentativeCapacity")
	private String representativeCapacity;

	@Column(name="Requested")
	private Long requested;

	@Column(name="RequestedTime")
	private String requestedTime;

	@Column(name="RequestingUnitId")
	private Long requestingUnitId;

	@Column(name="Requestor")
	private String requestor;

	@Column(name="RequestorId")
	private Long requestorId;

	@Column(name="ResolutionNumber")
	private String resolutionNumber;

	@Column(name="RetentionYN", nullable=false)
	private Boolean retentionYN;

	@Column(name="ScheduledPickDate")
	private Timestamp scheduledPickDate;

	@Column(name="ServiceProviderRepresentative")
	private String serviceProviderRepresentative;

	@Column(name="ShipmentDate")
	private Timestamp shipmentDate;

	@Column(name="ShipmentNo")
	private Long shipmentNo;

	@Column(name="StatusFrom")
	private String statusFrom;

	@Column(name="StatusId", nullable=false)
	private Long statusId;

	@Column(name="StatusReasonId")
	private Long statusReasonId;

	@Column(name="StatusTo")
	private String statusTo;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierShippedFrom")
	private String supplierShippedFrom;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="TaxCommitmentAmount")
	private Long taxCommitmentAmount;

	@Column(name="TaxDate")
	private Timestamp taxDate;

	@Column(name="TaxRelievedAmount")
	private Long taxRelievedAmount;

	@Column(name="TenderNumber")
	private String tenderNumber;

	@Column(name="TransactionOriginator")
	private String transactionOriginator;

	@Column(name="TransactionOriginatorId")
	private Long transactionOriginatorId;

	@Column(name="Unit")
	private String unit;

	@Column(name="UnitCost")
	private Long unitCost;

	@Column(name="UnitOfMeasureMatching")
	private String unitOfMeasureMatching;

	@Column(name="UnitOfMeasurePrimary")
	private Long unitOfMeasurePrimary;

	@Column(name="UnitOfMeasurePurchasing")
	private String unitOfMeasurePurchasing;

	@Column(name="UnitOfMeasureReceived")
	private String unitOfMeasureReceived;

	@Column(name="UnitOfMeasureShipped")
	private String unitOfMeasureShipped;

	@Column(name="VolumeUnits")
	private Long volumeUnits;

	@Column(name="VoteNoSegment1")
	private String voteNoSegment1;

	@Column(name="VoteNoSegment10")
	private String voteNoSegment10;

	@Column(name="VoteNoSegment11")
	private String voteNoSegment11;

	@Column(name="VoteNoSegment2")
	private String voteNoSegment2;

	@Column(name="VoteNoSegment3")
	private String voteNoSegment3;

	@Column(name="VoteNoSegment4")
	private String voteNoSegment4;

	@Column(name="VoteNoSegment5")
	private String voteNoSegment5;

	@Column(name="VoteNoSegment6")
	private String voteNoSegment6;

	@Column(name="VoteNoSegment7")
	private String voteNoSegment7;

	@Column(name="VoteNoSegment8")
	private String voteNoSegment8;

	@Column(name="VoteNoSegment9")
	private String voteNoSegment9;

	//bi-directional many-to-one association to ContractMaster
	@ManyToOne
	@JoinColumn(name="ContractMasterId")
	private ContractMaster contractMaster;

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
	@JoinColumn(name="UnitId")
	private UserCode userCode;

	public ContractDetailsWorkAudit() {
	}

	public Long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Timestamp getActualShipDate() {
		return this.actualShipDate;
	}

	public void setActualShipDate(Timestamp actualShipDate) {
		this.actualShipDate = actualShipDate;
	}

	public String getBidSpecificationDocumentNumber() {
		return this.bidSpecificationDocumentNumber;
	}

	public void setBidSpecificationDocumentNumber(String bidSpecificationDocumentNumber) {
		this.bidSpecificationDocumentNumber = bidSpecificationDocumentNumber;
	}

	public Timestamp getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(Timestamp cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public Timestamp getContractEndDate() {
		return this.contractEndDate;
	}

	public void setContractEndDate(Timestamp contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public Long getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Long contractNo) {
		this.contractNo = contractNo;
	}

	public Timestamp getContractStartDate() {
		return this.contractStartDate;
	}

	public void setContractStartDate(Timestamp contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractType() {
		return this.contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Long getContractTypeId() {
		return this.contractTypeId;
	}

	public void setContractTypeId(Long contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public Long getDeliveryInstructionsId() {
		return this.deliveryInstructionsId;
	}

	public void setDeliveryInstructionsId(Long deliveryInstructionsId) {
		this.deliveryInstructionsId = deliveryInstructionsId;
	}

	public String getDeliveryInstructionsType() {
		return this.deliveryInstructionsType;
	}

	public void setDeliveryInstructionsType(String deliveryInstructionsType) {
		this.deliveryInstructionsType = deliveryInstructionsType;
	}

	public Timestamp getEscalationDate() {
		return this.escalationDate;
	}

	public void setEscalationDate(Timestamp escalationDate) {
		this.escalationDate = escalationDate;
	}

	public Long getExtendedPrice() {
		return this.extendedPrice;
	}

	public void setExtendedPrice(Long extendedPrice) {
		this.extendedPrice = extendedPrice;
	}

	public String getFiscalYear() {
		return this.fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public Long getFreightNo() {
		return this.freightNo;
	}

	public void setFreightNo(Long freightNo) {
		this.freightNo = freightNo;
	}

	public Timestamp getFutureDate2() {
		return this.futureDate2;
	}

	public void setFutureDate2(Timestamp futureDate2) {
		this.futureDate2 = futureDate2;
	}

	public Timestamp getGldate() {
		return this.gldate;
	}

	public void setGldate(Timestamp gldate) {
		this.gldate = gldate;
	}

	public Long getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(Long grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getHeadDepartmentAccountingOffice() {
		return this.headDepartmentAccountingOffice;
	}

	public void setHeadDepartmentAccountingOffice(String headDepartmentAccountingOffice) {
		this.headDepartmentAccountingOffice = headDepartmentAccountingOffice;
	}

	public Long getHodAccountingOfficerId() {
		return this.hodAccountingOfficerId;
	}

	public void setHodAccountingOfficerId(Long hodAccountingOfficerId) {
		this.hodAccountingOfficerId = hodAccountingOfficerId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	public Long getLineNo() {
		return this.lineNo;
	}

	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}

	public Long getLoadNo() {
		return this.loadNo;
	}

	public void setLoadNo(Long loadNo) {
		this.loadNo = loadNo;
	}

	public String getModeOfTransport() {
		return this.modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public Long getOnHoldAmount() {
		return this.onHoldAmount;
	}

	public void setOnHoldAmount(Long onHoldAmount) {
		this.onHoldAmount = onHoldAmount;
	}

	public Long getOpenAmount() {
		return this.openAmount;
	}

	public void setOpenAmount(Long openAmount) {
		this.openAmount = openAmount;
	}

	public Timestamp getOrderTransaction() {
		return this.orderTransaction;
	}

	public void setOrderTransaction(Timestamp orderTransaction) {
		this.orderTransaction = orderTransaction;
	}

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public Timestamp getOriginalPromisedDeliveryDate() {
		return this.originalPromisedDeliveryDate;
	}

	public void setOriginalPromisedDeliveryDate(Timestamp originalPromisedDeliveryDate) {
		this.originalPromisedDeliveryDate = originalPromisedDeliveryDate;
	}

	public Long getParentItemNo() {
		return this.parentItemNo;
	}

	public void setParentItemNo(Long parentItemNo) {
		this.parentItemNo = parentItemNo;
	}

	public String getPeriodNo() {
		return this.periodNo;
	}

	public void setPeriodNo(String periodNo) {
		this.periodNo = periodNo;
	}

	public Timestamp getPriceEffectiveDate() {
		return this.priceEffectiveDate;
	}

	public void setPriceEffectiveDate(Timestamp priceEffectiveDate) {
		this.priceEffectiveDate = priceEffectiveDate;
	}

	public Long getQuantityOnHold() {
		return this.quantityOnHold;
	}

	public void setQuantityOnHold(Long quantityOnHold) {
		this.quantityOnHold = quantityOnHold;
	}

	public Long getQuantityOpen() {
		return this.quantityOpen;
	}

	public void setQuantityOpen(Long quantityOpen) {
		this.quantityOpen = quantityOpen;
	}

	public Long getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(Long quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Long getQuantityReceipted() {
		return this.quantityReceipted;
	}

	public void setQuantityReceipted(Long quantityReceipted) {
		this.quantityReceipted = quantityReceipted;
	}

	public Long getQuantityRelieved() {
		return this.quantityRelieved;
	}

	public void setQuantityRelieved(Long quantityRelieved) {
		this.quantityRelieved = quantityRelieved;
	}

	public Long getQuantityReturned() {
		return this.quantityReturned;
	}

	public void setQuantityReturned(Long quantityReturned) {
		this.quantityReturned = quantityReturned;
	}

	public Long getReceivedAmount() {
		return this.receivedAmount;
	}

	public void setReceivedAmount(Long receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public String getReceivingUnit() {
		return this.receivingUnit;
	}

	public void setReceivingUnit(String receivingUnit) {
		this.receivingUnit = receivingUnit;
	}

	public Long getRelievedAmount() {
		return this.relievedAmount;
	}

	public void setRelievedAmount(Long relievedAmount) {
		this.relievedAmount = relievedAmount;
	}

	public String getRepresentativeCapacity() {
		return this.representativeCapacity;
	}

	public void setRepresentativeCapacity(String representativeCapacity) {
		this.representativeCapacity = representativeCapacity;
	}

	public Long getRequested() {
		return this.requested;
	}

	public void setRequested(Long requested) {
		this.requested = requested;
	}

	public String getRequestedTime() {
		return this.requestedTime;
	}

	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}

	public Long getRequestingUnitId() {
		return this.requestingUnitId;
	}

	public void setRequestingUnitId(Long requestingUnitId) {
		this.requestingUnitId = requestingUnitId;
	}

	public String getRequestor() {
		return this.requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public Long getRequestorId() {
		return this.requestorId;
	}

	public void setRequestorId(Long requestorId) {
		this.requestorId = requestorId;
	}

	public String getResolutionNumber() {
		return this.resolutionNumber;
	}

	public void setResolutionNumber(String resolutionNumber) {
		this.resolutionNumber = resolutionNumber;
	}

	public Boolean getRetentionYN() {
		return this.retentionYN;
	}

	public void setRetentionYN(Boolean retentionYN) {
		this.retentionYN = retentionYN;
	}

	public Timestamp getScheduledPickDate() {
		return this.scheduledPickDate;
	}

	public void setScheduledPickDate(Timestamp scheduledPickDate) {
		this.scheduledPickDate = scheduledPickDate;
	}

	public String getServiceProviderRepresentative() {
		return this.serviceProviderRepresentative;
	}

	public void setServiceProviderRepresentative(String serviceProviderRepresentative) {
		this.serviceProviderRepresentative = serviceProviderRepresentative;
	}

	public Timestamp getShipmentDate() {
		return this.shipmentDate;
	}

	public void setShipmentDate(Timestamp shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Long getShipmentNo() {
		return this.shipmentNo;
	}

	public void setShipmentNo(Long shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	public String getStatusFrom() {
		return this.statusFrom;
	}

	public void setStatusFrom(String statusFrom) {
		this.statusFrom = statusFrom;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getStatusReasonId() {
		return this.statusReasonId;
	}

	public void setStatusReasonId(Long statusReasonId) {
		this.statusReasonId = statusReasonId;
	}

	public String getStatusTo() {
		return this.statusTo;
	}

	public void setStatusTo(String statusTo) {
		this.statusTo = statusTo;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierShippedFrom() {
		return this.supplierShippedFrom;
	}

	public void setSupplierShippedFrom(String supplierShippedFrom) {
		this.supplierShippedFrom = supplierShippedFrom;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public Long getTaxCommitmentAmount() {
		return this.taxCommitmentAmount;
	}

	public void setTaxCommitmentAmount(Long taxCommitmentAmount) {
		this.taxCommitmentAmount = taxCommitmentAmount;
	}

	public Timestamp getTaxDate() {
		return this.taxDate;
	}

	public void setTaxDate(Timestamp taxDate) {
		this.taxDate = taxDate;
	}

	public Long getTaxRelievedAmount() {
		return this.taxRelievedAmount;
	}

	public void setTaxRelievedAmount(Long taxRelievedAmount) {
		this.taxRelievedAmount = taxRelievedAmount;
	}

	public String getTenderNumber() {
		return this.tenderNumber;
	}

	public void setTenderNumber(String tenderNumber) {
		this.tenderNumber = tenderNumber;
	}

	public String getTransactionOriginator() {
		return this.transactionOriginator;
	}

	public void setTransactionOriginator(String transactionOriginator) {
		this.transactionOriginator = transactionOriginator;
	}

	public Long getTransactionOriginatorId() {
		return this.transactionOriginatorId;
	}

	public void setTransactionOriginatorId(Long transactionOriginatorId) {
		this.transactionOriginatorId = transactionOriginatorId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(Long unitCost) {
		this.unitCost = unitCost;
	}

	public String getUnitOfMeasureMatching() {
		return this.unitOfMeasureMatching;
	}

	public void setUnitOfMeasureMatching(String unitOfMeasureMatching) {
		this.unitOfMeasureMatching = unitOfMeasureMatching;
	}

	public Long getUnitOfMeasurePrimary() {
		return this.unitOfMeasurePrimary;
	}

	public void setUnitOfMeasurePrimary(Long unitOfMeasurePrimary) {
		this.unitOfMeasurePrimary = unitOfMeasurePrimary;
	}

	public String getUnitOfMeasurePurchasing() {
		return this.unitOfMeasurePurchasing;
	}

	public void setUnitOfMeasurePurchasing(String unitOfMeasurePurchasing) {
		this.unitOfMeasurePurchasing = unitOfMeasurePurchasing;
	}

	public String getUnitOfMeasureReceived() {
		return this.unitOfMeasureReceived;
	}

	public void setUnitOfMeasureReceived(String unitOfMeasureReceived) {
		this.unitOfMeasureReceived = unitOfMeasureReceived;
	}

	public String getUnitOfMeasureShipped() {
		return this.unitOfMeasureShipped;
	}

	public void setUnitOfMeasureShipped(String unitOfMeasureShipped) {
		this.unitOfMeasureShipped = unitOfMeasureShipped;
	}

	public Long getVolumeUnits() {
		return this.volumeUnits;
	}

	public void setVolumeUnits(Long volumeUnits) {
		this.volumeUnits = volumeUnits;
	}

	public String getVoteNoSegment1() {
		return this.voteNoSegment1;
	}

	public void setVoteNoSegment1(String voteNoSegment1) {
		this.voteNoSegment1 = voteNoSegment1;
	}

	public String getVoteNoSegment10() {
		return this.voteNoSegment10;
	}

	public void setVoteNoSegment10(String voteNoSegment10) {
		this.voteNoSegment10 = voteNoSegment10;
	}

	public String getVoteNoSegment11() {
		return this.voteNoSegment11;
	}

	public void setVoteNoSegment11(String voteNoSegment11) {
		this.voteNoSegment11 = voteNoSegment11;
	}

	public String getVoteNoSegment2() {
		return this.voteNoSegment2;
	}

	public void setVoteNoSegment2(String voteNoSegment2) {
		this.voteNoSegment2 = voteNoSegment2;
	}

	public String getVoteNoSegment3() {
		return this.voteNoSegment3;
	}

	public void setVoteNoSegment3(String voteNoSegment3) {
		this.voteNoSegment3 = voteNoSegment3;
	}

	public String getVoteNoSegment4() {
		return this.voteNoSegment4;
	}

	public void setVoteNoSegment4(String voteNoSegment4) {
		this.voteNoSegment4 = voteNoSegment4;
	}

	public String getVoteNoSegment5() {
		return this.voteNoSegment5;
	}

	public void setVoteNoSegment5(String voteNoSegment5) {
		this.voteNoSegment5 = voteNoSegment5;
	}

	public String getVoteNoSegment6() {
		return this.voteNoSegment6;
	}

	public void setVoteNoSegment6(String voteNoSegment6) {
		this.voteNoSegment6 = voteNoSegment6;
	}

	public String getVoteNoSegment7() {
		return this.voteNoSegment7;
	}

	public void setVoteNoSegment7(String voteNoSegment7) {
		this.voteNoSegment7 = voteNoSegment7;
	}

	public String getVoteNoSegment8() {
		return this.voteNoSegment8;
	}

	public void setVoteNoSegment8(String voteNoSegment8) {
		this.voteNoSegment8 = voteNoSegment8;
	}

	public String getVoteNoSegment9() {
		return this.voteNoSegment9;
	}

	public void setVoteNoSegment9(String voteNoSegment9) {
		this.voteNoSegment9 = voteNoSegment9;
	}

	public ContractMaster getContractMaster() {
		return this.contractMaster;
	}

	public void setContractMaster(ContractMaster contractMaster) {
		this.contractMaster = contractMaster;
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

	public UserCode getUserCode() {
		return this.userCode;
	}

	public void setUserCode(UserCode userCode) {
		this.userCode = userCode;
	}

}