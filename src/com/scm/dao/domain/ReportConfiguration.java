package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ReportConfigurations database table.
 * 
 */
@Entity
@Table(name="ReportConfigurations")
@NamedQuery(name="ReportConfiguration.findAll", query="SELECT r FROM ReportConfiguration r")
public class ReportConfiguration implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DevelopmentVirtualPath")
	private String developmentVirtualPath;

	@Column(name="EnviromentType")
	private String enviromentType;

	@Column(name="EnviromentTypeId")
	private Long enviromentTypeId;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ProductionVirtualPath")
	private String productionVirtualPath;

	@Column(name="QaVirtualPath")
	private String qaVirtualPath;

	@Column(name="ReportBootstrapColumns")
	private String reportBootstrapColumns;

	@Column(name="ReportBootstrapIcon")
	private String reportBootstrapIcon;

	@Column(name="ReportDescription")
	private String reportDescription;

	@Column(name="ReportKey")
	private String reportKey;

	@Column(name="ReportModule")
	private String reportModule;

	@Column(name="ReportName")
	private String reportName;

	private String UATVirtualPath;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public ReportConfiguration() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDevelopmentVirtualPath() {
		return this.developmentVirtualPath;
	}

	public void setDevelopmentVirtualPath(String developmentVirtualPath) {
		this.developmentVirtualPath = developmentVirtualPath;
	}

	public String getEnviromentType() {
		return this.enviromentType;
	}

	public void setEnviromentType(String enviromentType) {
		this.enviromentType = enviromentType;
	}

	public Long getEnviromentTypeId() {
		return this.enviromentTypeId;
	}

	public void setEnviromentTypeId(Long enviromentTypeId) {
		this.enviromentTypeId = enviromentTypeId;
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

	public String getProductionVirtualPath() {
		return this.productionVirtualPath;
	}

	public void setProductionVirtualPath(String productionVirtualPath) {
		this.productionVirtualPath = productionVirtualPath;
	}

	public String getQaVirtualPath() {
		return this.qaVirtualPath;
	}

	public void setQaVirtualPath(String qaVirtualPath) {
		this.qaVirtualPath = qaVirtualPath;
	}

	public String getReportBootstrapColumns() {
		return this.reportBootstrapColumns;
	}

	public void setReportBootstrapColumns(String reportBootstrapColumns) {
		this.reportBootstrapColumns = reportBootstrapColumns;
	}

	public String getReportBootstrapIcon() {
		return this.reportBootstrapIcon;
	}

	public void setReportBootstrapIcon(String reportBootstrapIcon) {
		this.reportBootstrapIcon = reportBootstrapIcon;
	}

	public String getReportDescription() {
		return this.reportDescription;
	}

	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}

	public String getReportKey() {
		return this.reportKey;
	}

	public void setReportKey(String reportKey) {
		this.reportKey = reportKey;
	}

	public String getReportModule() {
		return this.reportModule;
	}

	public void setReportModule(String reportModule) {
		this.reportModule = reportModule;
	}

	public String getReportName() {
		return this.reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getUATVirtualPath() {
		return this.UATVirtualPath;
	}

	public void setUATVirtualPath(String UATVirtualPath) {
		this.UATVirtualPath = UATVirtualPath;
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

}