package com.java.program;

import java.util.Scanner;

public class MultiplicationTable_Scacnnar_Class {
	
 public static void main(String[] args) {
	 
	 //int no=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a n value");
	  int no = sc.nextInt();
		for (int i = 1; i <=20; i++) {
			
			System.out.println(no+"*"+i+"="+no*i);
			
		}
	
}
}
