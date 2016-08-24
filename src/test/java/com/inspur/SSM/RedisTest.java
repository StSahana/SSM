package com.inspur.SSM;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.inspur.SSM.redis.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml" })
public class RedisTest {
	@Autowired
	RedisTemplate<String, String> redisTemplate;

	@Test
	public void testSet() {
		Person rand = new Person("rand", "althor");
		rand.setId("1052");
		redisTemplate.opsForValue().set(rand.getId(), JSON.toJSONString(rand));
	}

	@Test
	public void testGet() {
		System.out.println(redisTemplate.opsForValue().get("1052"));
	}

	@Test
	public void testDelete() {
		redisTemplate.delete("1052");
	}

	@Test
	public void testSize() {
		System.out.println(redisTemplate.opsForValue().size("1052"));
	}

}
