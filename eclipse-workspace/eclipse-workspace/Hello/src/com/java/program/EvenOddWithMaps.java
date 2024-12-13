package com.java.program;

import java.util.ArrayList;
import java.util.HashMap;

public class EvenOddWithMaps {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        HashMap<String, ArrayList<Integer>> evenOddMap = new HashMap<>();
     // Initialize the map with keys "Even" and "Odd"
        evenOddMap.put("Even", new ArrayList<>());
        evenOddMap.put("Odd", new ArrayList<>());

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenOddMap.get("Even").add(num);
            } else {
                evenOddMap.get("Odd").add(num);
            }
        }
	 
    System.out.println("Even numbers: " + evenOddMap.get("Even"));
    System.out.println("Odd numbers: " + evenOddMap.get("Odd"));

}
}

