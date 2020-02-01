package com.macrosoft.myproject.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course implements Serializable{
	@EmbeddedId
	private CourseKey id;

	@NotEmpty
	@Column(name="title")
	private String title;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
	@JsonIgnore
	private List<Cls> classes;

	public List<Cls> getClasses() {
		return classes;
	}

	public void setClasses(List<Cls> classes) {
		this.classes = classes;
	}

	public CourseKey getId() {
		return id;
	}

	public void setId(CourseKey id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
