package com.java.program;

import java.util.Iterator;

public class Factorial_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1,no=5;
		
		for (int i = 1; i <=no; i++) {
			
			fact = fact*i;
			
		}
		System.out.println("factorial of a "+no+" is:"+ fact);
   }
}
