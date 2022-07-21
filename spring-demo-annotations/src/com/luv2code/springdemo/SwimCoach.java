package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	

	public SwimCoach() {
		System.out.println(">> SwimCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swin 10 km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
