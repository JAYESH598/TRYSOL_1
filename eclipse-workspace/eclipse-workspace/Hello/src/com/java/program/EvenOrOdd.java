package com.java.program;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n");
		n=sc.nextInt();
		
		if(n%2==0) {
			
			System.out.println(n + " It Is an Even number");
			
		}else {
			System.out.println(n + " It Is an Odd number");
		}
	}

}
