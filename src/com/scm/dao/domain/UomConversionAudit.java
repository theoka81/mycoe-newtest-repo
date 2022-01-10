package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the UomConversionAudits database table.
 * 
 */
@Entity
@Table(name="UomConversionAudits")
@NamedQuery(name="UomConversionAudit.findAll", query="SELECT u FROM UomConversionAudit u")
public class UomConversionAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="ConversionFactor")
	private Long conversionFactor;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="Description")
	private String description;

	@Column(name="FromUom")
	private String fromUom;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemId")
	private Long itemId;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="QtyFromUnit")
	private Long qtyFromUnit;

	@Column(name="QtyToUnit")
	private Long qtyToUnit;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="ToUom")
	private String toUom;

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
	@JoinColumn(name="FromUomId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ToUomId")
	private UserCode userCode2;

	public UomConversionAudit() {
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

	public Long getConversionFactor() {
		return this.conversionFactor;
	}

	public void setConversionFactor(Long conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFromUom() {
		return this.fromUom;
	}

	public void setFromUom(String fromUom) {
		this.fromUom = fromUom;
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

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public Long getQtyFromUnit() {
		return this.qtyFromUnit;
	}

	public void setQtyFromUnit(Long qtyFromUnit) {
		this.qtyFromUnit = qtyFromUnit;
	}

	public Long getQtyToUnit() {
		return this.qtyToUnit;
	}

	public void setQtyToUnit(Long qtyToUnit) {
		this.qtyToUnit = qtyToUnit;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getToUom() {
		return this.toUom;
	}

	public void setToUom(String toUom) {
		this.toUom = toUom;
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

}