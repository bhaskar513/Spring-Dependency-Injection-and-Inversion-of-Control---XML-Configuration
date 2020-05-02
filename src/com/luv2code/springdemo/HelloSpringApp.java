package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortuneService());
		System.out.println("working");
		context.close();
		
	} 

}
