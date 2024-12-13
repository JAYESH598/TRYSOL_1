package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters_Maps {

	public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        
          /*char[] chars = input.toCharArray();
             for (char c : chars){*/
        
       for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find and print duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
