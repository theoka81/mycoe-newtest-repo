package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the BbbeeCertificateTypes database table.
 * 
 */
@Entity
@Table(name="BbbeeCertificateTypes")
@NamedQuery(name="BbbeeCertificateType.findAll", query="SELECT b FROM BbbeeCertificateType b")
public class BbbeeCertificateType implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CertificateTypeId", unique=true, nullable=false)
	private Integer certificateTypeId;

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

	//bi-directional many-to-one association to Bbbee
	@OneToMany(mappedBy="bbbeeCertificateType")
	private Set<Bbbee> bbbees;

	public BbbeeCertificateType() {
	}

	public Integer getCertificateTypeId() {
		return this.certificateTypeId;
	}

	public void setCertificateTypeId(Integer certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
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

	public Set<Bbbee> getBbbees() {
		return this.bbbees;
	}

	public void setBbbees(Set<Bbbee> bbbees) {
		this.bbbees = bbbees;
	}

	public Bbbee addBbbee(Bbbee bbbee) {
		getBbbees().add(bbbee);
		bbbee.setBbbeeCertificateType(this);

		return bbbee;
	}

	public Bbbee removeBbbee(Bbbee bbbee) {
		getBbbees().remove(bbbee);
		bbbee.setBbbeeCertificateType(null);

		return bbbee;
	}

}