package com.qingshixun.project.service;

import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.User;

public interface HobbyService {

	public void addHobby(Hobby hobby,User user);
	
	public Hobby getHobbyByName(String name);
}
