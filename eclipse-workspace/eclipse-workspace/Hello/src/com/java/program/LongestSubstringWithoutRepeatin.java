package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input  = "abcabcbb";
		System.out.println("Entred longestsubString:"+input);
		System.out.println("The length of the longest substring without repeating characters is:" + longestSubstring(input));

	}
	
	public static  int longestSubstring(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int maxLength =0;
		int start =0;
		
		for (int end = 0; end < str.length(); end++) {
			
			char currentChar = str.charAt(end);
			
			if (map.containsKey(currentChar)) {
				
				start = Math.max(start, map.get(currentChar)+1);
			}
			map.put(currentChar,end);
			maxLength = Math.max(maxLength, end-start+1);
		}
		return maxLength;
	}
	
}
