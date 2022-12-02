package com.guney.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCouch: inside defult constructor");
	}	
	
	/*
	 * // define a setter method
	 * 
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println(">> TennisCouch: inside setFortuneService() method");
	 * fortuneService = theFortuneService; }
	 */

	/*
	 * // define a custom method
	 * 
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * System.out.println(">> TennisCouch: inside doSomeCrazyStuff() method");
	 * fortuneService = theFortuneService; }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	@Override
	public String getDailyWorkuot() {
		return "Practice your backhand volley >> getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
