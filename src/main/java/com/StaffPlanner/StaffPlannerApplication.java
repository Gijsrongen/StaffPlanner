package com.StaffPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaffPlannerApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");

		SpringApplication.run(StaffPlannerApplication.class, args);
	}

}
