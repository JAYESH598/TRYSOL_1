package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Character_Using_Mathfunction {

	
	public static void main(String[] args) {
        String input = "abcabcbb";
        
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);
            
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("Longest substring without repeating characters: " + maxLength);
    }

}
