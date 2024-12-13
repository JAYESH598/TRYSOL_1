package com.java.program;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 3, 1, 7 };
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
	}
}
