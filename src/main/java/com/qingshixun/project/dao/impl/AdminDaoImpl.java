package com.qingshixun.project.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.qingshixun.project.dao.AdminDao;
import com.qingshixun.project.model.Admin;
import com.qingshixun.project.model.Hobby;

@Repository(value="adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin, Integer> implements AdminDao{

	@Override
	public void login(Admin admin) {
		Admin adminT = get(admin.getId());
		if(adminT != null){
			System.out.println("存在");
		}else
			System.out.println("不存在");
	}

	@Override
	public void addAdmin(Admin admin) {
		save(admin);
		System.out.println("添加成功");
	}
	
	@Override
	public Admin getAdminByName(String name) {
		return (Admin) getSession().createCriteria(entityClass).add(Restrictions.like("hobby", name)).uniqueResult();
	}

}
