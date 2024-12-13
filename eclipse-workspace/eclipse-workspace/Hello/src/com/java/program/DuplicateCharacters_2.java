package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters_2 {
	
	public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
        	 charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate Characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey()  +  "  =  " +  entry.getValue() + " times ");
            }
        
        }
     
    }

}


