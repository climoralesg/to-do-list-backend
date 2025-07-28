package com.claudio.todolist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.claudio.todolist.dao.HealthInterface;
import com.claudio.todolist.impl.HealthImpl;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	public void testHealth() {
		HealthInterface service = new HealthImpl();
        HashMap <String,String> map = new HashMap<>();
        map.put("status","OK");
		assertEquals(service.health(), map);
		
	}

}
