package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the AspNetRoles database table.
 * 
 */
@Entity
@Table(name="AspNetRoles")
@NamedQuery(name="AspNetRole.findAll", query="SELECT a FROM AspNetRole a")
public class AspNetRole implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private String id;

	@Column(name="Name", nullable=false)
	private String name;

	//bi-directional many-to-many association to AspNetUser
	@ManyToMany(mappedBy="aspNetRoles")
	private Set<AspNetUser> aspNetUsers;

	public AspNetRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<AspNetUser> getAspNetUsers() {
		return this.aspNetUsers;
	}

	public void setAspNetUsers(Set<AspNetUser> aspNetUsers) {
		this.aspNetUsers = aspNetUsers;
	}

}