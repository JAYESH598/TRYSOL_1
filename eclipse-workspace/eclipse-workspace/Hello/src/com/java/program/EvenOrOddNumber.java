package com.java.program;

import java.util.ArrayList;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<Integer> numbers = new ArrayList<>();
	        // Add numbers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        for (int num : numbers) 
	        {
	            if (num % 2 == 0) {
	                System.out.println(num + " is even");
	            } else {
	                System.out.println(num + " is odd");
	           }
	        }        
	}
}
