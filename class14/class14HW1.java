package com.syntax.class14;

public class class14HW1 {

	public static void main(String[] args) {

		// Create a method that will take 2 parameters as a numbers
		// and prints which number is larger.

		class14HW1 object = new class14HW1();
		object.largerNum(18, 29);
	}

	void largerNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);
		}
	}
}

