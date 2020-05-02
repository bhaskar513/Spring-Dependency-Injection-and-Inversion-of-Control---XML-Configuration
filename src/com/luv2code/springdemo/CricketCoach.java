package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	public CricketCoach()
	{
		System.out.println("CricketCoach :: no arg constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("setEmailAddress :: inside setter method");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("setTeam :: inside setter method");
		this.team = team;
	}


	// our setter metohd 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService :: inside setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice fast bowling 15 Min";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
