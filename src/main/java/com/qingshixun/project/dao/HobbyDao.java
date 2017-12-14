package com.qingshixun.project.dao;

import com.qingshixun.project.model.Hobby;

public interface HobbyDao extends BaseDao<Hobby, Integer>{

	public Hobby getHobbyByName(String name);
	
}
