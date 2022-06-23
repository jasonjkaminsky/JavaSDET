package com.syntax.class18;

public class class18HW1 {

    int sumArray (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main (String [] args){

        int [] myArr = {8, 6, 4, 2, 9};

        class18HW1 md = new class18HW1();
        System.out.println(md.sumArray(myArr));
    }
}
