package com.Demo.microservices.limitService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "limitservice")
public class Configuartion {
	protected Configuartion() {
		
	}
	public Configuartion(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

}
