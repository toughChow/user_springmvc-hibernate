package com.qingshixun.project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingshixun.project.dao.HobbyDao;
import com.qingshixun.project.dao.ProfessionDao;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.service.ProfessionService;

@Service
@Transactional
public class ProfessionServiceImpl implements ProfessionService{

	@Autowired
	private ProfessionDao professionDao;

	@Override
	public Profession getProfessionByName(String name) {
		return professionDao.getProfessionByName(name);
	}
	

}
