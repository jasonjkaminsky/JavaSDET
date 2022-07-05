package com.syntax.class26;

public class ShapeTester {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("The area of the circle is: " + myCircle.calculateArea(5.0));
        System.out.println("The perimeter of the circle is: " + myCircle.calculatePerimeter(9.0));

        Square mySquare = new Square();
        System.out.println("The area of the square is : " + mySquare.calculateArea(13.0));
        System.out.println("The perimeter of the square is " + mySquare.calculatePerimeter(17.0));

        }

}
