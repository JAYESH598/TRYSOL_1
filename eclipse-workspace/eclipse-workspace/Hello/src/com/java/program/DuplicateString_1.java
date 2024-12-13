package com.java.program;

public class DuplicateString_1 {

	
	public class DuplicateStrings {
	    public static void main(String[] args) {
	        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};

	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    System.out.println("Duplicate: " + words[i]);
	                    break; // Exit the inner loop once a duplicate is found
	                }
	            }
	        }
	    }
	}
}
	
