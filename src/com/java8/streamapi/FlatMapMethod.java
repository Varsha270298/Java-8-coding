package com.java8.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapMethod {

	public static void main(String[] args) {
       String[] arrayOfWords = {"Eazy","Bytes"};
       Stream<String> streamOfWords=Arrays.stream(arrayOfWords);
       streamOfWords
       .map(word->word.split(""))
       .flatMap(Arrays::stream)
       .forEach(System.out::println);
       
       List<List<String>> list =Arrays.asList(Arrays.asList("Eazy"),Arrays.asList("Bytes"));
       System.out.println(list);
       list.stream().map(Collection::stream).forEach(System.out::println);
       list.stream().flatMap(Collection::stream).forEach(System.out::println);
       
	}

}
