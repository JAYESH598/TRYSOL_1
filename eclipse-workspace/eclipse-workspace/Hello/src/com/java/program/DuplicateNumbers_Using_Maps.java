
package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers_Using_Maps {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 3, 1, 7, 2, 3, 8 };

		Map<Integer, Integer> numberCountMap = new HashMap<>();

		// Count occurrences of each number
		for (int num : numbers) {
			numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
		}

		// Print duplicate numbers
		System.out.println("Duplicate numbers:");
		for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
			}
		}
	}
}
