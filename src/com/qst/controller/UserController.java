package com.qst.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qst.entity.User;
import com.qst.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("userlogin.form")
	public String userlogin(HttpServletRequest req, HttpServletResponse resp, String username, String password) {
		User user = userService.userlogin(username, password);
		if (user != null) {
			return "success";
		} else {
			return null;
		}

	}

	@RequestMapping("register.form")
	public String register(HttpServletRequest req, HttpServletResponse resp, String username, String password) {

		User user = userService.getuser(username);
		if (user == null) {
			userService.register(username, password);
			return "success";
		} else {
			return null;
		}

	}
}
