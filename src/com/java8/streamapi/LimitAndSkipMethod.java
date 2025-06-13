package com.java8.streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class LimitAndSkipMethod {

	public static void main(String[] args) {
		//limitInStream();
		//skipInStream();
		reduceInStreams();
		 MaxInStreams();

	}
          public static void limitInStream() {
	     Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
}
       public static void skipInStream() {
        Stream.iterate(1, n->n+1).skip(10).limit(20).forEach(System.out::println);	
}
       
       
       public static void reduceInStreams() {
    	   System.out.println(Stream.iterate(1,n->n+1).limit(20).reduce(0,(a,b)->a+b));
       }
       
       public static void MaxInStreams() {
    	   System.out.println(Stream.iterate(1,n->n+1).limit(20).max((a,b)->a+b));
       }
}
