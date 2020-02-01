package com.macrosoft.myproject.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
public class Prerequisite {

	@EmbeddedId
	private PreKey id;

	public PreKey getId() {
		return id;
	}

	public void setId(PreKey id) {
		this.id = id;
	}
}
