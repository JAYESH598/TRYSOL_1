package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class Replace_Character_With_Its_Occorance_Using_Maps_1 {
	 public static void main(String[] args) {
	        String input = "hello world";
	        char charToReplace = 'l';
	        String replacement = "LL";
	        
	        String result = replaceCharacterWithString(input, charToReplace, replacement);
	        System.out.println("Original String: " + input);
	        System.out.println("Modified String: " + result);
	    }

	    public static String replaceCharacterWithString(String input, char charToReplace, String replacement) {
	        Map<Character, String> replacementMap = new HashMap<>();
	        replacementMap.put(charToReplace, replacement);

	        StringBuilder result = new StringBuilder();
	        
	        for (char c : input.toCharArray()) {
	            if (replacementMap.containsKey(c)) {
	                result.append(replacementMap.get(c));
	            } else {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }
}
