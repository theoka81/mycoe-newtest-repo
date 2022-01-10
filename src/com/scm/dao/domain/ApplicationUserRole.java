package com.scm.dao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ApplicationUserRoles database table.
 * 
 */
@Entity
@Table(name="ApplicationUserRoles")
@NamedQuery(name="ApplicationUserRole.findAll", query="SELECT a FROM ApplicationUserRole a")
public class ApplicationUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@OneToOne
	@JoinColumn(name="RoleId")
	private ApplicationRole applicationRole;

	public ApplicationUserRole() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public ApplicationRole getApplicationRole() {
		return this.applicationRole;
	}

	public void setApplicationRole(ApplicationRole applicationRole) {
		this.applicationRole = applicationRole;
	}

}