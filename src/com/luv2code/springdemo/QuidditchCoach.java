package com.luv2code.springdemo;

public class QuidditchCoach implements Coach {

	private FortuneService fortuneService;
	
	public QuidditchCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your dives";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
