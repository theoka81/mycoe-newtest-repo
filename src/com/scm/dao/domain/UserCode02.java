package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UserCode02 database table.
 * 
 */
@Entity
@Table(name="UserCode02")
@NamedQuery(name="UserCode02.findAll", query="SELECT u FROM UserCode02 u")
public class UserCode02 implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Column(name="[Code Type]", length=50)
	private String code_Type;

	@Column(name="[Code Value]", length=50)
	private String code_Value;

	@Column(name="Description", length=50)
	private String description;

	@Column(name="[Description Extended]", length=500)
	private String description_Extended;

	@Column(name="[Module ID]", length=50)
	private String module_ID;

	public UserCode02() {
	}

	public String getCode_Type() {
		return this.code_Type;
	}

	public void setCode_Type(String code_Type) {
		this.code_Type = code_Type;
	}

	public String getCode_Value() {
		return this.code_Value;
	}

	public void setCode_Value(String code_Value) {
		this.code_Value = code_Value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription_Extended() {
		return this.description_Extended;
	}

	public void setDescription_Extended(String description_Extended) {
		this.description_Extended = description_Extended;
	}

	public String getModule_ID() {
		return this.module_ID;
	}

	public void setModule_ID(String module_ID) {
		this.module_ID = module_ID;
	}

}