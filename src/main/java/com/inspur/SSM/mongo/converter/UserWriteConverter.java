package com.inspur.SSM.mongo.converter;

import com.inspur.SSM.mongo.model.Customer;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import org.springframework.core.convert.converter.Converter;

public class UserWriteConverter implements Converter<Customer,DBObject>{

	@Override
	public DBObject convert(Customer user) {
		DBObject dbo = new BasicDBObject();
		dbo.put("_id", user.getId());
	    dbo.put("username", user.getUsername());
	    dbo.put("password", user.getPassword());
	    return dbo;
	}

}
