package com.syntax.class14;

public class class14HW2 {

	public static void main(String[] args) {
		// Create a method that will take a number
		// and prints whether the number is even or odd.

		class14HW2 object = new class14HW2();
		object.oddEven(66);

	}

	void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

}
