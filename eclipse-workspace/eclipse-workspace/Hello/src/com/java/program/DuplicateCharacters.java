package com.java.program;

import java.util.ArrayList;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String input = "programming";

		ArrayList<Character> uniqueChars = new ArrayList<>();
		ArrayList<Character> duplicateChars = new ArrayList<>();

		for (char c : input.toCharArray()) {
			if (uniqueChars.contains(c)) {
				if (!duplicateChars.contains(c)) {
					duplicateChars.add(c);
				}
			} else {
				uniqueChars.add(c);
			}
		}

		System.out.println("Duplicate characters: " + duplicateChars);
	}
}
