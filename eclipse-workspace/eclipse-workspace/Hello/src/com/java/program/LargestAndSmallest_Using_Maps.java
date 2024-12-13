package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class LargestAndSmallest_Using_Maps {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 3, 1, 7 };

		Map<String, Integer> result = findLargestAndSmallest(numbers);

		System.out.println("Largest number: " + result.get("largest"));
		System.out.println("Smallest number: " + result.get("smallest"));
	}

	public static Map<String, Integer> findLargestAndSmallest(int[] arr) {
		Map<String, Integer> map = new HashMap<>();
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		map.put("largest", largest);
		map.put("smallest", smallest);

		return map;
	}
}
