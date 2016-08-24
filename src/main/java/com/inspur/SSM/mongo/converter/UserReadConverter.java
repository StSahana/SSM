package com.inspur.SSM.mongo.converter;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;

import com.inspur.SSM.mongo.model.Customer;
import com.mongodb.DBObject;

public class UserReadConverter implements Converter<DBObject, Customer>{

	@Override
	public Customer convert(DBObject dbObject) {
		Customer user=new Customer((String)dbObject.get("_id"),(String)dbObject.get("username"),
				(String)dbObject.get("password"));
		return user;
	}

}
