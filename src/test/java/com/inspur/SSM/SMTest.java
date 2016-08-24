package com.inspur.SSM;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.inspur.SSM.Service.UserService;
import com.inspur.SSM.mongo.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})  
public class SMTest {
	@Autowired
	private UserService userService;
	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void test(){
		System.out.println(JSON.toJSONString(userService.selectByPrimaryKey(1000)));
		System.out.println(JSON.toJSONString(mongoTemplate.findById("57bbc055152be3592bd76937", Customer.class)));
	}
}
