package com.aminfo.noxml.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.aminfo.noxml.service.Coach;
import com.aminfo.noxml.service.FurtuneService;

public class CricketCoach implements Coach {

	private FurtuneService furtuneService;
	
	@Value("${foo.name}")
	private String coachName;

	@Value("${foo.age}")
	private Integer coachAge;
	
	public CricketCoach(FurtuneService furtuneService) {
		this.furtuneService = furtuneService;
	}
	
	@Override
	public String todaysTask() {
		return "complete 20-20 match 3times.";
	}

	@Override
	public String getFurtune() {
		return furtuneService.furtunerMsg();
	}

	public String getCoachName() {
		return coachName;
	}

	public Integer getCoachAge() {
		return coachAge;
	}
}
