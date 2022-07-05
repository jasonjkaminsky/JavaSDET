package com.syntax.class26;

public class MarksTester {
    public static void main(String[] args) {
        A studentA = new A(96, 87, 93);
        System.out.println("Student A's average marks from three classes are: " + studentA.getAverage());

        B studentB = new B(91, 79, 93, 84);
        System.out.println("Student B's average marks from four classes are: " + studentB.getAverage());
    }


}
