package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the GenCycleCountMasters database table.
 * 
 */
@Entity
@Table(name="GenCycleCountMasters")
@NamedQuery(name="GenCycleCountMaster.findAll", query="SELECT g FROM GenCycleCountMaster g")
public class GenCycleCountMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateGenerated")
	private Timestamp dateGenerated;

	@Column(name="FinancialYear")
	private String financialYear;

	@Column(name="GenCycleCountRefNo")
	private String genCycleCountRefNo;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsGenUpdated")
	private boolean isGenUpdated;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="IterationId")
	private long iterationId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="TotalCountOnHand")
	private long totalCountOnHand;

	@Column(name="TotalCountReserved")
	private long totalCountReserved;

	@Column(name="TotalPhysicalCountOnHand")
	private long totalPhysicalCountOnHand;

	@Column(name="TotalPhysicalCountReserved")
	private long totalPhysicalCountReserved;

	@Column(name="VerificationOfficer")
	private String verificationOfficer;

	//bi-directional many-to-one association to GenCycleCountDetail
	@OneToMany(mappedBy="genCycleCountMaster")
	private Set<GenCycleCountDetail> genCycleCountDetails;

	//bi-directional many-to-one association to CycleCount
	@ManyToOne
	@JoinColumn(name="CycleCountId")
	private CycleCount cycleCount;

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
	@JoinColumn(name="ItemGroupId")
	private UserCode userCode2;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="WarehouseDetailsId")
	private WarehouseDetail warehouseDetail;

	public GenCycleCountMaster() {
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

	public Timestamp getDateGenerated() {
		return this.dateGenerated;
	}

	public void setDateGenerated(Timestamp dateGenerated) {
		this.dateGenerated = dateGenerated;
	}

	public String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public String getGenCycleCountRefNo() {
		return this.genCycleCountRefNo;
	}

	public void setGenCycleCountRefNo(String genCycleCountRefNo) {
		this.genCycleCountRefNo = genCycleCountRefNo;
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

	public boolean getIsGenUpdated() {
		return this.isGenUpdated;
	}

	public void setIsGenUpdated(boolean isGenUpdated) {
		this.isGenUpdated = isGenUpdated;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public long getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(long iterationId) {
		this.iterationId = iterationId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getTotalCountOnHand() {
		return this.totalCountOnHand;
	}

	public void setTotalCountOnHand(long totalCountOnHand) {
		this.totalCountOnHand = totalCountOnHand;
	}

	public long getTotalCountReserved() {
		return this.totalCountReserved;
	}

	public void setTotalCountReserved(long totalCountReserved) {
		this.totalCountReserved = totalCountReserved;
	}

	public long getTotalPhysicalCountOnHand() {
		return this.totalPhysicalCountOnHand;
	}

	public void setTotalPhysicalCountOnHand(long totalPhysicalCountOnHand) {
		this.totalPhysicalCountOnHand = totalPhysicalCountOnHand;
	}

	public long getTotalPhysicalCountReserved() {
		return this.totalPhysicalCountReserved;
	}

	public void setTotalPhysicalCountReserved(long totalPhysicalCountReserved) {
		this.totalPhysicalCountReserved = totalPhysicalCountReserved;
	}

	public String getVerificationOfficer() {
		return this.verificationOfficer;
	}

	public void setVerificationOfficer(String verificationOfficer) {
		this.verificationOfficer = verificationOfficer;
	}

	public Set<GenCycleCountDetail> getGenCycleCountDetails() {
		return this.genCycleCountDetails;
	}

	public void setGenCycleCountDetails(Set<GenCycleCountDetail> genCycleCountDetails) {
		this.genCycleCountDetails = genCycleCountDetails;
	}

	public GenCycleCountDetail addGenCycleCountDetail(GenCycleCountDetail genCycleCountDetail) {
		getGenCycleCountDetails().add(genCycleCountDetail);
		genCycleCountDetail.setGenCycleCountMaster(this);

		return genCycleCountDetail;
	}

	public GenCycleCountDetail removeGenCycleCountDetail(GenCycleCountDetail genCycleCountDetail) {
		getGenCycleCountDetails().remove(genCycleCountDetail);
		genCycleCountDetail.setGenCycleCountMaster(null);

		return genCycleCountDetail;
	}

	public CycleCount getCycleCount() {
		return this.cycleCount;
	}

	public void setCycleCount(CycleCount cycleCount) {
		this.cycleCount = cycleCount;
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