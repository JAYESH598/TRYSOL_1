package com.java.program;

public class ReplaceCharacterWithString_Normal_Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello world";
        char charToReplace = 'l';
        String replacement = "LL";

        String result = replaceCharacterWithString(input, charToReplace, replacement);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }

    public static String replaceCharacterWithString(String input, char charToReplace, String replacement) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (c == charToReplace) {
                result.append(replacement);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }


}
