package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the IdTypes database table.
 * 
 */
@Entity
@Table(name="IdTypes")
@NamedQuery(name="IdType.findAll", query="SELECT i FROM IdType i")
public class IdType implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdTypeId", unique=true, nullable=false)
	private Integer idTypeId;

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
	@OneToMany(mappedBy="idType")
	private Set<Director> directors;

	public IdType() {
	}

	public Integer getIdTypeId() {
		return this.idTypeId;
	}

	public void setIdTypeId(Integer idTypeId) {
		this.idTypeId = idTypeId;
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
		director.setIdType(this);

		return director;
	}

	public Director removeDirector(Director director) {
		getDirectors().remove(director);
		director.setIdType(null);

		return director;
	}

}