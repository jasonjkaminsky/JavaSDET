package com.syntax.class26;

public class Square implements Shape {
    @Override
    public void calculateArea(){

    }

    public double calculateArea(double length){
        return length * length;
    }

    @Override
    public void calculatePerimeter() {

    }

    public double calculatePerimeter(double length){
        return length * 4;
    }

}
