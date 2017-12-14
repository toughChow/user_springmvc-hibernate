package com.qingshixun.project.dao;

import java.util.Set;

import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.model.User;

public interface UserDao extends BaseDao<User, Integer>{

	/**
	 * 通过姓名查询单条记录
	 * @param name
	 * @return
	 */
	public User getByName(String name);
	
	public void saveUserWithHobAndPro(User user,Set<Hobby> hobbies,Profession profession);
}
