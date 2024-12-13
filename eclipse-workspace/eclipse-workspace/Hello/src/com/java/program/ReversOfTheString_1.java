package com.java.program;

public class ReversOfTheString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "J A Y E S H";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
