package com.java.program;

public class LeftAlignedStarPattern {
	 public static void main(String[] args) {
	        int rows = 5; // Number of rows for the pattern
	        
	        for (int i = 1; i <= rows; i++) {
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
}
