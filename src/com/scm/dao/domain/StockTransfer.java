package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the StockTransfers database table.
 * 
 */
@Entity
@Table(name="StockTransfers")
@NamedQuery(name="StockTransfer.findAll", query="SELECT s FROM StockTransfer s")
public class StockTransfer implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RefDate")
	private String refDate;

	@Column(name="StockRefNo")
	private String stockRefNo;

	//bi-directional many-to-one association to StockTransferItem
	@OneToMany(mappedBy="stockTransfer")
	private Set<StockTransferItem> stockTransferItems;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StockTransferTypeId", nullable=false)
	private UserCode userCode2;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="ToWareHouseId")
	private WarehouseDetail warehouseDetail1;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="FromWareHouseId")
	private WarehouseDetail warehouseDetail2;

	public StockTransfer() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public String getStockRefNo() {
		return this.stockRefNo;
	}

	public void setStockRefNo(String stockRefNo) {
		this.stockRefNo = stockRefNo;
	}

	public Set<StockTransferItem> getStockTransferItems() {
		return this.stockTransferItems;
	}

	public void setStockTransferItems(Set<StockTransferItem> stockTransferItems) {
		this.stockTransferItems = stockTransferItems;
	}

	public StockTransferItem addStockTransferItem(StockTransferItem stockTransferItem) {
		getStockTransferItems().add(stockTransferItem);
		stockTransferItem.setStockTransfer(this);

		return stockTransferItem;
	}

	public StockTransferItem removeStockTransferItem(StockTransferItem stockTransferItem) {
		getStockTransferItems().remove(stockTransferItem);
		stockTransferItem.setStockTransfer(null);

		return stockTransferItem;
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

	public WarehouseDetail getWarehouseDetail1() {
		return this.warehouseDetail1;
	}

	public void setWarehouseDetail1(WarehouseDetail warehouseDetail1) {
		this.warehouseDetail1 = warehouseDetail1;
	}

	public WarehouseDetail getWarehouseDetail2() {
		return this.warehouseDetail2;
	}

	public void setWarehouseDetail2(WarehouseDetail warehouseDetail2) {
		this.warehouseDetail2 = warehouseDetail2;
	}

}