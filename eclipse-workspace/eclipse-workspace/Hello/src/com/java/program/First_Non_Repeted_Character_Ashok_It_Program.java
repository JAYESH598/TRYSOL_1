package com.java.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class First_Non_Repeted_Character_Ashok_It_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "IloveJavaProgram";
		Map<Character, Integer> Mpa = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Mpa.containsKey(ch)) {

				Mpa.put(ch, Mpa.get(ch) + 1);
			} else {
				Mpa.put(ch, 1);
			}
		}
		System.out.println("Occorance Of First Nonrepeted Character" + Mpa);

		for (Entry<Character, Integer> entryset : Mpa.entrySet()) {
			if (entryset.getValue() == 1) {
				System.out.println(entryset.getKey());
				break;
			}
		}
	}
}
