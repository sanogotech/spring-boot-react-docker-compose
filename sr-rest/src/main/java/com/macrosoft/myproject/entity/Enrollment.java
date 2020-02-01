package com.macrosoft.myproject.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Enrollment {

	@EmbeddedId
	private EnrollmentKey id;

	@Column(name="lgrade")
	private String lgrade;

	public EnrollmentKey getId() {
		return id;
	}

	public void setId(EnrollmentKey id) {
		this.id = id;
	}

	public String getLgrade() {
		return lgrade;
	}

	public void setLgrade(String lgrade) {
		this.lgrade = lgrade;
	}
}
