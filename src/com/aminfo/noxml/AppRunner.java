package com.aminfo.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aminfo.noxml.service.Coach;
import com.aminfo.noxml.service.impl.CricketCoach;

public class AppRunner {

	public static void main(String[] args) {
		// 1. Creating spring container without Xml using pure java configuration using annotations
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		// 2. Retrieving bean from container
		Coach coach = ctx.getBean("getCoachService", Coach.class);

		CricketCoach coachProperties = ctx.getBean("getCoachService", CricketCoach.class);
		// 3. method call
		System.out.println("message from Coach: " + coach.todaysTask());

		// 4. fetched from properties file
		System.out.println("Coach Name: " + coachProperties.getCoachName());
		System.out.println("Coach Age: " + coachProperties.getCoachAge());

		System.out.println("message from Furtune: " + coach.getFurtune());
	}
}
