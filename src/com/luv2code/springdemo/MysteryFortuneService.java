package com.luv2code.springdemo;

public class MysteryFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today, your fortune is unknown to all but Fate";
	}

}
