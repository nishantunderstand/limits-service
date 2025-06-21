package com.microservices.limits.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limits.service.LimitsServiceApplication;
import com.microservices.limits.service.bean.Limits;
import com.microservices.limits.service.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	/** 1. Manual Approach
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(1, 1000);
	}
	*/
	
	// 2. Automatic Fetch From Properties File
	@GetMapping("/limits")
	public Limits retriveLimits() {
		System.out.println("==== Fetching From Application.properties =============");
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
