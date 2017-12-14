package com.qingshixun.project.dao.impl;

import java.util.Date;
import java.util.Set;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.qingshixun.project.dao.UserDao;
import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.model.User;

@Repository(value = "userDao")
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements UserDao {

	@Override
	public User getByName(String name) {
		return (User) getSession().createCriteria(entityClass).add(Restrictions.like("username", name)).uniqueResult();
	}

	@Override
	public void saveUserWithHobAndPro(User user,Set<Hobby> hobbies, Profession profession) {
		user.setHobbies(hobbies);
		user.setProfession(profession);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		getSession().saveOrUpdate(user);
	}
}
