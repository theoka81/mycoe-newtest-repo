package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the StockAdjustments database table.
 * 
 */
@Entity
@Table(name="StockAdjustments")
@NamedQuery(name="StockAdjustment.findAll", query="SELECT s FROM StockAdjustment s")
public class StockAdjustment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RefDate")
	private Timestamp refDate;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StockRefNo")
	private String stockRefNo;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	//bi-directional many-to-one association to StockAdjustmentItem
	@OneToMany(mappedBy="stockAdjustment")
	private Set<StockAdjustmentItem> stockAdjustmentItems;

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
	@JoinColumn(name="StatusId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StockAdjustmentTypeId")
	private UserCode userCode2;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="WareHouseId")
	private WarehouseDetail warehouseDetail;

	public StockAdjustment() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Timestamp getRefDate() {
		return this.refDate;
	}

	public void setRefDate(Timestamp refDate) {
		this.refDate = refDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStockRefNo() {
		return this.stockRefNo;
	}

	public void setStockRefNo(String stockRefNo) {
		this.stockRefNo = stockRefNo;
	}

	public String getStoreOfficer() {
		return this.storeOfficer;
	}

	public void setStoreOfficer(String storeOfficer) {
		this.storeOfficer = storeOfficer;
	}

	public Set<StockAdjustmentItem> getStockAdjustmentItems() {
		return this.stockAdjustmentItems;
	}

	public void setStockAdjustmentItems(Set<StockAdjustmentItem> stockAdjustmentItems) {
		this.stockAdjustmentItems = stockAdjustmentItems;
	}

	public StockAdjustmentItem addStockAdjustmentItem(StockAdjustmentItem stockAdjustmentItem) {
		getStockAdjustmentItems().add(stockAdjustmentItem);
		stockAdjustmentItem.setStockAdjustment(this);

		return stockAdjustmentItem;
	}

	public StockAdjustmentItem removeStockAdjustmentItem(StockAdjustmentItem stockAdjustmentItem) {
		getStockAdjustmentItems().remove(stockAdjustmentItem);
		stockAdjustmentItem.setStockAdjustment(null);

		return stockAdjustmentItem;
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

	public WarehouseDetail getWarehouseDetail() {
		return this.warehouseDetail;
	}

	public void setWarehouseDetail(WarehouseDetail warehouseDetail) {
		this.warehouseDetail = warehouseDetail;
	}

}