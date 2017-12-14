package com.qingshixun.project.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.qingshixun.project.dao.ProfessionDao;
import com.qingshixun.project.model.Profession;

@Repository
public class ProfessionDaoImpl extends BaseDaoImpl<Profession, Integer> implements ProfessionDao{

	@Override
	public Profession getProfessionByName(String name) {
		return (Profession) getSession().createCriteria(entityClass).add(Restrictions.like("professionName", name)).uniqueResult();
	}
	
}
