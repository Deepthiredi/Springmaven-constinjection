package com.testyanthra.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/testyanthra/constructor_injection/config.xml");
	
		Student std=(Student) context.getBean("student");
		System.out.println(std);
	}

}
