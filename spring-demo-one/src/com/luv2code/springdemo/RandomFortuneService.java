package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String[] fortunes = { "Today is your lucky day!", "Good things will happen!", "Best forever!" };
		
		int rnd = new Random().nextInt(fortunes.length);
		
		return fortunes[rnd];
	}

}
