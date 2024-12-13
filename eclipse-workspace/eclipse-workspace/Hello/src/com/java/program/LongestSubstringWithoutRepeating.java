package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String input = "abcabcbb";
		int maxLength = 0;
		int start = 0;
		Map<Character, Integer> charIndexMap = new HashMap<>();

		for (int end = 0; end < input.length(); end++) {
			char currentChar = input.charAt(end);

			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
				start = charIndexMap.get(currentChar) + 1;
			}

			charIndexMap.put(currentChar, end);
			int currentLength = end - start + 1;
			if (currentLength > maxLength) {
				maxLength = currentLength;
			}
		}

		System.out.println("Longest substring without repeating characters: " + maxLength);
	}
}
