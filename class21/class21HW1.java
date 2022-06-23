package com.syntax.class21;

public class class21HW1 {
//    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//            Rectangle, Square, Box
//            Use separate class to test your code
    int side1;
    int side2;
    int side3;

    public int calcArea (int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;

        int area = side1 * side2;
        return area;
    }

    public int calcVol(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        int volume = side1 * side2 * side3;
        return volume;
    }
}
