package com.qingshixun.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cp9_profession")
public class Profession extends BaseModel{

	private String professionName;

	public Profession() {
		super();
	}

	public Profession(String professionName) {
		super();
		this.professionName = professionName;
	}

	public String getProfessionName() {
		return professionName;
	}

	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}

}
