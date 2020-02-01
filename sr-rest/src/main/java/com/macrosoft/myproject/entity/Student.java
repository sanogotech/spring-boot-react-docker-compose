package com.macrosoft.myproject.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Student {
	@Id
	@NotEmpty(message="is required")
	@Size(max=4, message="Max length 4")
	@Pattern(regexp="^B(.*)", message="required format Bxxxxxxxx")
	private String bnum;

	@NotEmpty(message="is required")
	@Column(name="first_name")
	private String fname;

	@NotEmpty(message="is required")
	@Column(name="last_name")
	private String lname;

	@NotEmpty(message="is required")
	@Column(name="email", unique=true)
	private String email;

	@Column(name="status")
	private String status;

	@NotEmpty(message="is required")
	@Column(name="deptname")
	private String deptname;

	@Max(4)
	@Min(0)
	private Double gpa;

	@ManyToMany(fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Cls> classes;

	public List<Cls> getClasses() {
		return classes;
	}

	public void setClasses(List<Cls> classes) {
		this.classes = classes;
	}

	@Column(name="bdate")
	private LocalDate bdate;

	public Student() {
	}


	

	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public String getBnum() {
		return bnum;
	}

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Studentx [bnum=" + bnum + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", status="
				+ status + ", deptname=" + deptname + ", gpa=" + gpa + ", bdate=" + bdate + "]";
	}
}