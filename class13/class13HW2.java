package com.syntax.class13;

public class class13HW2 {

	public static void main(String[] args) {
	
		
		String word1 = "racecar";
		String reversedWord1 = "";
		for(int i = word1.length() -1; i >= 0; i--) {
			reversedWord1 = reversedWord1 + word1.charAt(i);
		}
		
		if (word1.equals(reversedWord1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
