package com.guney.springdemo;

public class BaseballCouch implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCouch(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
