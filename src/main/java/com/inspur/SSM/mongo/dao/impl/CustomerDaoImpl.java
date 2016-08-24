package com.inspur.SSM.mongo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inspur.SSM.mongo.dao.CustomerDao;
import com.inspur.SSM.mongo.model.Customer;

@Service
public class CustomerDaoImpl implements CustomerDao {
	@Autowired  
    private MongoTemplate mongoTemplate;  

	@Override
	public List<Customer> findList() {
		return null;
	}

	@Override
	public Customer findOne(String id) {
		Query query = new Query();  
        query.addCriteria(new Criteria("_id").is(id));  
        return this.mongoTemplate.findOne(query, Customer.class);
	}

	@Override
	public Customer findOneByCustomername(String username) {
		Query query = new Query();  
        query.addCriteria(new Criteria("username").is(username));  
        return this.mongoTemplate.findOne(query, Customer.class);
	}

}
