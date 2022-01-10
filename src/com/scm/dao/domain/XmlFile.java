package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the XmlFiles database table.
 * 
 */
@Entity
@Table(name="XmlFiles")
@NamedQuery(name="XmlFile.findAll", query="SELECT x FROM XmlFile x")
public class XmlFile implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Integer id;

	@Column(name="Filename", length=128)
	private String filename;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	public XmlFile() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

}