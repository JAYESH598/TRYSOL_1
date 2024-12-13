package com.java.program;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 3, 1, 7, 2, 3, 8 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("Duplicate: " + numbers[i]);
					break;
				}
			}
		}
	}
}
