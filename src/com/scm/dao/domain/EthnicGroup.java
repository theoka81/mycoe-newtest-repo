package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the EthnicGroups database table.
 * 
 */
@Entity
@Table(name="EthnicGroups")
@NamedQuery(name="EthnicGroup.findAll", query="SELECT e FROM EthnicGroup e")
public class EthnicGroup implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EthnicGroupId", unique=true, nullable=false)
	private Integer ethnicGroupId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="EventCode")
	private String eventCode;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsDesignatedBbbeeGroup")
	private Boolean isDesignatedBbbeeGroup;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Director
	@OneToMany(mappedBy="ethnicGroup")
	private Set<Director> directors;

	public EthnicGroup() {
	}

	public Integer getEthnicGroupId() {
		return this.ethnicGroupId;
	}

	public void setEthnicGroupId(Integer ethnicGroupId) {
		this.ethnicGroupId = ethnicGroupId;
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

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDesignatedBbbeeGroup() {
		return this.isDesignatedBbbeeGroup;
	}

	public void setIsDesignatedBbbeeGroup(Boolean isDesignatedBbbeeGroup) {
		this.isDesignatedBbbeeGroup = isDesignatedBbbeeGroup;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Set<Director> getDirectors() {
		return this.directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}

	public Director addDirector(Director director) {
		getDirectors().add(director);
		director.setEthnicGroup(this);

		return director;
	}

	public Director removeDirector(Director director) {
		getDirectors().remove(director);
		director.setEthnicGroup(null);

		return director;
	}

}