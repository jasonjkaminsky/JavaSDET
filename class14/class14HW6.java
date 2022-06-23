package com.syntax.class14;

public class class14HW6 {

	public static void main(String[] args) {
// Write a method to return whether given number is prime or not?

		class14HW6 object = new class14HW6();
		object.isPrime(7);
	}

	void isPrime(int num) {
		int i, m = 0, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is a prime number");
			}
		}

		System.out.println(m);
		
	}

}
