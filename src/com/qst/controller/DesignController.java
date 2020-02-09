package com.qst.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignController {
@RequestMapping("getuser.form")
public String user(HttpServletRequest req) {
	return "xiaoma";
	
}
}
