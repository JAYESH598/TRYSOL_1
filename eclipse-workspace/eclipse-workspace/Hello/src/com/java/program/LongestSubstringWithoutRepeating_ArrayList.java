package com.java.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating_ArrayList {

	public static void main(String[] args) {
        String input = "abcabcbb";
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        ArrayList<Character> currentSubstring = new ArrayList<>();

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;

                // Adjust ArrayList to reflect new start
                currentSubstring.clear();
                for (int i = start; i <= end; i++) {
                    currentSubstring.add(input.charAt(i));
                }
            } else {
                currentSubstring.add(currentChar);
            }

            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, currentSubstring.size());
        }

        System.out.println("Longest substring without repeating characters: " + maxLength);
    }
}
