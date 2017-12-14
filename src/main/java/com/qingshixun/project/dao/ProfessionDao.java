package com.qingshixun.project.dao;

import com.qingshixun.project.model.Profession;

public interface ProfessionDao extends BaseDao<Profession, Integer>{

	public Profession getProfessionByName(String name);
}
