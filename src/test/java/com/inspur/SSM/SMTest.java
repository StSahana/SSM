package com.inspur.SSM;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.inspur.SSM.Service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})  
public class SMTest {
	@Autowired
	UserService userService;

	@Test
	public void test(){
		System.out.println(JSON.toJSONString(userService.selectByPrimaryKey(1000)));
	}
}
