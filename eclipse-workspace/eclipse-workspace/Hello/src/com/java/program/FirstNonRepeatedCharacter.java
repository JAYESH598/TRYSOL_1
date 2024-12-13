package com.java.program;
import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        char nonRepeatedChar = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatedChar = entry.getKey();
                break;
            }
        }

        if (nonRepeatedChar != 0) {
            System.out.println("First non-repeated character: " + nonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}