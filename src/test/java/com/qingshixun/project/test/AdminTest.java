package com.qingshixun.project.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.qingshixun.project.dao.AdminDao;
import com.qingshixun.project.model.Admin;
import com.qingshixun.project.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@Transactional
public class AdminTest {
	
	@Autowired
	private AdminDao adminDaoImpl;
	
	@Autowired
	private AdminService adminService;
	
	@Test
	public void testLogin(){
//		adminDaoImpl.login(new Admin(1, "", ""));
		adminService.Login(new Admin("admin","admin2"));
	}
	
	@Test
	public void testAddAdmin(){
		adminDaoImpl.addAdmin(new Admin("admin","admin"));
//		adminService.addAdmin(new Admin("admin","admin"));
	}
	
}
