package com.inspur.SSM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.inspur.SSM.Service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="test",method=RequestMethod.GET)
	public String test(){
		return "login";
	}
	
	@RequestMapping(value="test0",method=RequestMethod.GET)
	@ResponseBody
	public String test0(){
		return JSON.toJSONString(userService.selectByPrimaryKey(1000));
	}
}
