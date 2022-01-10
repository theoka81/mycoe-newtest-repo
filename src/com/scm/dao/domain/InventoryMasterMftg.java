package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the InventoryMasterMftgs database table.
 * 
 */
@Entity
@Table(name="InventoryMasterMftgs")
@NamedQuery(name="InventoryMasterMftg.findAll", query="SELECT i FROM InventoryMasterMftg i")
public class InventoryMasterMftg implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AbcCode1MarginInventory")
	private String abcCode1MarginInventory;

	@Column(name="AbcCode1SalesInventory")
	private String abcCode1SalesInventory;

	@Column(name="AbcCode3InvestmentInventory")
	private String abcCode3InvestmentInventory;

	@Column(name="AbcCodeOverrideIndicator")
	private String abcCodeOverrideIndicator;

	@Column(name="ActiveIngredientFlag")
	private String activeIngredientFlag;

	@Column(name="AllowShippingofHeldLots")
	private String allowShippingofHeldLots;

	@Column(name="ApsPlanningUom")
	private String apsPlanningUom;

	@Column(name="AtoForecastControl")
	private String atoForecastControl;

	@Column(name="AtpComponents")
	private String atpComponents;

	@Column(name="AtpRuleName")
	private String atpRuleName;

	@Column(name="BackordersAllowed", nullable=false)
	private Boolean backordersAllowed;

	@Column(name="BestBeforeDefaultDays")
	private Long bestBeforeDefaultDays;

	@Column(name="BulkPackedFlag", nullable=false)
	private Boolean bulkPackedFlag;

	@Column(name="CheckAtp")
	private String checkAtp;

	@Column(name="CheckAvailability", nullable=false)
	private Boolean checkAvailability;

	@Column(name="CommitmentDateMethod")
	private String commitmentDateMethod;

	@Column(name="CommitmentMethod")
	private String commitmentMethod;

	@Column(name="CommitmentSpecificDays")
	private Long commitmentSpecificDays;

	@Column(name="ComponentType")
	private String componentType;

	@Column(name="Composition")
	private String composition;

	@Column(name="ConstraintsFlag")
	private String constraintsFlag;

	@Column(name="Consumable")
	private String consumable;

	@Column(name="ContractItem")
	private String contractItem;

	@Column(name="CoProductsByProductsIntermediate")
	private String coProductsByProductsIntermediate;

	@Column(name="CountryofOriginRequiredFlag")
	private String countryofOriginRequiredFlag;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CrossDockingFlag")
	private String crossDockingFlag;

	@Column(name="CumulativeThresholdUnitofMeasure")
	private String cumulativeThresholdUnitofMeasure;

	@Column(name="DeferDamperDays")
	private Long deferDamperDays;

	@Column(name="DemandFlowEndItemFlag")
	private String demandFlowEndItemFlag;

	@Column(name="DualPickingProcessOption")
	private String dualPickingProcessOption;

	@Column(name="DualTolerance")
	private Long dualTolerance;

	@Column(name="DualUnitOfMeasureItem")
	private String dualUnitOfMeasureItem;

	@Column(name="ExpediteDamperDays")
	private Long expediteDamperDays;

	@Column(name="ExplodeItem")
	private String explodeItem;

	@Column(name="FixedorVariableLeadtime")
	private Long fixedorVariableLeadtime;

	@Column(name="FreezeTimeFenceDays")
	private Long freezeTimeFenceDays;

	@Column(name="FromGrade")
	private String fromGrade;

	@Column(name="FromPotency")
	private String fromPotency;

	@Column(name="GradeControl")
	private String gradeControl;

	@Column(name="GradePotencyPricing")
	private Long gradePotencyPricing;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IssueTypeCode")
	private String issueTypeCode;

	@Column(name="ItemFlashMessage")
	private String itemFlashMessage;

	@Column(name="ItemId")
	private Long itemId;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="KanbanExplodetoLowerLevel")
	private String kanbanExplodetoLowerLevel;

	@Column(name="KanbanItem")
	private String kanbanItem;

	@Column(name="LayerCodeSource")
	private String layerCodeSource;

	@Column(name="LeadtimeCumulative")
	private Long leadtimeCumulative;

	@Column(name="LeadtimeLevel")
	private Long leadtimeLevel;

	@Column(name="LeadtimeMFG")
	private Long leadtimeMFG;

	@Column(name="LeadtimePerUnit")
	private String leadtimePerUnit;

	@Column(name="LeanManufacturingFlag")
	private String leanManufacturingFlag;

	@Column(name="LevelInventoryCost")
	private Long levelInventoryCost;

	@Column(name="LevelPurchasePrice")
	private Long levelPurchasePrice;

	@Column(name="LevelSalesBasePrice")
	private Long levelSalesBasePrice;

	@Column(name="LineCellIdentifier")
	private String lineCellIdentifier;

	@Column(name="LineType")
	private String lineType;

	@Column(name="LotAuditFlag")
	private String lotAuditFlag;

	@Column(name="LotEffectiveDefaultDays")
	private Long lotEffectiveDefaultDays;

	@Column(name="LotExpiratonDateCalculationMethod")
	private Long lotExpiratonDateCalculationMethod;

	@Column(name="LotNoPreAssignment")
	private String lotNoPreAssignment;

	@Column(name="LotStatusCodeExpanded")
	private String lotStatusCodeExpanded;

	@Column(name="LowLevelCode")
	private Long lowLevelCode;

	@Column(name="MakeBuyCode")
	private Long makeBuyCode;

	@Column(name="MarginMaintenancePercentage")
	private String marginMaintenancePercentage;

	@Column(name="MaterialStatus")
	private String materialStatus;

	@Column(name="MatrixControlled")
	private String matrixControlled;

	@Column(name="MaximumCumulativeThreshold")
	private String maximumCumulativeThreshold;

	@Column(name="MaximumOperationalThreshold")
	private String maximumOperationalThreshold;

	@Column(name="MessageTimeFenceDays")
	private Long messageTimeFenceDays;

	@Column(name="MethodConfiguratorCosting")
	private String methodConfiguratorCosting;

	@Column(name="MinimumCumulativeThreshold")
	private String minimumCumulativeThreshold;

	@Column(name="MinimumOperationalThreshold")
	private String minimumOperationalThreshold;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	private Long MPSMRPTimeFence4;

	@Column(name="OperationalThresholdUnitofMeasure")
	private String operationalThresholdUnitofMeasure;

	@Column(name="OrderPolicyCode")
	private Long orderPolicyCode;

	@Column(name="OrderWith")
	private String orderWith;

	@Column(name="PercentMargin")
	private String percentMargin;

	@Column(name="PlannerNo")
	private Long plannerNo;

	@Column(name="PlanningCode")
	private Long planningCode;

	@Column(name="PlanningTimeFenceDays")
	private Long planningTimeFenceDays;

	@Column(name="PlanningTimeFenceRule")
	private String planningTimeFenceRule;

	@Column(name="PotencyControl")
	private String potencyControl;

	@Column(name="PrintMessage")
	private String printMessage;

	@Column(name="PriorityOneAlertLevel")
	private String priorityOneAlertLevel;

	@Column(name="PriorityTwoAlertLevel")
	private String priorityTwoAlertLevel;

	@Column(name="ProductionNoControlled")
	private String productionNoControlled;

	@Column(name="PurchasingEffectiveDays")
	private Long purchasingEffectiveDays;

	@Column(name="QuantityAccountingCost")
	private Long quantityAccountingCost;

	@Column(name="QuantityMfgLeadtime")
	private Long quantityMfgLeadtime;

	@Column(name="RestrictWorkOrderLotAssignment")
	private String restrictWorkOrderLotAssignment;

	@Column(name="RoundtoWholeNo")
	private Long roundtoWholeNo;

	@Column(name="SafetyLeadtime")
	private Long safetyLeadtime;

	@Column(name="Segment1")
	private String segment1;

	@Column(name="Segment10")
	private String segment10;

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

	@Column(name="Segment8")
	private String segment8;

	@Column(name="Segment9")
	private String segment9;

	@Column(name="SellableItem")
	private String sellableItem;

	@Column(name="SellByDefaultDays")
	private Long sellByDefaultDays;

	@Column(name="ShipmentLeadtimeOffset")
	private Long shipmentLeadtimeOffset;

	@Column(name="SpecialLotFormat")
	private String specialLotFormat;

	@Column(name="StandardGrade")
	private String standardGrade;

	@Column(name="StandardPotency")
	private String standardPotency;

	@Column(name="StandardUnitofMeasureConversion")
	private String standardUnitofMeasureConversion;

	@Column(name="StockingType")
	private String stockingType;

	@Column(name="Template")
	private String template;

	@Column(name="ThruGrade")
	private String thruGrade;

	@Column(name="ThruPotency")
	private String thruPotency;

	@Column(name="TotalProductCycleTime")
	private String totalProductCycleTime;

	@Column(name="UserLotDate1DefaultDays")
	private Long userLotDate1DefaultDays;

	@Column(name="UserLotDate2DefaultDays")
	private Long userLotDate2DefaultDays;

	@Column(name="UserLotDate3DefaultDays")
	private Long userLotDate3DefaultDays;

	@Column(name="UserLotDate4DefaultDays")
	private Long userLotDate4DefaultDays;

	@Column(name="UserLotDate5DefaultDays")
	private Long userLotDate5DefaultDays;

	@Column(name="ValueOrderPolicy")
	private Long valueOrderPolicy;

	@Column(name="VendorManagedInventory")
	private String vendorManagedInventory;

	public InventoryMasterMftg() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAbcCode1MarginInventory() {
		return this.abcCode1MarginInventory;
	}

	public void setAbcCode1MarginInventory(String abcCode1MarginInventory) {
		this.abcCode1MarginInventory = abcCode1MarginInventory;
	}

	public String getAbcCode1SalesInventory() {
		return this.abcCode1SalesInventory;
	}

	public void setAbcCode1SalesInventory(String abcCode1SalesInventory) {
		this.abcCode1SalesInventory = abcCode1SalesInventory;
	}

	public String getAbcCode3InvestmentInventory() {
		return this.abcCode3InvestmentInventory;
	}

	public void setAbcCode3InvestmentInventory(String abcCode3InvestmentInventory) {
		this.abcCode3InvestmentInventory = abcCode3InvestmentInventory;
	}

	public String getAbcCodeOverrideIndicator() {
		return this.abcCodeOverrideIndicator;
	}

	public void setAbcCodeOverrideIndicator(String abcCodeOverrideIndicator) {
		this.abcCodeOverrideIndicator = abcCodeOverrideIndicator;
	}

	public String getActiveIngredientFlag() {
		return this.activeIngredientFlag;
	}

	public void setActiveIngredientFlag(String activeIngredientFlag) {
		this.activeIngredientFlag = activeIngredientFlag;
	}

	public String getAllowShippingofHeldLots() {
		return this.allowShippingofHeldLots;
	}

	public void setAllowShippingofHeldLots(String allowShippingofHeldLots) {
		this.allowShippingofHeldLots = allowShippingofHeldLots;
	}

	public String getApsPlanningUom() {
		return this.apsPlanningUom;
	}

	public void setApsPlanningUom(String apsPlanningUom) {
		this.apsPlanningUom = apsPlanningUom;
	}

	public String getAtoForecastControl() {
		return this.atoForecastControl;
	}

	public void setAtoForecastControl(String atoForecastControl) {
		this.atoForecastControl = atoForecastControl;
	}

	public String getAtpComponents() {
		return this.atpComponents;
	}

	public void setAtpComponents(String atpComponents) {
		this.atpComponents = atpComponents;
	}

	public String getAtpRuleName() {
		return this.atpRuleName;
	}

	public void setAtpRuleName(String atpRuleName) {
		this.atpRuleName = atpRuleName;
	}

	public Boolean getBackordersAllowed() {
		return this.backordersAllowed;
	}

	public void setBackordersAllowed(Boolean backordersAllowed) {
		this.backordersAllowed = backordersAllowed;
	}

	public Long getBestBeforeDefaultDays() {
		return this.bestBeforeDefaultDays;
	}

	public void setBestBeforeDefaultDays(Long bestBeforeDefaultDays) {
		this.bestBeforeDefaultDays = bestBeforeDefaultDays;
	}

	public Boolean getBulkPackedFlag() {
		return this.bulkPackedFlag;
	}

	public void setBulkPackedFlag(Boolean bulkPackedFlag) {
		this.bulkPackedFlag = bulkPackedFlag;
	}

	public String getCheckAtp() {
		return this.checkAtp;
	}

	public void setCheckAtp(String checkAtp) {
		this.checkAtp = checkAtp;
	}

	public Boolean getCheckAvailability() {
		return this.checkAvailability;
	}

	public void setCheckAvailability(Boolean checkAvailability) {
		this.checkAvailability = checkAvailability;
	}

	public String getCommitmentDateMethod() {
		return this.commitmentDateMethod;
	}

	public void setCommitmentDateMethod(String commitmentDateMethod) {
		this.commitmentDateMethod = commitmentDateMethod;
	}

	public String getCommitmentMethod() {
		return this.commitmentMethod;
	}

	public void setCommitmentMethod(String commitmentMethod) {
		this.commitmentMethod = commitmentMethod;
	}

	public Long getCommitmentSpecificDays() {
		return this.commitmentSpecificDays;
	}

	public void setCommitmentSpecificDays(Long commitmentSpecificDays) {
		this.commitmentSpecificDays = commitmentSpecificDays;
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getComposition() {
		return this.composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getConstraintsFlag() {
		return this.constraintsFlag;
	}

	public void setConstraintsFlag(String constraintsFlag) {
		this.constraintsFlag = constraintsFlag;
	}

	public String getConsumable() {
		return this.consumable;
	}

	public void setConsumable(String consumable) {
		this.consumable = consumable;
	}

	public String getContractItem() {
		return this.contractItem;
	}

	public void setContractItem(String contractItem) {
		this.contractItem = contractItem;
	}

	public String getCoProductsByProductsIntermediate() {
		return this.coProductsByProductsIntermediate;
	}

	public void setCoProductsByProductsIntermediate(String coProductsByProductsIntermediate) {
		this.coProductsByProductsIntermediate = coProductsByProductsIntermediate;
	}

	public String getCountryofOriginRequiredFlag() {
		return this.countryofOriginRequiredFlag;
	}

	public void setCountryofOriginRequiredFlag(String countryofOriginRequiredFlag) {
		this.countryofOriginRequiredFlag = countryofOriginRequiredFlag;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCrossDockingFlag() {
		return this.crossDockingFlag;
	}

	public void setCrossDockingFlag(String crossDockingFlag) {
		this.crossDockingFlag = crossDockingFlag;
	}

	public String getCumulativeThresholdUnitofMeasure() {
		return this.cumulativeThresholdUnitofMeasure;
	}

	public void setCumulativeThresholdUnitofMeasure(String cumulativeThresholdUnitofMeasure) {
		this.cumulativeThresholdUnitofMeasure = cumulativeThresholdUnitofMeasure;
	}

	public Long getDeferDamperDays() {
		return this.deferDamperDays;
	}

	public void setDeferDamperDays(Long deferDamperDays) {
		this.deferDamperDays = deferDamperDays;
	}

	public String getDemandFlowEndItemFlag() {
		return this.demandFlowEndItemFlag;
	}

	public void setDemandFlowEndItemFlag(String demandFlowEndItemFlag) {
		this.demandFlowEndItemFlag = demandFlowEndItemFlag;
	}

	public String getDualPickingProcessOption() {
		return this.dualPickingProcessOption;
	}

	public void setDualPickingProcessOption(String dualPickingProcessOption) {
		this.dualPickingProcessOption = dualPickingProcessOption;
	}

	public Long getDualTolerance() {
		return this.dualTolerance;
	}

	public void setDualTolerance(Long dualTolerance) {
		this.dualTolerance = dualTolerance;
	}

	public String getDualUnitOfMeasureItem() {
		return this.dualUnitOfMeasureItem;
	}

	public void setDualUnitOfMeasureItem(String dualUnitOfMeasureItem) {
		this.dualUnitOfMeasureItem = dualUnitOfMeasureItem;
	}

	public Long getExpediteDamperDays() {
		return this.expediteDamperDays;
	}

	public void setExpediteDamperDays(Long expediteDamperDays) {
		this.expediteDamperDays = expediteDamperDays;
	}

	public String getExplodeItem() {
		return this.explodeItem;
	}

	public void setExplodeItem(String explodeItem) {
		this.explodeItem = explodeItem;
	}

	public Long getFixedorVariableLeadtime() {
		return this.fixedorVariableLeadtime;
	}

	public void setFixedorVariableLeadtime(Long fixedorVariableLeadtime) {
		this.fixedorVariableLeadtime = fixedorVariableLeadtime;
	}

	public Long getFreezeTimeFenceDays() {
		return this.freezeTimeFenceDays;
	}

	public void setFreezeTimeFenceDays(Long freezeTimeFenceDays) {
		this.freezeTimeFenceDays = freezeTimeFenceDays;
	}

	public String getFromGrade() {
		return this.fromGrade;
	}

	public void setFromGrade(String fromGrade) {
		this.fromGrade = fromGrade;
	}

	public String getFromPotency() {
		return this.fromPotency;
	}

	public void setFromPotency(String fromPotency) {
		this.fromPotency = fromPotency;
	}

	public String getGradeControl() {
		return this.gradeControl;
	}

	public void setGradeControl(String gradeControl) {
		this.gradeControl = gradeControl;
	}

	public Long getGradePotencyPricing() {
		return this.gradePotencyPricing;
	}

	public void setGradePotencyPricing(Long gradePotencyPricing) {
		this.gradePotencyPricing = gradePotencyPricing;
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

	public String getIssueTypeCode() {
		return this.issueTypeCode;
	}

	public void setIssueTypeCode(String issueTypeCode) {
		this.issueTypeCode = issueTypeCode;
	}

	public String getItemFlashMessage() {
		return this.itemFlashMessage;
	}

	public void setItemFlashMessage(String itemFlashMessage) {
		this.itemFlashMessage = itemFlashMessage;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getKanbanExplodetoLowerLevel() {
		return this.kanbanExplodetoLowerLevel;
	}

	public void setKanbanExplodetoLowerLevel(String kanbanExplodetoLowerLevel) {
		this.kanbanExplodetoLowerLevel = kanbanExplodetoLowerLevel;
	}

	public String getKanbanItem() {
		return this.kanbanItem;
	}

	public void setKanbanItem(String kanbanItem) {
		this.kanbanItem = kanbanItem;
	}

	public String getLayerCodeSource() {
		return this.layerCodeSource;
	}

	public void setLayerCodeSource(String layerCodeSource) {
		this.layerCodeSource = layerCodeSource;
	}

	public Long getLeadtimeCumulative() {
		return this.leadtimeCumulative;
	}

	public void setLeadtimeCumulative(Long leadtimeCumulative) {
		this.leadtimeCumulative = leadtimeCumulative;
	}

	public Long getLeadtimeLevel() {
		return this.leadtimeLevel;
	}

	public void setLeadtimeLevel(Long leadtimeLevel) {
		this.leadtimeLevel = leadtimeLevel;
	}

	public Long getLeadtimeMFG() {
		return this.leadtimeMFG;
	}

	public void setLeadtimeMFG(Long leadtimeMFG) {
		this.leadtimeMFG = leadtimeMFG;
	}

	public String getLeadtimePerUnit() {
		return this.leadtimePerUnit;
	}

	public void setLeadtimePerUnit(String leadtimePerUnit) {
		this.leadtimePerUnit = leadtimePerUnit;
	}

	public String getLeanManufacturingFlag() {
		return this.leanManufacturingFlag;
	}

	public void setLeanManufacturingFlag(String leanManufacturingFlag) {
		this.leanManufacturingFlag = leanManufacturingFlag;
	}

	public Long getLevelInventoryCost() {
		return this.levelInventoryCost;
	}

	public void setLevelInventoryCost(Long levelInventoryCost) {
		this.levelInventoryCost = levelInventoryCost;
	}

	public Long getLevelPurchasePrice() {
		return this.levelPurchasePrice;
	}

	public void setLevelPurchasePrice(Long levelPurchasePrice) {
		this.levelPurchasePrice = levelPurchasePrice;
	}

	public Long getLevelSalesBasePrice() {
		return this.levelSalesBasePrice;
	}

	public void setLevelSalesBasePrice(Long levelSalesBasePrice) {
		this.levelSalesBasePrice = levelSalesBasePrice;
	}

	public String getLineCellIdentifier() {
		return this.lineCellIdentifier;
	}

	public void setLineCellIdentifier(String lineCellIdentifier) {
		this.lineCellIdentifier = lineCellIdentifier;
	}

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getLotAuditFlag() {
		return this.lotAuditFlag;
	}

	public void setLotAuditFlag(String lotAuditFlag) {
		this.lotAuditFlag = lotAuditFlag;
	}

	public Long getLotEffectiveDefaultDays() {
		return this.lotEffectiveDefaultDays;
	}

	public void setLotEffectiveDefaultDays(Long lotEffectiveDefaultDays) {
		this.lotEffectiveDefaultDays = lotEffectiveDefaultDays;
	}

	public Long getLotExpiratonDateCalculationMethod() {
		return this.lotExpiratonDateCalculationMethod;
	}

	public void setLotExpiratonDateCalculationMethod(Long lotExpiratonDateCalculationMethod) {
		this.lotExpiratonDateCalculationMethod = lotExpiratonDateCalculationMethod;
	}

	public String getLotNoPreAssignment() {
		return this.lotNoPreAssignment;
	}

	public void setLotNoPreAssignment(String lotNoPreAssignment) {
		this.lotNoPreAssignment = lotNoPreAssignment;
	}

	public String getLotStatusCodeExpanded() {
		return this.lotStatusCodeExpanded;
	}

	public void setLotStatusCodeExpanded(String lotStatusCodeExpanded) {
		this.lotStatusCodeExpanded = lotStatusCodeExpanded;
	}

	public Long getLowLevelCode() {
		return this.lowLevelCode;
	}

	public void setLowLevelCode(Long lowLevelCode) {
		this.lowLevelCode = lowLevelCode;
	}

	public Long getMakeBuyCode() {
		return this.makeBuyCode;
	}

	public void setMakeBuyCode(Long makeBuyCode) {
		this.makeBuyCode = makeBuyCode;
	}

	public String getMarginMaintenancePercentage() {
		return this.marginMaintenancePercentage;
	}

	public void setMarginMaintenancePercentage(String marginMaintenancePercentage) {
		this.marginMaintenancePercentage = marginMaintenancePercentage;
	}

	public String getMaterialStatus() {
		return this.materialStatus;
	}

	public void setMaterialStatus(String materialStatus) {
		this.materialStatus = materialStatus;
	}

	public String getMatrixControlled() {
		return this.matrixControlled;
	}

	public void setMatrixControlled(String matrixControlled) {
		this.matrixControlled = matrixControlled;
	}

	public String getMaximumCumulativeThreshold() {
		return this.maximumCumulativeThreshold;
	}

	public void setMaximumCumulativeThreshold(String maximumCumulativeThreshold) {
		this.maximumCumulativeThreshold = maximumCumulativeThreshold;
	}

	public String getMaximumOperationalThreshold() {
		return this.maximumOperationalThreshold;
	}

	public void setMaximumOperationalThreshold(String maximumOperationalThreshold) {
		this.maximumOperationalThreshold = maximumOperationalThreshold;
	}

	public Long getMessageTimeFenceDays() {
		return this.messageTimeFenceDays;
	}

	public void setMessageTimeFenceDays(Long messageTimeFenceDays) {
		this.messageTimeFenceDays = messageTimeFenceDays;
	}

	public String getMethodConfiguratorCosting() {
		return this.methodConfiguratorCosting;
	}

	public void setMethodConfiguratorCosting(String methodConfiguratorCosting) {
		this.methodConfiguratorCosting = methodConfiguratorCosting;
	}

	public String getMinimumCumulativeThreshold() {
		return this.minimumCumulativeThreshold;
	}

	public void setMinimumCumulativeThreshold(String minimumCumulativeThreshold) {
		this.minimumCumulativeThreshold = minimumCumulativeThreshold;
	}

	public String getMinimumOperationalThreshold() {
		return this.minimumOperationalThreshold;
	}

	public void setMinimumOperationalThreshold(String minimumOperationalThreshold) {
		this.minimumOperationalThreshold = minimumOperationalThreshold;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getMPSMRPTimeFence4() {
		return this.MPSMRPTimeFence4;
	}

	public void setMPSMRPTimeFence4(Long MPSMRPTimeFence4) {
		this.MPSMRPTimeFence4 = MPSMRPTimeFence4;
	}

	public String getOperationalThresholdUnitofMeasure() {
		return this.operationalThresholdUnitofMeasure;
	}

	public void setOperationalThresholdUnitofMeasure(String operationalThresholdUnitofMeasure) {
		this.operationalThresholdUnitofMeasure = operationalThresholdUnitofMeasure;
	}

	public Long getOrderPolicyCode() {
		return this.orderPolicyCode;
	}

	public void setOrderPolicyCode(Long orderPolicyCode) {
		this.orderPolicyCode = orderPolicyCode;
	}

	public String getOrderWith() {
		return this.orderWith;
	}

	public void setOrderWith(String orderWith) {
		this.orderWith = orderWith;
	}

	public String getPercentMargin() {
		return this.percentMargin;
	}

	public void setPercentMargin(String percentMargin) {
		this.percentMargin = percentMargin;
	}

	public Long getPlannerNo() {
		return this.plannerNo;
	}

	public void setPlannerNo(Long plannerNo) {
		this.plannerNo = plannerNo;
	}

	public Long getPlanningCode() {
		return this.planningCode;
	}

	public void setPlanningCode(Long planningCode) {
		this.planningCode = planningCode;
	}

	public Long getPlanningTimeFenceDays() {
		return this.planningTimeFenceDays;
	}

	public void setPlanningTimeFenceDays(Long planningTimeFenceDays) {
		this.planningTimeFenceDays = planningTimeFenceDays;
	}

	public String getPlanningTimeFenceRule() {
		return this.planningTimeFenceRule;
	}

	public void setPlanningTimeFenceRule(String planningTimeFenceRule) {
		this.planningTimeFenceRule = planningTimeFenceRule;
	}

	public String getPotencyControl() {
		return this.potencyControl;
	}

	public void setPotencyControl(String potencyControl) {
		this.potencyControl = potencyControl;
	}

	public String getPrintMessage() {
		return this.printMessage;
	}

	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}

	public String getPriorityOneAlertLevel() {
		return this.priorityOneAlertLevel;
	}

	public void setPriorityOneAlertLevel(String priorityOneAlertLevel) {
		this.priorityOneAlertLevel = priorityOneAlertLevel;
	}

	public String getPriorityTwoAlertLevel() {
		return this.priorityTwoAlertLevel;
	}

	public void setPriorityTwoAlertLevel(String priorityTwoAlertLevel) {
		this.priorityTwoAlertLevel = priorityTwoAlertLevel;
	}

	public String getProductionNoControlled() {
		return this.productionNoControlled;
	}

	public void setProductionNoControlled(String productionNoControlled) {
		this.productionNoControlled = productionNoControlled;
	}

	public Long getPurchasingEffectiveDays() {
		return this.purchasingEffectiveDays;
	}

	public void setPurchasingEffectiveDays(Long purchasingEffectiveDays) {
		this.purchasingEffectiveDays = purchasingEffectiveDays;
	}

	public Long getQuantityAccountingCost() {
		return this.quantityAccountingCost;
	}

	public void setQuantityAccountingCost(Long quantityAccountingCost) {
		this.quantityAccountingCost = quantityAccountingCost;
	}

	public Long getQuantityMfgLeadtime() {
		return this.quantityMfgLeadtime;
	}

	public void setQuantityMfgLeadtime(Long quantityMfgLeadtime) {
		this.quantityMfgLeadtime = quantityMfgLeadtime;
	}

	public String getRestrictWorkOrderLotAssignment() {
		return this.restrictWorkOrderLotAssignment;
	}

	public void setRestrictWorkOrderLotAssignment(String restrictWorkOrderLotAssignment) {
		this.restrictWorkOrderLotAssignment = restrictWorkOrderLotAssignment;
	}

	public Long getRoundtoWholeNo() {
		return this.roundtoWholeNo;
	}

	public void setRoundtoWholeNo(Long roundtoWholeNo) {
		this.roundtoWholeNo = roundtoWholeNo;
	}

	public Long getSafetyLeadtime() {
		return this.safetyLeadtime;
	}

	public void setSafetyLeadtime(Long safetyLeadtime) {
		this.safetyLeadtime = safetyLeadtime;
	}

	public String getSegment1() {
		return this.segment1;
	}

	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}

	public String getSegment10() {
		return this.segment10;
	}

	public void setSegment10(String segment10) {
		this.segment10 = segment10;
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

	public String getSegment8() {
		return this.segment8;
	}

	public void setSegment8(String segment8) {
		this.segment8 = segment8;
	}

	public String getSegment9() {
		return this.segment9;
	}

	public void setSegment9(String segment9) {
		this.segment9 = segment9;
	}

	public String getSellableItem() {
		return this.sellableItem;
	}

	public void setSellableItem(String sellableItem) {
		this.sellableItem = sellableItem;
	}

	public Long getSellByDefaultDays() {
		return this.sellByDefaultDays;
	}

	public void setSellByDefaultDays(Long sellByDefaultDays) {
		this.sellByDefaultDays = sellByDefaultDays;
	}

	public Long getShipmentLeadtimeOffset() {
		return this.shipmentLeadtimeOffset;
	}

	public void setShipmentLeadtimeOffset(Long shipmentLeadtimeOffset) {
		this.shipmentLeadtimeOffset = shipmentLeadtimeOffset;
	}

	public String getSpecialLotFormat() {
		return this.specialLotFormat;
	}

	public void setSpecialLotFormat(String specialLotFormat) {
		this.specialLotFormat = specialLotFormat;
	}

	public String getStandardGrade() {
		return this.standardGrade;
	}

	public void setStandardGrade(String standardGrade) {
		this.standardGrade = standardGrade;
	}

	public String getStandardPotency() {
		return this.standardPotency;
	}

	public void setStandardPotency(String standardPotency) {
		this.standardPotency = standardPotency;
	}

	public String getStandardUnitofMeasureConversion() {
		return this.standardUnitofMeasureConversion;
	}

	public void setStandardUnitofMeasureConversion(String standardUnitofMeasureConversion) {
		this.standardUnitofMeasureConversion = standardUnitofMeasureConversion;
	}

	public String getStockingType() {
		return this.stockingType;
	}

	public void setStockingType(String stockingType) {
		this.stockingType = stockingType;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getThruGrade() {
		return this.thruGrade;
	}

	public void setThruGrade(String thruGrade) {
		this.thruGrade = thruGrade;
	}

	public String getThruPotency() {
		return this.thruPotency;
	}

	public void setThruPotency(String thruPotency) {
		this.thruPotency = thruPotency;
	}

	public String getTotalProductCycleTime() {
		return this.totalProductCycleTime;
	}

	public void setTotalProductCycleTime(String totalProductCycleTime) {
		this.totalProductCycleTime = totalProductCycleTime;
	}

	public Long getUserLotDate1DefaultDays() {
		return this.userLotDate1DefaultDays;
	}

	public void setUserLotDate1DefaultDays(Long userLotDate1DefaultDays) {
		this.userLotDate1DefaultDays = userLotDate1DefaultDays;
	}

	public Long getUserLotDate2DefaultDays() {
		return this.userLotDate2DefaultDays;
	}

	public void setUserLotDate2DefaultDays(Long userLotDate2DefaultDays) {
		this.userLotDate2DefaultDays = userLotDate2DefaultDays;
	}

	public Long getUserLotDate3DefaultDays() {
		return this.userLotDate3DefaultDays;
	}

	public void setUserLotDate3DefaultDays(Long userLotDate3DefaultDays) {
		this.userLotDate3DefaultDays = userLotDate3DefaultDays;
	}

	public Long getUserLotDate4DefaultDays() {
		return this.userLotDate4DefaultDays;
	}

	public void setUserLotDate4DefaultDays(Long userLotDate4DefaultDays) {
		this.userLotDate4DefaultDays = userLotDate4DefaultDays;
	}

	public Long getUserLotDate5DefaultDays() {
		return this.userLotDate5DefaultDays;
	}

	public void setUserLotDate5DefaultDays(Long userLotDate5DefaultDays) {
		this.userLotDate5DefaultDays = userLotDate5DefaultDays;
	}

	public Long getValueOrderPolicy() {
		return this.valueOrderPolicy;
	}

	public void setValueOrderPolicy(Long valueOrderPolicy) {
		this.valueOrderPolicy = valueOrderPolicy;
	}

	public String getVendorManagedInventory() {
		return this.vendorManagedInventory;
	}

	public void setVendorManagedInventory(String vendorManagedInventory) {
		this.vendorManagedInventory = vendorManagedInventory;
	}

}