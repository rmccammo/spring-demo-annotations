package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeConfigDemoApp {

	public static void main(String[] args) {
		//read config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PracticeConfig.class);
		
		//get bean from spring container
		Coach theCoach = context.getBean("quidditchCoach", Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
