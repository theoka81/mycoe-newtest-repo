package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierCodesWorks database table.
 * 
 */
@Entity
@Table(name="SupplierCodesWorks")
@NamedQuery(name="SupplierCodesWork.findAll", query="SELECT s FROM SupplierCodesWork s")
public class SupplierCodesWork implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CategoryCode1")
	private String categoryCode1;

	@Column(name="CategoryCode10")
	private String categoryCode10;

	@Column(name="CategoryCode11")
	private String categoryCode11;

	@Column(name="CategoryCode12")
	private String categoryCode12;

	@Column(name="CategoryCode13")
	private String categoryCode13;

	@Column(name="CategoryCode14")
	private String categoryCode14;

	@Column(name="CategoryCode15")
	private String categoryCode15;

	@Column(name="CategoryCode16")
	private String categoryCode16;

	@Column(name="CategoryCode17")
	private String categoryCode17;

	@Column(name="CategoryCode18")
	private String categoryCode18;

	@Column(name="CategoryCode19")
	private String categoryCode19;

	@Column(name="CategoryCode2")
	private String categoryCode2;

	@Column(name="CategoryCode20")
	private String categoryCode20;

	@Column(name="CategoryCode3")
	private String categoryCode3;

	@Column(name="CategoryCode4")
	private String categoryCode4;

	@Column(name="CategoryCode5")
	private String categoryCode5;

	@Column(name="CategoryCode6")
	private String categoryCode6;

	@Column(name="CategoryCode7")
	private String categoryCode7;

	@Column(name="CategoryCode8")
	private String categoryCode8;

	@Column(name="CategoryCode9")
	private String categoryCode9;

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

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="SupplierId")
	private Long supplierId;

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
	@JoinColumn(name="CategoryCode10Id")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode11Id")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode12Id")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode13Id")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode14Id")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode15Id")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode16Id")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode17Id")
	private UserCode userCode8;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode18Id")
	private UserCode userCode9;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode19Id")
	private UserCode userCode10;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode1Id")
	private UserCode userCode11;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode20Id")
	private UserCode userCode12;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode2Id")
	private UserCode userCode13;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode3Id")
	private UserCode userCode14;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode4Id")
	private UserCode userCode15;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode5Id")
	private UserCode userCode16;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode6Id")
	private UserCode userCode17;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode7Id")
	private UserCode userCode18;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode8Id")
	private UserCode userCode19;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CategoryCode9Id")
	private UserCode userCode20;

	public SupplierCodesWork() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryCode1() {
		return this.categoryCode1;
	}

	public void setCategoryCode1(String categoryCode1) {
		this.categoryCode1 = categoryCode1;
	}

	public String getCategoryCode10() {
		return this.categoryCode10;
	}

	public void setCategoryCode10(String categoryCode10) {
		this.categoryCode10 = categoryCode10;
	}

	public String getCategoryCode11() {
		return this.categoryCode11;
	}

	public void setCategoryCode11(String categoryCode11) {
		this.categoryCode11 = categoryCode11;
	}

	public String getCategoryCode12() {
		return this.categoryCode12;
	}

	public void setCategoryCode12(String categoryCode12) {
		this.categoryCode12 = categoryCode12;
	}

	public String getCategoryCode13() {
		return this.categoryCode13;
	}

	public void setCategoryCode13(String categoryCode13) {
		this.categoryCode13 = categoryCode13;
	}

	public String getCategoryCode14() {
		return this.categoryCode14;
	}

	public void setCategoryCode14(String categoryCode14) {
		this.categoryCode14 = categoryCode14;
	}

	public String getCategoryCode15() {
		return this.categoryCode15;
	}

	public void setCategoryCode15(String categoryCode15) {
		this.categoryCode15 = categoryCode15;
	}

	public String getCategoryCode16() {
		return this.categoryCode16;
	}

	public void setCategoryCode16(String categoryCode16) {
		this.categoryCode16 = categoryCode16;
	}

	public String getCategoryCode17() {
		return this.categoryCode17;
	}

	public void setCategoryCode17(String categoryCode17) {
		this.categoryCode17 = categoryCode17;
	}

	public String getCategoryCode18() {
		return this.categoryCode18;
	}

	public void setCategoryCode18(String categoryCode18) {
		this.categoryCode18 = categoryCode18;
	}

	public String getCategoryCode19() {
		return this.categoryCode19;
	}

	public void setCategoryCode19(String categoryCode19) {
		this.categoryCode19 = categoryCode19;
	}

	public String getCategoryCode2() {
		return this.categoryCode2;
	}

	public void setCategoryCode2(String categoryCode2) {
		this.categoryCode2 = categoryCode2;
	}

	public String getCategoryCode20() {
		return this.categoryCode20;
	}

	public void setCategoryCode20(String categoryCode20) {
		this.categoryCode20 = categoryCode20;
	}

	public String getCategoryCode3() {
		return this.categoryCode3;
	}

	public void setCategoryCode3(String categoryCode3) {
		this.categoryCode3 = categoryCode3;
	}

	public String getCategoryCode4() {
		return this.categoryCode4;
	}

	public void setCategoryCode4(String categoryCode4) {
		this.categoryCode4 = categoryCode4;
	}

	public String getCategoryCode5() {
		return this.categoryCode5;
	}

	public void setCategoryCode5(String categoryCode5) {
		this.categoryCode5 = categoryCode5;
	}

	public String getCategoryCode6() {
		return this.categoryCode6;
	}

	public void setCategoryCode6(String categoryCode6) {
		this.categoryCode6 = categoryCode6;
	}

	public String getCategoryCode7() {
		return this.categoryCode7;
	}

	public void setCategoryCode7(String categoryCode7) {
		this.categoryCode7 = categoryCode7;
	}

	public String getCategoryCode8() {
		return this.categoryCode8;
	}

	public void setCategoryCode8(String categoryCode8) {
		this.categoryCode8 = categoryCode8;
	}

	public String getCategoryCode9() {
		return this.categoryCode9;
	}

	public void setCategoryCode9(String categoryCode9) {
		this.categoryCode9 = categoryCode9;
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

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
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

	public UserCode getUserCode13() {
		return this.userCode13;
	}

	public void setUserCode13(UserCode userCode13) {
		this.userCode13 = userCode13;
	}

	public UserCode getUserCode14() {
		return this.userCode14;
	}

	public void setUserCode14(UserCode userCode14) {
		this.userCode14 = userCode14;
	}

	public UserCode getUserCode15() {
		return this.userCode15;
	}

	public void setUserCode15(UserCode userCode15) {
		this.userCode15 = userCode15;
	}

	public UserCode getUserCode16() {
		return this.userCode16;
	}

	public void setUserCode16(UserCode userCode16) {
		this.userCode16 = userCode16;
	}

	public UserCode getUserCode17() {
		return this.userCode17;
	}

	public void setUserCode17(UserCode userCode17) {
		this.userCode17 = userCode17;
	}

	public UserCode getUserCode18() {
		return this.userCode18;
	}

	public void setUserCode18(UserCode userCode18) {
		this.userCode18 = userCode18;
	}

	public UserCode getUserCode19() {
		return this.userCode19;
	}

	public void setUserCode19(UserCode userCode19) {
		this.userCode19 = userCode19;
	}

	public UserCode getUserCode20() {
		return this.userCode20;
	}

	public void setUserCode20(UserCode userCode20) {
		this.userCode20 = userCode20;
	}

}