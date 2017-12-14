package com.qingshixun.project.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cp9_user")
public class User extends BaseModel {

	private String username;

	private String password;

	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	private String gender; // 性別

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "profession")
	private Profession profession; // 职业

	@ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "cp9_user_hobby", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "hobby_id") })
	private Set<Hobby> hobbies = new HashSet<>(); // 兴趣爱好

	public User() {
		super();
	}

	public User(String username, String password, String email, Date birthday, String gender, Profession profession,
			Set<Hobby> hobbies) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.profession = profession;
		this.hobbies = hobbies;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Set<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", birthday=" + birthday
				+ ", gender=" + gender + ", profession=" + profession + ", hobbies=" + hobbies + "]";
	}

}
