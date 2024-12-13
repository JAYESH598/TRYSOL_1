package com.java.program;

import java.util.ArrayList;

public class DuplicateNumbers_Using_ArrayList {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer num : numbers) {
            if (uniqueNumbers.contains(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            } else {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("Duplicate numbers: " + duplicates);
	}
	
}
