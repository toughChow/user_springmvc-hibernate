package com.qingshixun.project.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingshixun.project.dao.UserDao;
import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.model.User;
import com.qingshixun.project.service.UserService;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.save(user);
	}

	@Override
	public void saveUserWithHobAndPro(User user, Set<Hobby> hobbies, Profession profession) {
		userDao.saveUserWithHobAndPro(user, hobbies, profession);
	}

}
