package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeSectorCharters database table.
 * 
 */
@Entity
@Table(name="BbbeeSectorCharters")
@NamedQuery(name="BbbeeSectorCharter.findAll", query="SELECT b FROM BbbeeSectorCharter b")
public class BbbeeSectorCharter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SectorCharterId")
	private int sectorCharterId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="InterfaceValue")
	private String interfaceValue;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ParentSectorCharterId")
	private int parentSectorCharterId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Repealed")
	private boolean repealed;

	@Column(name="RepealedEffectiveDate")
	private Timestamp repealedEffectiveDate;

	@Column(name="Revised")
	private boolean revised;

	@Column(name="RevisedEffectiveDate")
	private Timestamp revisedEffectiveDate;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BbbeeSectorCharter() {
	}

	public int getSectorCharterId() {
		return this.sectorCharterId;
	}

	public void setSectorCharterId(int sectorCharterId) {
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentSectorCharterId() {
		return this.parentSectorCharterId;
	}

	public void setParentSectorCharterId(int parentSectorCharterId) {
		this.parentSectorCharterId = parentSectorCharterId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public boolean getRepealed() {
		return this.repealed;
	}

	public void setRepealed(boolean repealed) {
		this.repealed = repealed;
	}

	public Timestamp getRepealedEffectiveDate() {
		return this.repealedEffectiveDate;
	}

	public void setRepealedEffectiveDate(Timestamp repealedEffectiveDate) {
		this.repealedEffectiveDate = repealedEffectiveDate;
	}

	public boolean getRevised() {
		return this.revised;
	}

	public void setRevised(boolean revised) {
		this.revised = revised;
	}

	public Timestamp getRevisedEffectiveDate() {
		return this.revisedEffectiveDate;
	}

	public void setRevisedEffectiveDate(Timestamp revisedEffectiveDate) {
		this.revisedEffectiveDate = revisedEffectiveDate;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}