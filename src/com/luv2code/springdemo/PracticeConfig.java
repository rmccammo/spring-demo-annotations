package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

	
	//define bean for mystery fortune service
	@Bean
	public FortuneService mysteryFortuneService() {
		return new MysteryFortuneService();
	}
	
	//define bean for quidditch coach and inject dependency
	@Bean
	public Coach quidditchCoach() {
		return new QuidditchCoach(mysteryFortuneService());
	}
}
