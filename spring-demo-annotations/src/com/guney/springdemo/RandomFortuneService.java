package com.guney.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "1 - Beware of the wolf in sheep's clothing", "2 - Diligence is the mother of good luck",
			"3 - The journey is the reward" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
