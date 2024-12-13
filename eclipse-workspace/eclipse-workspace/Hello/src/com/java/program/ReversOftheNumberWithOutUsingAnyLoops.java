package com.java.program;

public class ReversOftheNumberWithOutUsingAnyLoops {
	
	public static void main(String[] args) {
		
    int number = 12345;
    System.out.println("Original Number :"+ number);
    System.out.println("Revers Number:"+reverse(number));
	}
 public static int reverse(int number) {
		
		
		int reversed  = 0;
		int reminder = number % 10;
		reversed = reminder;
		number = number/10;
		
	if (number > 0) {
		reversed = reversed *10+ reverse(number);
		
	}
	return reversed;
	
	}
}

