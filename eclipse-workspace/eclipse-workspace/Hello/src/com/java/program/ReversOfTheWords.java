package com.java.program;

public class ReversOfTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String str ="Program";
		 String[] words =str.split(" ");
		 String reverseString = " ";
		 
		 for (int i = 0; i < words.length; i++) {
			
			  String word = words [i];
			  String ReverseWord = " ";
			  
			  for (int j=word.length()-1;j>=0;j--) {
				
				  ReverseWord = ReverseWord+word.charAt(j);
			}
			  
			  reverseString = reverseString+ReverseWord+ " ";
		}
		 System.out.println("Revers Of the String:"+reverseString);
	}

}
