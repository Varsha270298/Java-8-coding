package javaLambdasProgramming.example;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda (s -> s.length());
		//System.out.print(myLambda.getLength("Hello Lambda"));
		

	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
	}
	
	
 interface StringLengthLambda {
	 int getLength(String s);
 }
}
