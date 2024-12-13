package com.java.program;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedChar {
	
	public static void main(String[] args) {
        String input = "swiss";	
		System.out.println("The first non-repeted Character is:"+firstNonRepetedCharacter(input));
	}
	public static Character firstNonRepetedCharacter(String str) {
		Map<Character, Integer> map =  new HashMap<>();
		
		for (char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for (char c : str.toCharArray()) {
			if (map.get(c)==1) {
				return c;
			}
		}
		
		return null;
	}
}
