package com.macrosoft.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class TA {
	@Id
	@NotEmpty(message="is required")
	@Size(max=4, message="Max length 4")
	@Pattern(regexp="^B(.*)", message="required format Bxxxxxxxx")
	private String bnum;

	@Column(name="ta_level")
	private String taLevel;
	
	@Column(name="office")
	private String office;

	public String getBnum() {
		return bnum;
	}

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	public String getTaLevel() {
		return taLevel;
	}

	public void setTaLevel(String taLevel) {
		this.taLevel = taLevel;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}
