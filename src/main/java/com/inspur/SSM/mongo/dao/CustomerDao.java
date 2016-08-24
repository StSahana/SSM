package com.inspur.SSM.mongo.dao;

import java.util.List;





import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inspur.SSM.mongo.model.Customer;


public interface CustomerDao {

	public abstract List<Customer> findList();

	public abstract Customer findOne(String id);

	public abstract Customer findOneByCustomername(String username);

}
