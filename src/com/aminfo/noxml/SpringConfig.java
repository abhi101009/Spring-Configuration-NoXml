package com.aminfo.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.aminfo.noxml.service.Coach;
import com.aminfo.noxml.service.FurtuneService;
import com.aminfo.noxml.service.impl.CricketCoach;
import com.aminfo.noxml.service.impl.HappyFurtuneServiceImpl;

@Configuration
@Component("com.aminfo.noxml")
@PropertySource("classpath:coach.properties")
public class SpringConfig {

	@Bean
	public FurtuneService getFurtuneService() {
		return new HappyFurtuneServiceImpl();
	}
	
	@Bean
	public Coach getCoachService() {
		return new CricketCoach(getFurtuneService());
	}
}
