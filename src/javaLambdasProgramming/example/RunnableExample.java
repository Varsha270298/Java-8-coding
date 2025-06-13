package javaLambdasProgramming.example;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread =new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.print("Printed Inside Runnable");
				
			}
			
		
	});

		myThread.run();
		
		Thread myLambdaThread =new Thread(()->System.out.print("Printed Inside Lambda Runnable"));
		myLambdaThread.run();
	}
}
