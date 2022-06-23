package com.syntax.class21;

public class class21HW1Tester extends class21HW1 {

    public static void main (String[] args){
        class21HW1Tester rectangle = new class21HW1Tester();
        System.out.println(rectangle.calcArea(16, 20));

        class21HW1Tester square = new class21HW1Tester();
        System.out.println(square.calcArea(18, 18));

        class21HW1Tester box = new class21HW1Tester();
        System.out.println(box.calcVol(18, 18, 18));
    }
}


