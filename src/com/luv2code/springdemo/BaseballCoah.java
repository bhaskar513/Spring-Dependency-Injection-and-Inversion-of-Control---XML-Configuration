package com.luv2code.springdemo;

public class BaseballCoah implements Coach {
	
	
	private FortuneService fortuneService;
	
	 public BaseballCoah(FortuneService theFortuneServices) {
		fortuneService=theFortuneServices;
		
	}
	
	
	@Override
	public  String getDailyWorkOut() {
		
		return "spent 30 min on batting practice";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
