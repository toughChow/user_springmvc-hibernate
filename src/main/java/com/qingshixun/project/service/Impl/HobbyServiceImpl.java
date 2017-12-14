package com.qingshixun.project.service.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingshixun.project.dao.HobbyDao;
import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.User;
import com.qingshixun.project.service.HobbyService;

@Service
@Transactional
public class HobbyServiceImpl implements HobbyService {

	@Autowired
	private HobbyDao hobbyDao;

	@Override
	public void addHobby(Hobby hobby, User user) {
		if (user != null) {
			user.setCreateTime(new Date());
			user.setUpdateTime(new Date());
			hobby.getUsers().add(user);
		}
		hobbyDao.saveOrUpdate(hobby);
		
	}

	@Override
	public Hobby getHobbyByName(String name) {
		return hobbyDao.getHobbyByName(name);
	}

}
