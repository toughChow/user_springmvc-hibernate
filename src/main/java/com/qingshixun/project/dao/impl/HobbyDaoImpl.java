package com.qingshixun.project.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.qingshixun.project.dao.HobbyDao;
import com.qingshixun.project.model.Hobby;

@Repository
public class HobbyDaoImpl extends BaseDaoImpl<Hobby, Integer> implements HobbyDao{

	@Override
	public Hobby getHobbyByName(String name) {
		return (Hobby) getSession().createCriteria(entityClass).add(Restrictions.like("hobby", name)).uniqueResult();
	}
}
