package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the Menus database table.
 * 
 */
@Entity
@NamedQuery(name="Menus.findAll", query="SELECT m FROM Menus m")
public class Menus implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;

	@Column(name="Action")
	private String action;

	@Column(name="Attribute")
	private String attribute;

	@Column(name="Controller")
	private String controller;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Description")
	private String description;

	@Column(name="HardCode")
	private String hardCode;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsDeleted")
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="Level")
	private Integer level;

	@Column(name="LinkText")
	private String linkText;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Name")
	private String name;

	@Column(name="ProgramExecuted")
	private String programExecuted;

	@Column(name="RouteValue")
	private String routeValue;

	@Column(name="StatusId")
	private Long statusId;

	//bi-directional many-to-one association to Menus
	@ManyToOne
	@JoinColumn(name="ParentMenuId")
	private Menus menus;

	//bi-directional many-to-one association to Menus
	@OneToMany(mappedBy="menus")
	private Set<Menus> menuses;

	public Menus() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getController() {
		return this.controller;
	}

	public void setController(String controller) {
		this.controller = controller;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHardCode() {
		return this.hardCode;
	}

	public void setHardCode(String hardCode) {
		this.hardCode = hardCode;
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLinkText() {
		return this.linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgramExecuted() {
		return this.programExecuted;
	}

	public void setProgramExecuted(String programExecuted) {
		this.programExecuted = programExecuted;
	}

	public String getRouteValue() {
		return this.routeValue;
	}

	public void setRouteValue(String routeValue) {
		this.routeValue = routeValue;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Menus getMenus() {
		return this.menus;
	}

	public void setMenus(Menus menus) {
		this.menus = menus;
	}

	public Set<Menus> getMenuses() {
		return this.menuses;
	}

	public void setMenuses(Set<Menus> menuses) {
		this.menuses = menuses;
	}

	public Menus addMenus(Menus menus) {
		getMenuses().add(menus);
		menus.setMenus(this);

		return menus;
	}

	public Menus removeMenus(Menus menus) {
		getMenuses().remove(menus);
		menus.setMenus(null);

		return menus;
	}

}