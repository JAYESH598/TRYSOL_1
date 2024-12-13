package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class OccoranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "JavaProgramm";
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		char[] ch = input.toCharArray();
		for (char c : ch) {
			if (!maps.containsKey(c)) {
				maps.put(c, 1);
			}else {
				int value = maps.get(c);
				maps.put(c, value+1);
			}
			
		}
		System.out.print("Number of Occorances Of Character are these "+maps);
	}

}
