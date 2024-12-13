package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		
		String input = "JavaProgramm";
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		for (int i=0;i < input.length(); i++) {
		char ch = input.charAt(i);
		
			if (maps.containsKey(ch)) {
				maps.put(ch, maps.get(ch)+1);
			}else {
				
				maps.put(ch, 1);
			}
			
		}
		System.out.println("First Non repeted Character"+maps);
		for (Map.Entry<Character, Integer> entrySet : maps.entrySet()) {
			if(entrySet.getValue()==1) {
			System.out.println(entrySet.getKey());
			break;
		}

	}
	}
}
