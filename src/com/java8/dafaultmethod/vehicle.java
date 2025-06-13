package com.java8.dafaultmethod;

public interface vehicle {
	
	public int getSpeed();
	public void applyBreak();
	public default void autoPilot() {
		System.out.println("I will help to driving car");
	}
	

}
