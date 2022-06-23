package com.syntax.class14;

public class class14HW3 {

	public static void main(String[] args) {
		// Create a method that will print
		// whether given String is palindrome or not.

		class14HW3 object = new class14HW3();
		object.palindrome("Never odd or even");

	}

	void palindrome(String givenString) {

		String reverseStr = "";
		String noSpaceLowercase = givenString.replaceAll(" ", "").toLowerCase();

		System.out.println(noSpaceLowercase);

		int strLength = noSpaceLowercase.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + noSpaceLowercase.charAt(i);
		}

		System.out.println(reverseStr);

		if (noSpaceLowercase.equals(reverseStr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
