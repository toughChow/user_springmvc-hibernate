package com.qingshixun.project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cp9_hobby")
public class Hobby extends BaseModel {

	private String hobby;

	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="hobbies")
	private Set<User> users = new HashSet<>(); // 兴趣爱好

	public Hobby() {
		super();
	}

	public Hobby(String hobby) {
		super();
		this.hobby = hobby;
	}

	public Hobby(String hobby, Set<User> users) {
		super();
		this.hobby = hobby;
		this.users = users;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Hobby [hobby=" + hobby  + super.toString() +"]";
	}

}
