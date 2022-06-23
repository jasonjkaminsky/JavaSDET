package com.syntax.class13;

import java.util.Scanner;

public class class14Palindrome {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();

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
