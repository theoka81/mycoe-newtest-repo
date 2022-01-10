package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the DirectorStatus database table.
 * 
 */
@Entity
@Table(name="DirectorStatus")
@NamedQuery(name="DirectorStatus.findAll", query="SELECT d FROM DirectorStatus d")
public class DirectorStatus implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DirectorStatusId", unique=true, nullable=false)
	private Integer directorStatusId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Director
	@OneToMany(mappedBy="directorStatus")
	private Set<Director> directors;

	public DirectorStatus() {
	}

	public Integer getDirectorStatusId() {
		return this.directorStatusId;
	}

	public void setDirectorStatusId(Integer directorStatusId) {
		this.directorStatusId = directorStatusId;
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
		director.setDirectorStatus(this);

		return director;
	}

	public Director removeDirector(Director director) {
		getDirectors().remove(director);
		director.setDirectorStatus(null);

		return director;
	}

}