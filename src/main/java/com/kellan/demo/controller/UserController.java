package com.kellan.demo.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kellan.demo.bean.User;
import com.kellan.demo.dao.UserDao;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDao userDao;

	@RequestMapping("/save")
	@ResponseBody
	public HashMap<String, Object> save(String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setName(name);
		user.setCreateTime(new Date());
		userDao.save(user);
		map.put("user", user);
		return map;
	}
	
}
