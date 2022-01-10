package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the ItemTransactionMasters database table.
 * 
 */
@Entity
@Table(name="ItemTransactionMasters")
@NamedQuery(name="ItemTransactionMaster.findAll", query="SELECT i FROM ItemTransactionMaster i")
public class ItemTransactionMaster implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentId")
	private Long departmentId;

	@Column(name="DocumentNumber")
	private String documentNumber;

	@Column(name="DocumentType")
	private String documentType;

	@Column(name="Explaination")
	private String explaination;

	private String GLDate;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemTransactionTypeId")
	private Long itemTransactionTypeId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="TransactionDate")
	private String transactionDate;

	//bi-directional many-to-one association to ItemTransaction
	@OneToMany(mappedBy="itemTransactionMaster")
	private Set<ItemTransaction> itemTransactions;

	public ItemTransactionMaster() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDocumentNumber() {
		return this.documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getExplaination() {
		return this.explaination;
	}

	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}

	public String getGLDate() {
		return this.GLDate;
	}

	public void setGLDate(String GLDate) {
		this.GLDate = GLDate;
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

	public Long getItemTransactionTypeId() {
		return this.itemTransactionTypeId;
	}

	public void setItemTransactionTypeId(Long itemTransactionTypeId) {
		this.itemTransactionTypeId = itemTransactionTypeId;
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

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Set<ItemTransaction> getItemTransactions() {
		return this.itemTransactions;
	}

	public void setItemTransactions(Set<ItemTransaction> itemTransactions) {
		this.itemTransactions = itemTransactions;
	}

	public ItemTransaction addItemTransaction(ItemTransaction itemTransaction) {
		getItemTransactions().add(itemTransaction);
		itemTransaction.setItemTransactionMaster(this);

		return itemTransaction;
	}

	public ItemTransaction removeItemTransaction(ItemTransaction itemTransaction) {
		getItemTransactions().remove(itemTransaction);
		itemTransaction.setItemTransactionMaster(null);

		return itemTransaction;
	}

}