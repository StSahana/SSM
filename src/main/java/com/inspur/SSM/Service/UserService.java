package com.inspur.SSM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inspur.SSM.dao.UserMapper;
import com.inspur.SSM.entity.User;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User selectByPrimaryKey(Integer userId){
		return userMapper.selectByPrimaryKey(userId);
	};

}
