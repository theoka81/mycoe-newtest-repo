package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the StockTransferItems database table.
 * 
 */
@Entity
@Table(name="StockTransferItems")
@NamedQuery(name="StockTransferItem.findAll", query="SELECT s FROM StockTransferItem s")
public class StockTransferItem implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private StockTransferItemPK id;

	@Column(name="Quantity")
	private Long quantity;

	@Column(name="TransQuantity")
	private Long transQuantity;

	//bi-directional many-to-one association to StockTransfer
	@ManyToOne
	@JoinColumn(name="STId", nullable=false, insertable=false, updatable=false)
	private StockTransfer stockTransfer;

	public StockTransferItem() {
	}

	public StockTransferItemPK getId() {
		return this.id;
	}

	public void setId(StockTransferItemPK id) {
		this.id = id;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getTransQuantity() {
		return this.transQuantity;
	}

	public void setTransQuantity(Long transQuantity) {
		this.transQuantity = transQuantity;
	}

	public StockTransfer getStockTransfer() {
		return this.stockTransfer;
	}

	public void setStockTransfer(StockTransfer stockTransfer) {
		this.stockTransfer = stockTransfer;
	}

}