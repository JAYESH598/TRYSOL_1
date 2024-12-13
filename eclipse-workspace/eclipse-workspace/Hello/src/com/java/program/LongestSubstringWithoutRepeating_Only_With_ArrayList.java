package com.java.program;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeating_Only_With_ArrayList {
	public static void main(String[] args) {
        String input = "abcabcbb";
        ArrayList<Character> currentSubstring = new ArrayList<>();
        int maxLength = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            if (currentSubstring.contains(currentChar)) {
                int index = currentSubstring.indexOf(currentChar);
                // Remove characters from start to the duplicate character's position
                for (int i = 0; i <= index; i++) {
                    currentSubstring.remove(0);
                }
            }

            currentSubstring.add(currentChar);

            if (currentSubstring.size() > maxLength) {
                maxLength = currentSubstring.size();
            }
        }

        System.out.println("Longest substring without repeating characters: " + maxLength);
    }

}
