package com.Demo.microservices.limitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.microservices.limitService.bean.LimitService;

@RestController
public class LimitServiceController {
	@Autowired
	Configuartion config;
	@GetMapping("/limits")
	public LimitService retriveLimits() {
		return new LimitService(config.getMin(),config.getMax());
	}

}
