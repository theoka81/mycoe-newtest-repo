package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the StandardAgreementItems database table.
 * 
 */
@Entity
@Table(name="StandardAgreementItems")
@NamedQuery(name="StandardAgreementItem.findAll", query="SELECT s FROM StandardAgreementItem s")
public class StandardAgreementItem implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private StandardAgreementItemPK id;

	//bi-directional many-to-one association to StandardAgreement
	@ManyToOne
	@JoinColumn(name="SAId", nullable=false, insertable=false, updatable=false)
	private StandardAgreement standardAgreement;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode;

	public StandardAgreementItem() {
	}

	public StandardAgreementItemPK getId() {
		return this.id;
	}

	public void setId(StandardAgreementItemPK id) {
		this.id = id;
	}

	public StandardAgreement getStandardAgreement() {
		return this.standardAgreement;
	}

	public void setStandardAgreement(StandardAgreement standardAgreement) {
		this.standardAgreement = standardAgreement;
	}

	public UserCode getUserCode() {
		return this.userCode;
	}

	public void setUserCode(UserCode userCode) {
		this.userCode = userCode;
	}

}