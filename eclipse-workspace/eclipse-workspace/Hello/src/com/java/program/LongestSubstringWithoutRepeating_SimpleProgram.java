package com.java.program;

public class LongestSubstringWithoutRepeating_SimpleProgram {
	public static void main(String[] args) {
        String input = "abcabcbb";
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        // Initialize all character indices to -1
        for (int i = 0; i < 256; i++) {
            charIndex[i] = -1;
        }

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1;
            }
            charIndex[currentChar] = end;
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Longest substring without repeating characters: " + maxLength);
    }

}
