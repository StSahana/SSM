package com.inspur.SSM.redis.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@RedisHash("persons")
public class Person {
		@Id 
		String id;
	  String firstname;
	  String lastname;
	  @TimeToLive
	  private Long expiration=300l;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getExpiration() {
		return expiration;
	}
	public void setExpiration(Long expiration) {
		this.expiration = expiration;
	}
	public Person(String id, String firstname, String lastname, Long expiration) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.expiration = expiration;
	}
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	  
}
