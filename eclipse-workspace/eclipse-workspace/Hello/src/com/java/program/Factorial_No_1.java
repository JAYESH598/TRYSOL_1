package com.java.program;

import java.util.Scanner;

public class Factorial_No_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number value");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++) {

			fact = fact * i;

		}
		System.out.println("factorial of a " + no + " is:" + fact);

	}

}
