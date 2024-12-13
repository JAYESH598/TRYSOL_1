package com.java.program;

import java.util.ArrayList;

public class LargestAndSmallest_With_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(3);
		numbers.add(1);
		numbers.add(7);

		int largest = numbers.get(0);
		int smallest = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}
			if (numbers.get(i) < smallest) {
				smallest = numbers.get(i);
			}
		}

		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
	}
}
