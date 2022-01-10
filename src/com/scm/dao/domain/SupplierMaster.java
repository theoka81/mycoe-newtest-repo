package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the SupplierMasters database table.
 * 
 */
@Entity
@Table(name="SupplierMasters")
//@NamedQuery(name="SupplierMaster.findAll", query="SELECT s FROM SupplierMaster s")
@org.hibernate.annotations.Table(appliesTo = "SupplierMasters")
public class SupplierMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Cluster")
	private String cluster;

	@Column(name="Company")
	private String company;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DeliveryInstructions")
	private String deliveryInstructions;

	@Column(name="Department")
	private String department;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsApplicationSubmitted", nullable=false)
	private Boolean isApplicationSubmitted;

	@Column(name="IsCsdRegistered", nullable=false)
	private Boolean isCsdRegistered;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LastInvoiceDate")
	private Timestamp lastInvoiceDate;

	@Column(name="LastPaymentDate")
	private Timestamp lastPaymentDate;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ParentNo")
	private String parentNo;

	@Column(name="PaymentInstrument")
	private String paymentInstrument;

	@Column(name="PaymentTerms")
	private String paymentTerms;

	@Column(name="PrintMessage")
	private String printMessage;

	@Column(name="RemitType")
	private String remitType;

	@Column(name="SupplierCode")
	private String supplierCode;

	@Column(name="SupplierHold")
	private String supplierHold;

	@Column(name="SupplierRefId", nullable=false)
	private Long supplierRefId;

	@Column(name="SupplierRefNo", nullable=false)
	private String supplierRefNo;

	@Column(name="SupplierStatus")
	private String supplierStatus;

	@Column(name="SupplierType")
	private String supplierType;

	@Column(name="SupplierXRef1")
	private String supplierXRef1;

	@Column(name="SupplierXRef2")
	private String supplierXRef2;

	@Column(name="SupplierXRef3")
	private String supplierXRef3;

	@Column(name="Unit")
	private String unit;

	//bi-directional many-to-one association to RequisitionDetail
	@OneToMany(mappedBy="supplierMaster")
	private Set<RequisitionDetail> requisitionDetails;

	//bi-directional many-to-one association to RequisitionHeader
	@OneToMany(mappedBy="supplierMaster1")
	private Set<RequisitionHeader> requisitionHeaders1;

	//bi-directional many-to-one association to RequisitionHeader
	@OneToMany(mappedBy="supplierMaster2")
	private Set<RequisitionHeader> requisitionHeaders2;

	//bi-directional many-to-one association to SupplierCompliantHeaderWork
	@OneToMany(mappedBy="supplierMaster")
	private Set<SupplierCompliantHeaderWork> supplierCompliantHeaderWorks;

	//bi-directional many-to-one association to SupplierCompliantHeader
	@OneToMany(mappedBy="supplierMaster")
	private Set<SupplierCompliantHeader> supplierCompliantHeaders;

	//bi-directional many-to-one association to SupplierEnquiryHeaderWork
	@OneToMany(mappedBy="supplierMaster")
	private Set<SupplierEnquiryHeaderWork> supplierEnquiryHeaderWorks;

	//bi-directional many-to-one association to SupplierEnquiryHeader
	@OneToMany(mappedBy="supplierMaster")
	private Set<SupplierEnquiryHeader> supplierEnquiryHeaders;

	//bi-directional many-to-many association to SupplierMarketDevelopment
	@ManyToMany
	@JoinTable(
		name="SupMtktDevSupDetails"
		, joinColumns={
			@JoinColumn(name="SupplierId", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="SMDId", nullable=false)
			}
		)
	private Set<SupplierMarketDevelopment> supplierMarketDevelopments;

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
	@JoinColumn(name="ClusterId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CompanyId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="DepartmentId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="PaymentInstrumentId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="PaymentTermsId")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="PrintMessageId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RemitTypeId")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode8;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="SupplierCodeId")
	private UserCode userCode9;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="SupplierHoldId")
	private UserCode userCode10;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="SupplierTypeId")
	private UserCode userCode11;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode12;

	//bi-directional many-to-one association to SupplierQuotation
	@OneToMany(mappedBy="supplierMaster")
	private Set<SupplierQuotation> supplierQuotations;

	public SupplierMaster() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDeliveryInstructions() {
		return this.deliveryInstructions;
	}

	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsApplicationSubmitted() {
		return this.isApplicationSubmitted;
	}

	public void setIsApplicationSubmitted(Boolean isApplicationSubmitted) {
		this.isApplicationSubmitted = isApplicationSubmitted;
	}

	public Boolean getIsCsdRegistered() {
		return this.isCsdRegistered;
	}

	public void setIsCsdRegistered(Boolean isCsdRegistered) {
		this.isCsdRegistered = isCsdRegistered;
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

	public Timestamp getLastInvoiceDate() {
		return this.lastInvoiceDate;
	}

	public void setLastInvoiceDate(Timestamp lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	public Timestamp getLastPaymentDate() {
		return this.lastPaymentDate;
	}

	public void setLastPaymentDate(Timestamp lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

	public String getPaymentInstrument() {
		return this.paymentInstrument;
	}

	public void setPaymentInstrument(String paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPrintMessage() {
		return this.printMessage;
	}

	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}

	public String getRemitType() {
		return this.remitType;
	}

	public void setRemitType(String remitType) {
		this.remitType = remitType;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierHold() {
		return this.supplierHold;
	}

	public void setSupplierHold(String supplierHold) {
		this.supplierHold = supplierHold;
	}

	public Long getSupplierRefId() {
		return this.supplierRefId;
	}

	public void setSupplierRefId(Long supplierRefId) {
		this.supplierRefId = supplierRefId;
	}

	public String getSupplierRefNo() {
		return this.supplierRefNo;
	}

	public void setSupplierRefNo(String supplierRefNo) {
		this.supplierRefNo = supplierRefNo;
	}

	public String getSupplierStatus() {
		return this.supplierStatus;
	}

	public void setSupplierStatus(String supplierStatus) {
		this.supplierStatus = supplierStatus;
	}

	public String getSupplierType() {
		return this.supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public String getSupplierXRef1() {
		return this.supplierXRef1;
	}

	public void setSupplierXRef1(String supplierXRef1) {
		this.supplierXRef1 = supplierXRef1;
	}

	public String getSupplierXRef2() {
		return this.supplierXRef2;
	}

	public void setSupplierXRef2(String supplierXRef2) {
		this.supplierXRef2 = supplierXRef2;
	}

	public String getSupplierXRef3() {
		return this.supplierXRef3;
	}

	public void setSupplierXRef3(String supplierXRef3) {
		this.supplierXRef3 = supplierXRef3;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Set<RequisitionDetail> getRequisitionDetails() {
		return this.requisitionDetails;
	}

	public void setRequisitionDetails(Set<RequisitionDetail> requisitionDetails) {
		this.requisitionDetails = requisitionDetails;
	}

	public RequisitionDetail addRequisitionDetail(RequisitionDetail requisitionDetail) {
		getRequisitionDetails().add(requisitionDetail);
		requisitionDetail.setSupplierMaster(this);

		return requisitionDetail;
	}

	public RequisitionDetail removeRequisitionDetail(RequisitionDetail requisitionDetail) {
		getRequisitionDetails().remove(requisitionDetail);
		requisitionDetail.setSupplierMaster(null);

		return requisitionDetail;
	}

	public Set<RequisitionHeader> getRequisitionHeaders1() {
		return this.requisitionHeaders1;
	}

	public void setRequisitionHeaders1(Set<RequisitionHeader> requisitionHeaders1) {
		this.requisitionHeaders1 = requisitionHeaders1;
	}

	public RequisitionHeader addRequisitionHeaders1(RequisitionHeader requisitionHeaders1) {
		getRequisitionHeaders1().add(requisitionHeaders1);
		requisitionHeaders1.setSupplierMaster1(this);

		return requisitionHeaders1;
	}

	public RequisitionHeader removeRequisitionHeaders1(RequisitionHeader requisitionHeaders1) {
		getRequisitionHeaders1().remove(requisitionHeaders1);
		requisitionHeaders1.setSupplierMaster1(null);

		return requisitionHeaders1;
	}

	public Set<RequisitionHeader> getRequisitionHeaders2() {
		return this.requisitionHeaders2;
	}

	public void setRequisitionHeaders2(Set<RequisitionHeader> requisitionHeaders2) {
		this.requisitionHeaders2 = requisitionHeaders2;
	}

	public RequisitionHeader addRequisitionHeaders2(RequisitionHeader requisitionHeaders2) {
		getRequisitionHeaders2().add(requisitionHeaders2);
		requisitionHeaders2.setSupplierMaster2(this);

		return requisitionHeaders2;
	}

	public RequisitionHeader removeRequisitionHeaders2(RequisitionHeader requisitionHeaders2) {
		getRequisitionHeaders2().remove(requisitionHeaders2);
		requisitionHeaders2.setSupplierMaster2(null);

		return requisitionHeaders2;
	}

	public Set<SupplierCompliantHeaderWork> getSupplierCompliantHeaderWorks() {
		return this.supplierCompliantHeaderWorks;
	}

	public void setSupplierCompliantHeaderWorks(Set<SupplierCompliantHeaderWork> supplierCompliantHeaderWorks) {
		this.supplierCompliantHeaderWorks = supplierCompliantHeaderWorks;
	}

	public SupplierCompliantHeaderWork addSupplierCompliantHeaderWork(SupplierCompliantHeaderWork supplierCompliantHeaderWork) {
		getSupplierCompliantHeaderWorks().add(supplierCompliantHeaderWork);
		supplierCompliantHeaderWork.setSupplierMaster(this);

		return supplierCompliantHeaderWork;
	}

	public SupplierCompliantHeaderWork removeSupplierCompliantHeaderWork(SupplierCompliantHeaderWork supplierCompliantHeaderWork) {
		getSupplierCompliantHeaderWorks().remove(supplierCompliantHeaderWork);
		supplierCompliantHeaderWork.setSupplierMaster(null);

		return supplierCompliantHeaderWork;
	}

	public Set<SupplierCompliantHeader> getSupplierCompliantHeaders() {
		return this.supplierCompliantHeaders;
	}

	public void setSupplierCompliantHeaders(Set<SupplierCompliantHeader> supplierCompliantHeaders) {
		this.supplierCompliantHeaders = supplierCompliantHeaders;
	}

	public SupplierCompliantHeader addSupplierCompliantHeader(SupplierCompliantHeader supplierCompliantHeader) {
		getSupplierCompliantHeaders().add(supplierCompliantHeader);
		supplierCompliantHeader.setSupplierMaster(this);

		return supplierCompliantHeader;
	}

	public SupplierCompliantHeader removeSupplierCompliantHeader(SupplierCompliantHeader supplierCompliantHeader) {
		getSupplierCompliantHeaders().remove(supplierCompliantHeader);
		supplierCompliantHeader.setSupplierMaster(null);

		return supplierCompliantHeader;
	}

	public Set<SupplierEnquiryHeaderWork> getSupplierEnquiryHeaderWorks() {
		return this.supplierEnquiryHeaderWorks;
	}

	public void setSupplierEnquiryHeaderWorks(Set<SupplierEnquiryHeaderWork> supplierEnquiryHeaderWorks) {
		this.supplierEnquiryHeaderWorks = supplierEnquiryHeaderWorks;
	}

	public SupplierEnquiryHeaderWork addSupplierEnquiryHeaderWork(SupplierEnquiryHeaderWork supplierEnquiryHeaderWork) {
		getSupplierEnquiryHeaderWorks().add(supplierEnquiryHeaderWork);
		supplierEnquiryHeaderWork.setSupplierMaster(this);

		return supplierEnquiryHeaderWork;
	}

	public SupplierEnquiryHeaderWork removeSupplierEnquiryHeaderWork(SupplierEnquiryHeaderWork supplierEnquiryHeaderWork) {
		getSupplierEnquiryHeaderWorks().remove(supplierEnquiryHeaderWork);
		supplierEnquiryHeaderWork.setSupplierMaster(null);

		return supplierEnquiryHeaderWork;
	}

	public Set<SupplierEnquiryHeader> getSupplierEnquiryHeaders() {
		return this.supplierEnquiryHeaders;
	}

	public void setSupplierEnquiryHeaders(Set<SupplierEnquiryHeader> supplierEnquiryHeaders) {
		this.supplierEnquiryHeaders = supplierEnquiryHeaders;
	}

	public SupplierEnquiryHeader addSupplierEnquiryHeader(SupplierEnquiryHeader supplierEnquiryHeader) {
		getSupplierEnquiryHeaders().add(supplierEnquiryHeader);
		supplierEnquiryHeader.setSupplierMaster(this);

		return supplierEnquiryHeader;
	}

	public SupplierEnquiryHeader removeSupplierEnquiryHeader(SupplierEnquiryHeader supplierEnquiryHeader) {
		getSupplierEnquiryHeaders().remove(supplierEnquiryHeader);
		supplierEnquiryHeader.setSupplierMaster(null);

		return supplierEnquiryHeader;
	}

	public Set<SupplierMarketDevelopment> getSupplierMarketDevelopments() {
		return this.supplierMarketDevelopments;
	}

	public void setSupplierMarketDevelopments(Set<SupplierMarketDevelopment> supplierMarketDevelopments) {
		this.supplierMarketDevelopments = supplierMarketDevelopments;
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

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

	public UserCode getUserCode8() {
		return this.userCode8;
	}

	public void setUserCode8(UserCode userCode8) {
		this.userCode8 = userCode8;
	}

	public UserCode getUserCode9() {
		return this.userCode9;
	}

	public void setUserCode9(UserCode userCode9) {
		this.userCode9 = userCode9;
	}

	public UserCode getUserCode10() {
		return this.userCode10;
	}

	public void setUserCode10(UserCode userCode10) {
		this.userCode10 = userCode10;
	}

	public UserCode getUserCode11() {
		return this.userCode11;
	}

	public void setUserCode11(UserCode userCode11) {
		this.userCode11 = userCode11;
	}

	public UserCode getUserCode12() {
		return this.userCode12;
	}

	public void setUserCode12(UserCode userCode12) {
		this.userCode12 = userCode12;
	}

	public Set<SupplierQuotation> getSupplierQuotations() {
		return this.supplierQuotations;
	}

	public void setSupplierQuotations(Set<SupplierQuotation> supplierQuotations) {
		this.supplierQuotations = supplierQuotations;
	}

	public SupplierQuotation addSupplierQuotation(SupplierQuotation supplierQuotation) {
		getSupplierQuotations().add(supplierQuotation);
		supplierQuotation.setSupplierMaster(this);

		return supplierQuotation;
	}

	public SupplierQuotation removeSupplierQuotation(SupplierQuotation supplierQuotation) {
		getSupplierQuotations().remove(supplierQuotation);
		supplierQuotation.setSupplierMaster(null);

		return supplierQuotation;
	}

}