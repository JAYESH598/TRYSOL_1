package com.java.program;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStrings_2 {

	
	public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};

        findDuplicates(words);
    }

    public static void findDuplicates(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicates.add(word);
            }
        }
    

    System.out.println("Duplicate Strings: " + duplicates);

   }
 }

