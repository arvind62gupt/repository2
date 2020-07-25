package com.sampleTest;

import java.util.stream.IntStream;
public class FizzBuzzJava8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzzinJava8(50);
		
	}
	
	private static void fizzBuzzinJava8( int n) {
		
		IntStream.rangeClosed(1,n)
		.mapToObj(i-> i%3==0 ? (i%5==0 ? "FizzBuzz" : "fizz") :(i%5==0 ? "Buzz": i))
		.forEach(System.out::println);
	}

}
