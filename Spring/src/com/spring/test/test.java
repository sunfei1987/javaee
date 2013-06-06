package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Chinese;
import com.spring.Person;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Person p = ctx.getBean("chinese",Person.class);
		p.userAxe();
	}

}
