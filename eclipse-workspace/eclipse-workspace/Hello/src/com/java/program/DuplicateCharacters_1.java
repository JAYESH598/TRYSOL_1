package com.java.program;

public class DuplicateCharacters_1 {
	public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        System.out.println("Duplicate Characters:");
        for (int i = 0; i < 256; i++) {
        	{
                if (charCount[i] > 1) {
                    System.out.print((char) i + " = " + charCount[i] +" times ");
                }
        }
    }
}
}