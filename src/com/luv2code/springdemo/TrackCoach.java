package com.luv2code.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;


public TrackCoach(FortuneService theFortuneServices) {
	fortuneService=theFortuneServices;
	
}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "run a 5k";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return "just do it" + fortuneService.getFortune();
	}

}
