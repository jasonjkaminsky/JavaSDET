package com.syntax.class21;

public class class21HW3 {
//    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method
//    with specific arguments and observe result.

    static void multiply(double num1, double num2){
        System.out.println(num1 * num2);
    }

    static void multiply(double num1, int num2){
        System.out.println(num1 * num2);
    }

    static void multiply(int num1, double num2){
        System.out.println(num1 * num2);
    }

    static void multiply(int num1, int num2, double num3){
        System.out.println(num1 * num2 * num3);
    }

    static void multiply(double num1, double num2, int num3){
        System.out.println(num1 * num2 * num3);
    }

    public static void main(String[] args) {
        multiply(5, 4, 2.5);
        multiply(6, 3.5);
        multiply(5.5, 6);
        multiply(1.5, 6.5, 10);
        multiply(2.5, 2.5);
    }
}
