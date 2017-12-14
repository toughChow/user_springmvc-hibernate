package com.qingshixun.project.service;

import java.util.Set;

import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.model.User;

public interface UserService {

	public void addUser(User user);
	
	public void saveUserWithHobAndPro(User user,Set<Hobby> hobbies,Profession profession);
}
