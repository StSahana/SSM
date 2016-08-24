package com.inspur.SSM;

import static org.springframework.data.mongodb.core.query.Criteria.*;
import static org.springframework.data.mongodb.core.query.Query.*;
import static org.springframework.data.mongodb.core.query.Update.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.inspur.SSM.mongo.model.Customer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})  
public class MongoTest {
	@Autowired
	private MongoTemplate mongoTemplate;
	private Query query=query(where("sex").is("ÄÐ"));
	private Update update=update("name", "update");
	
	@Before
	public void BeforeMethod(){
		System.out.println("-----------------------------------------------");
	}
	
	@After
	public void AfterMethod(){
		System.out.println("------------------------------------------------");
	}
	
	@Test
	public void testFind(){
		System.out.println(JSON.toJSONString(mongoTemplate.find(query(where("sex").is("ÄÐ")), Customer.class)));
	}
	
	@Test
	public void testFindOne(){
		System.out.println(JSON.toJSONString(mongoTemplate.find(query(where("sex").is("ÄÐ")), Customer.class)));
	}
	
	@Test
	public void testCount(){
		System.out.println(mongoTemplate.count(query(where("sex").is("ÄÐ")), Customer.class));
		System.out.println(mongoTemplate.count(query(where("sex").is("ÄÐ")), "users"));
	}
	
	@Test
	public void testInsert(){
		Customer customer=new Customer("testupdate", "test");
		mongoTemplate.insert(customer);
	}
	
	@Test
	public void testUpdateFirst(){
		mongoTemplate.updateFirst(query, update, Customer.class);
	}
	
	@Test
	public void testUpdateMulti(){
		mongoTemplate.updateMulti(query, update, Customer.class);
	}
	
	@Test
	public void testUpdateInsert(){
		mongoTemplate.upsert(query(where("sex").is("Å®")), update, Customer.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
