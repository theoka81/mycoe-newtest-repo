package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the StockReservationItems database table.
 * 
 */
@Entity
@Table(name="StockReservationItems")
@NamedQuery(name="StockReservationItem.findAll", query="SELECT s FROM StockReservationItem s")
public class StockReservationItem implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private StockReservationItemPK id;

	@Column(name="Quantity")
	private Long quantity;

	@Column(name="ReservationQuantity")
	private Long reservationQuantity;

	//bi-directional many-to-one association to StockReservation
	@ManyToOne
	@JoinColumn(name="SRId", nullable=false, insertable=false, updatable=false)
	private StockReservation stockReservation;

	public StockReservationItem() {
	}

	public StockReservationItemPK getId() {
		return this.id;
	}

	public void setId(StockReservationItemPK id) {
		this.id = id;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getReservationQuantity() {
		return this.reservationQuantity;
	}

	public void setReservationQuantity(Long reservationQuantity) {
		this.reservationQuantity = reservationQuantity;
	}

	public StockReservation getStockReservation() {
		return this.stockReservation;
	}

	public void setStockReservation(StockReservation stockReservation) {
		this.stockReservation = stockReservation;
	}

}