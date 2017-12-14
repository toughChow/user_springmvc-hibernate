package com.qingshixun.project.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qingshixun.project.model.Hobby;
import com.qingshixun.project.model.Profession;
import com.qingshixun.project.model.User;
import com.qingshixun.project.service.HobbyService;
import com.qingshixun.project.service.ProfessionService;
import com.qingshixun.project.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private HobbyService hobbyService;
	@Autowired
	private ProfessionService professionService;

	@RequestMapping("/index")
	public String index() {
		return "userForm";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user) {
		Set<Hobby> hobbies = user.getHobbies();
		Set<Hobby> hobbiesFromDB = new HashSet<>();
		for (Hobby hobby : hobbies) {
			Hobby hobbyByName = hobbyService.getHobbyByName(hobby.getHobby());
			hobbiesFromDB.add(hobbyByName);
		}
		Profession profession = user.getProfession();
		Profession professionByName = professionService.getProfessionByName(profession.getProfessionName());
		userService.saveUserWithHobAndPro(user, hobbiesFromDB, professionByName);
		
		// 添加关联profession
//		String profession = user.getProfession().getProfessionName();
//		Profession profession2 = professionService.getProfessionByName(profession);
//		user.setProfession(profession2);
		

		// 添加关联hobby
//		Set<Hobby> hobbies = user.getHobbies();
//		for (Hobby hobby : hobbies) {
//			Hobby hobby2 = hobbyService.getHobbyByName(hobby.getHobby());
//			System.out.println("id:" + hobby2);
//			user.getHobbies().add(hobby2);
//			hobbyService.addHobby(hobby2, user);
//		}

		return "success";
	}

}
