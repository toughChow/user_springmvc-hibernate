package com.qingshixun.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cp9_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String username;
	
	private String password;
	
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	
	private String gender; // 性別
	
	private String profession; // 职业
	
	private String hobbies; //兴趣爱好

	public User() {
		super();
	}

	public User(String username, String password, String email, Date birthday, String gender, String profession,
			String hobbies) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.profession = profession;
		this.hobbies = hobbies;
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", birthday=" + birthday + ", gender=" + gender + ", profession=" + profession + ", hobbies="
				+ hobbies + "]";
	}
	
}
