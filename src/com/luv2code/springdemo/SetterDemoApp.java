package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// retrive bean from spring container
		CricketCoach theCoach=context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on bean
		System.out.println("inside setter main method");
		System.out.println(theCoach.getDailyFortuneService());
		System.out.println(theCoach.getDailyWorkOut());
		
		// call our new method to get the setter literal value
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// close the context
		context.close();
	}

}
