package com.qingshixun.project.dao;

import com.qingshixun.project.model.Admin;

public interface AdminDao extends BaseDao<Admin, Integer>{

	/**
	 * 登陆
	 * @param admin
	 */
	public void login(Admin admin);
	
	/**
	 * 添加管理员
	 * @param admin
	 */
	public void addAdmin(Admin admin);
	
	public Admin getAdminByName(String name);
}
