package com.java.program;
import java.util.*;
//import java.util.LinkedHashSet;
//import java.util.Set;

public class Duplicate_Character_Program {

	public static void main(String[] args) {

		String str = "I LOVE TRYSOL GLOBAL SERVICE";
		
		StringBuilder sb =  new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
			for (Character character : set) {
				sb.append(character);
			}
		System.out.println(sb);//krushna.m@trysol.com
	}

}
