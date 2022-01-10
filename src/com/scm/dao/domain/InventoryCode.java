package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the InventoryCodes database table.
 * 
 */
@Entity
@Table(name="InventoryCodes")
@NamedQuery(name="InventoryCode.findAll", query="SELECT i FROM InventoryCode i")
public class InventoryCode implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CategoryCode1")
	private String categoryCode1;

	@Column(name="CategoryCode10")
	private String categoryCode10;

	@Column(name="CategoryCode10Id")
	private Long categoryCode10Id;

	@Column(name="CategoryCode11")
	private String categoryCode11;

	@Column(name="CategoryCode11Id")
	private Long categoryCode11Id;

	@Column(name="CategoryCode12")
	private String categoryCode12;

	@Column(name="CategoryCode12Id")
	private Long categoryCode12Id;

	@Column(name="CategoryCode13")
	private String categoryCode13;

	@Column(name="CategoryCode13Id")
	private Long categoryCode13Id;

	@Column(name="CategoryCode14")
	private String categoryCode14;

	@Column(name="CategoryCode14Id")
	private Long categoryCode14Id;

	@Column(name="CategoryCode15")
	private String categoryCode15;

	@Column(name="CategoryCode15Id")
	private Long categoryCode15Id;

	@Column(name="CategoryCode16")
	private String categoryCode16;

	@Column(name="CategoryCode16Id")
	private Long categoryCode16Id;

	@Column(name="CategoryCode17")
	private String categoryCode17;

	@Column(name="CategoryCode17Id")
	private Long categoryCode17Id;

	@Column(name="CategoryCode18")
	private String categoryCode18;

	@Column(name="CategoryCode18Id")
	private Long categoryCode18Id;

	@Column(name="CategoryCode19")
	private String categoryCode19;

	@Column(name="CategoryCode19Id")
	private Long categoryCode19Id;

	@Column(name="CategoryCode1Id")
	private Long categoryCode1Id;

	@Column(name="CategoryCode2")
	private String categoryCode2;

	@Column(name="CategoryCode20")
	private String categoryCode20;

	@Column(name="CategoryCode20Id")
	private Long categoryCode20Id;

	@Column(name="CategoryCode2Id")
	private Long categoryCode2Id;

	@Column(name="CategoryCode3")
	private String categoryCode3;

	@Column(name="CategoryCode3Id")
	private Long categoryCode3Id;

	@Column(name="CategoryCode4")
	private String categoryCode4;

	@Column(name="CategoryCode4Id")
	private Long categoryCode4Id;

	@Column(name="CategoryCode5")
	private String categoryCode5;

	@Column(name="CategoryCode5Id")
	private Long categoryCode5Id;

	@Column(name="CategoryCode6")
	private String categoryCode6;

	@Column(name="CategoryCode6Id")
	private Long categoryCode6Id;

	@Column(name="CategoryCode7")
	private String categoryCode7;

	@Column(name="CategoryCode7Id")
	private Long categoryCode7Id;

	@Column(name="CategoryCode8")
	private String categoryCode8;

	@Column(name="CategoryCode8Id")
	private Long categoryCode8Id;

	@Column(name="CategoryCode9")
	private String categoryCode9;

	@Column(name="CategoryCode9Id")
	private Long categoryCode9Id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="ItemId")
	private InventoryDefinition inventoryDefinition;

	//bi-directional many-to-one association to InventoryDefinition
	@OneToMany(mappedBy="inventoryCode")
	private Set<InventoryDefinition> inventoryDefinitions;

	public InventoryCode() {
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

	public Long getCategoryCode10Id() {
		return this.categoryCode10Id;
	}

	public void setCategoryCode10Id(Long categoryCode10Id) {
		this.categoryCode10Id = categoryCode10Id;
	}

	public String getCategoryCode11() {
		return this.categoryCode11;
	}

	public void setCategoryCode11(String categoryCode11) {
		this.categoryCode11 = categoryCode11;
	}

	public Long getCategoryCode11Id() {
		return this.categoryCode11Id;
	}

	public void setCategoryCode11Id(Long categoryCode11Id) {
		this.categoryCode11Id = categoryCode11Id;
	}

	public String getCategoryCode12() {
		return this.categoryCode12;
	}

	public void setCategoryCode12(String categoryCode12) {
		this.categoryCode12 = categoryCode12;
	}

	public Long getCategoryCode12Id() {
		return this.categoryCode12Id;
	}

	public void setCategoryCode12Id(Long categoryCode12Id) {
		this.categoryCode12Id = categoryCode12Id;
	}

	public String getCategoryCode13() {
		return this.categoryCode13;
	}

	public void setCategoryCode13(String categoryCode13) {
		this.categoryCode13 = categoryCode13;
	}

	public Long getCategoryCode13Id() {
		return this.categoryCode13Id;
	}

	public void setCategoryCode13Id(Long categoryCode13Id) {
		this.categoryCode13Id = categoryCode13Id;
	}

	public String getCategoryCode14() {
		return this.categoryCode14;
	}

	public void setCategoryCode14(String categoryCode14) {
		this.categoryCode14 = categoryCode14;
	}

	public Long getCategoryCode14Id() {
		return this.categoryCode14Id;
	}

	public void setCategoryCode14Id(Long categoryCode14Id) {
		this.categoryCode14Id = categoryCode14Id;
	}

	public String getCategoryCode15() {
		return this.categoryCode15;
	}

	public void setCategoryCode15(String categoryCode15) {
		this.categoryCode15 = categoryCode15;
	}

	public Long getCategoryCode15Id() {
		return this.categoryCode15Id;
	}

	public void setCategoryCode15Id(Long categoryCode15Id) {
		this.categoryCode15Id = categoryCode15Id;
	}

	public String getCategoryCode16() {
		return this.categoryCode16;
	}

	public void setCategoryCode16(String categoryCode16) {
		this.categoryCode16 = categoryCode16;
	}

	public Long getCategoryCode16Id() {
		return this.categoryCode16Id;
	}

	public void setCategoryCode16Id(Long categoryCode16Id) {
		this.categoryCode16Id = categoryCode16Id;
	}

	public String getCategoryCode17() {
		return this.categoryCode17;
	}

	public void setCategoryCode17(String categoryCode17) {
		this.categoryCode17 = categoryCode17;
	}

	public Long getCategoryCode17Id() {
		return this.categoryCode17Id;
	}

	public void setCategoryCode17Id(Long categoryCode17Id) {
		this.categoryCode17Id = categoryCode17Id;
	}

	public String getCategoryCode18() {
		return this.categoryCode18;
	}

	public void setCategoryCode18(String categoryCode18) {
		this.categoryCode18 = categoryCode18;
	}

	public Long getCategoryCode18Id() {
		return this.categoryCode18Id;
	}

	public void setCategoryCode18Id(Long categoryCode18Id) {
		this.categoryCode18Id = categoryCode18Id;
	}

	public String getCategoryCode19() {
		return this.categoryCode19;
	}

	public void setCategoryCode19(String categoryCode19) {
		this.categoryCode19 = categoryCode19;
	}

	public Long getCategoryCode19Id() {
		return this.categoryCode19Id;
	}

	public void setCategoryCode19Id(Long categoryCode19Id) {
		this.categoryCode19Id = categoryCode19Id;
	}

	public Long getCategoryCode1Id() {
		return this.categoryCode1Id;
	}

	public void setCategoryCode1Id(Long categoryCode1Id) {
		this.categoryCode1Id = categoryCode1Id;
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

	public Long getCategoryCode20Id() {
		return this.categoryCode20Id;
	}

	public void setCategoryCode20Id(Long categoryCode20Id) {
		this.categoryCode20Id = categoryCode20Id;
	}

	public Long getCategoryCode2Id() {
		return this.categoryCode2Id;
	}

	public void setCategoryCode2Id(Long categoryCode2Id) {
		this.categoryCode2Id = categoryCode2Id;
	}

	public String getCategoryCode3() {
		return this.categoryCode3;
	}

	public void setCategoryCode3(String categoryCode3) {
		this.categoryCode3 = categoryCode3;
	}

	public Long getCategoryCode3Id() {
		return this.categoryCode3Id;
	}

	public void setCategoryCode3Id(Long categoryCode3Id) {
		this.categoryCode3Id = categoryCode3Id;
	}

	public String getCategoryCode4() {
		return this.categoryCode4;
	}

	public void setCategoryCode4(String categoryCode4) {
		this.categoryCode4 = categoryCode4;
	}

	public Long getCategoryCode4Id() {
		return this.categoryCode4Id;
	}

	public void setCategoryCode4Id(Long categoryCode4Id) {
		this.categoryCode4Id = categoryCode4Id;
	}

	public String getCategoryCode5() {
		return this.categoryCode5;
	}

	public void setCategoryCode5(String categoryCode5) {
		this.categoryCode5 = categoryCode5;
	}

	public Long getCategoryCode5Id() {
		return this.categoryCode5Id;
	}

	public void setCategoryCode5Id(Long categoryCode5Id) {
		this.categoryCode5Id = categoryCode5Id;
	}

	public String getCategoryCode6() {
		return this.categoryCode6;
	}

	public void setCategoryCode6(String categoryCode6) {
		this.categoryCode6 = categoryCode6;
	}

	public Long getCategoryCode6Id() {
		return this.categoryCode6Id;
	}

	public void setCategoryCode6Id(Long categoryCode6Id) {
		this.categoryCode6Id = categoryCode6Id;
	}

	public String getCategoryCode7() {
		return this.categoryCode7;
	}

	public void setCategoryCode7(String categoryCode7) {
		this.categoryCode7 = categoryCode7;
	}

	public Long getCategoryCode7Id() {
		return this.categoryCode7Id;
	}

	public void setCategoryCode7Id(Long categoryCode7Id) {
		this.categoryCode7Id = categoryCode7Id;
	}

	public String getCategoryCode8() {
		return this.categoryCode8;
	}

	public void setCategoryCode8(String categoryCode8) {
		this.categoryCode8 = categoryCode8;
	}

	public Long getCategoryCode8Id() {
		return this.categoryCode8Id;
	}

	public void setCategoryCode8Id(Long categoryCode8Id) {
		this.categoryCode8Id = categoryCode8Id;
	}

	public String getCategoryCode9() {
		return this.categoryCode9;
	}

	public void setCategoryCode9(String categoryCode9) {
		this.categoryCode9 = categoryCode9;
	}

	public Long getCategoryCode9Id() {
		return this.categoryCode9Id;
	}

	public void setCategoryCode9Id(Long categoryCode9Id) {
		this.categoryCode9Id = categoryCode9Id;
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

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
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

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

	public Set<InventoryDefinition> getInventoryDefinitions() {
		return this.inventoryDefinitions;
	}

	public void setInventoryDefinitions(Set<InventoryDefinition> inventoryDefinitions) {
		this.inventoryDefinitions = inventoryDefinitions;
	}

	public InventoryDefinition addInventoryDefinition(InventoryDefinition inventoryDefinition) {
		getInventoryDefinitions().add(inventoryDefinition);
		inventoryDefinition.setInventoryCode(this);

		return inventoryDefinition;
	}

	public InventoryDefinition removeInventoryDefinition(InventoryDefinition inventoryDefinition) {
		getInventoryDefinitions().remove(inventoryDefinition);
		inventoryDefinition.setInventoryCode(null);

		return inventoryDefinition;
	}

}