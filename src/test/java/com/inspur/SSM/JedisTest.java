package com.inspur.SSM;

import org.junit.Test;


import redis.clients.jedis.Jedis;

public class JedisTest {
	
	
	@Test
	public void testConnection(){
		Jedis jedis=new Jedis("localhost",6379);
		jedis.auth("redisAdmin");
		System.out.println(jedis.get("mykey"));
	}

}
