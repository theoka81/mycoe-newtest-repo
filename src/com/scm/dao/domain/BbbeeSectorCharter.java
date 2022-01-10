package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the BbbeeSectorCharters database table.
 * 
 */
@Entity
@Table(name="BbbeeSectorCharters")
@NamedQuery(name="BbbeeSectorCharter.findAll", query="SELECT b FROM BbbeeSectorCharter b")
public class BbbeeSectorCharter implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SectorCharterId", unique=true, nullable=false)
	private Integer sectorCharterId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="InterfaceValue")
	private String interfaceValue;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ParentSectorCharterId")
	private Integer parentSectorCharterId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Repealed")
	private Boolean repealed;

	@Column(name="RepealedEffectiveDate")
	private Timestamp repealedEffectiveDate;

	@Column(name="Revised")
	private Boolean revised;

	@Column(name="RevisedEffectiveDate")
	private Timestamp revisedEffectiveDate;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Bbbee
	@OneToMany(mappedBy="bbbeeSectorCharter1")
	private Set<Bbbee> bbbees1;

	//bi-directional many-to-one association to Bbbee
	@OneToMany(mappedBy="bbbeeSectorCharter2")
	private Set<Bbbee> bbbees2;

	public BbbeeSectorCharter() {
	}

	public Integer getSectorCharterId() {
		return this.sectorCharterId;
	}

	public void setSectorCharterId(Integer sectorCharterId) {
		this.sectorCharterId = sectorCharterId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getInterfaceValue() {
		return this.interfaceValue;
	}

	public void setInterfaceValue(String interfaceValue) {
		this.interfaceValue = interfaceValue;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentSectorCharterId() {
		return this.parentSectorCharterId;
	}

	public void setParentSectorCharterId(Integer parentSectorCharterId) {
		this.parentSectorCharterId = parentSectorCharterId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Boolean getRepealed() {
		return this.repealed;
	}

	public void setRepealed(Boolean repealed) {
		this.repealed = repealed;
	}

	public Timestamp getRepealedEffectiveDate() {
		return this.repealedEffectiveDate;
	}

	public void setRepealedEffectiveDate(Timestamp repealedEffectiveDate) {
		this.repealedEffectiveDate = repealedEffectiveDate;
	}

	public Boolean getRevised() {
		return this.revised;
	}

	public void setRevised(Boolean revised) {
		this.revised = revised;
	}

	public Timestamp getRevisedEffectiveDate() {
		return this.revisedEffectiveDate;
	}

	public void setRevisedEffectiveDate(Timestamp revisedEffectiveDate) {
		this.revisedEffectiveDate = revisedEffectiveDate;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Set<Bbbee> getBbbees1() {
		return this.bbbees1;
	}

	public void setBbbees1(Set<Bbbee> bbbees1) {
		this.bbbees1 = bbbees1;
	}

	public Bbbee addBbbees1(Bbbee bbbees1) {
		getBbbees1().add(bbbees1);
		bbbees1.setBbbeeSectorCharter1(this);

		return bbbees1;
	}

	public Bbbee removeBbbees1(Bbbee bbbees1) {
		getBbbees1().remove(bbbees1);
		bbbees1.setBbbeeSectorCharter1(null);

		return bbbees1;
	}

	public Set<Bbbee> getBbbees2() {
		return this.bbbees2;
	}

	public void setBbbees2(Set<Bbbee> bbbees2) {
		this.bbbees2 = bbbees2;
	}

	public Bbbee addBbbees2(Bbbee bbbees2) {
		getBbbees2().add(bbbees2);
		bbbees2.setBbbeeSectorCharter2(this);

		return bbbees2;
	}

	public Bbbee removeBbbees2(Bbbee bbbees2) {
		getBbbees2().remove(bbbees2);
		bbbees2.setBbbeeSectorCharter2(null);

		return bbbees2;
	}

}