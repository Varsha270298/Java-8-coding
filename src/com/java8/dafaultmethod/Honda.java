package com.java8.dafaultmethod;

public class Honda implements vehicle {
	
	@Override
	public int getSpeed() {
		return 100;
	}

	@Override
	public void applyBreak() {
		System.out.println("Breaks applied");
		
	}
	@Override
	public void autoPilot() {
		System.out.println("autopilot feature");
		
	}

	public static void main(String[] args) {
		Honda honda =new Honda();
		honda.getSpeed();
		honda.applyBreak();
		honda.sayHello();
		honda.autoPilot();
		

	}

	private static void sayHello() {
  System.out.println("Hi,THis is your faurite car");		
	}


}
