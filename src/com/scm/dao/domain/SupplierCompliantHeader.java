package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the SupplierCompliantHeaders database table.
 * 
 */
@Entity
@Table(name="SupplierCompliantHeaders")
@NamedQuery(name="SupplierCompliantHeader.findAll", query="SELECT s FROM SupplierCompliantHeader s")
public class SupplierCompliantHeader implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Address")
	private String address;

	@Column(name="ComplaintDisputeDescription")
	private String complaintDisputeDescription;

	@Column(name="CompliantDate")
	private String compliantDate;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentAddress")
	private String departmentAddress;

	@Column(name="DepartmentRep")
	private String departmentRep;

	@Column(name="DisputeStatusId")
	private Long disputeStatusId;

	@Column(name="Email")
	private String email;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Phone")
	private String phone;

	@Column(name="Reason")
	private String reason;

	@Column(name="VendorContactName")
	private String vendorContactName;

	@Column(name="VendorInfo")
	private String vendorInfo;

	@Column(name="VendorName")
	private String vendorName;

	//bi-directional many-to-one association to SupplierCompliantDetail
	@OneToMany(mappedBy="supplierCompliantHeader")
	private Set<SupplierCompliantDetail> supplierCompliantDetails;

	//bi-directional many-to-one association to SupplierMaster
	@ManyToOne
	@JoinColumn(name="SupplierId")
	private SupplierMaster supplierMaster;

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
	@JoinColumn(name="DepartmentId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="DisputeTypeId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="EscalationTypeId")
	private UserCode userCode4;

	public SupplierCompliantHeader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComplaintDisputeDescription() {
		return this.complaintDisputeDescription;
	}

	public void setComplaintDisputeDescription(String complaintDisputeDescription) {
		this.complaintDisputeDescription = complaintDisputeDescription;
	}

	public String getCompliantDate() {
		return this.compliantDate;
	}

	public void setCompliantDate(String compliantDate) {
		this.compliantDate = compliantDate;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDepartmentAddress() {
		return this.departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentRep() {
		return this.departmentRep;
	}

	public void setDepartmentRep(String departmentRep) {
		this.departmentRep = departmentRep;
	}

	public Long getDisputeStatusId() {
		return this.disputeStatusId;
	}

	public void setDisputeStatusId(Long disputeStatusId) {
		this.disputeStatusId = disputeStatusId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getVendorContactName() {
		return this.vendorContactName;
	}

	public void setVendorContactName(String vendorContactName) {
		this.vendorContactName = vendorContactName;
	}

	public String getVendorInfo() {
		return this.vendorInfo;
	}

	public void setVendorInfo(String vendorInfo) {
		this.vendorInfo = vendorInfo;
	}

	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Set<SupplierCompliantDetail> getSupplierCompliantDetails() {
		return this.supplierCompliantDetails;
	}

	public void setSupplierCompliantDetails(Set<SupplierCompliantDetail> supplierCompliantDetails) {
		this.supplierCompliantDetails = supplierCompliantDetails;
	}

	public SupplierCompliantDetail addSupplierCompliantDetail(SupplierCompliantDetail supplierCompliantDetail) {
		getSupplierCompliantDetails().add(supplierCompliantDetail);
		supplierCompliantDetail.setSupplierCompliantHeader(this);

		return supplierCompliantDetail;
	}

	public SupplierCompliantDetail removeSupplierCompliantDetail(SupplierCompliantDetail supplierCompliantDetail) {
		getSupplierCompliantDetails().remove(supplierCompliantDetail);
		supplierCompliantDetail.setSupplierCompliantHeader(null);

		return supplierCompliantDetail;
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

}