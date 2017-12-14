package com.qingshixun.project.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingshixun.project.dao.AdminDao;
import com.qingshixun.project.model.Admin;
import com.qingshixun.project.service.AdminService;

@Service(value="adminService")
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void Login(Admin admin) {	
		Admin admin2 = adminDao.getAdminByName(admin.getUsername());
		
		if(admin2 != null){
			if(admin2.getUsername().equals(admin.getUsername()) && 
					admin2.getPassword().equals(admin.getPassword())){
				System.out.println("登陆成功");
			}else
				System.out.println("登陆失败");
		}else
			System.out.println("用户不存在");
	}

	@Override
	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}
}
