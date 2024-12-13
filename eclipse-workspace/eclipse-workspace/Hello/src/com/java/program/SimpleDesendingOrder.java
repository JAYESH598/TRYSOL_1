package com.java.program;

public class SimpleDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 2, 8, 3, 1, 7 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		System.out.println("Sorted array in descending order:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}


