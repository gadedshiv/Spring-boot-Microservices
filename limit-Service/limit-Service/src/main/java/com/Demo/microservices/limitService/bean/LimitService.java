package com.Demo.microservices.limitService.bean;
public class LimitService {
	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	protected LimitService() {
		
	}
	public LimitService(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
}
