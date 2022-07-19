package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	
	public BadmintonCoach() {
		System.out.println(">> BadmintonCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice smash for 30 minutes";
	}

}
