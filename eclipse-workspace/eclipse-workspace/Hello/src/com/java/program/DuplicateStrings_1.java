package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings_1 {

	public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};

        findDuplicates(words);
    }

    public static void findDuplicates(String[] words) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    

    System.out.println("Duplicate Strings:");
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}

	
}
