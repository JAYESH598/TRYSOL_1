package com.java.program;

import java.util.ArrayList;

public class Replace_Character_With_Its_Occorances_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
	        String input = "hello world";
	        char charToReplace = 'l';
	        String replacement = "LL";

	        String result = replaceCharacterWithString(input, charToReplace, replacement);
	        System.out.println("Original String: " + input);
	        System.out.println("Modified String: " + result);
	    }

	    public static String replaceCharacterWithString(String input, char charToReplace, String replacement) {
	        ArrayList<Character> characters = new ArrayList<>();
	        
	        for (char c : input.toCharArray()) {
	            if (c == charToReplace) {
	                for (char repChar : replacement.toCharArray()) {
	                    characters.add(repChar);
	                }
	            } else {
	                characters.add(c);
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        for (char c : characters) {
	            result.append(c);
	        }

	        return result.toString();
	}

}
