package com.microservices.limits.service.bean;

public class Limits {
	private int minimum;
	private int maximum;
	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

	

}
