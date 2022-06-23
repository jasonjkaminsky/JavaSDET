package com.syntax.class18;

public class class18HW6 {

    private class18HW6(){
        System.out.println("This constructor is private");
    }

    public class18HW6(String x){
        System.out.println("This constructor is public, with String parameter: "+ x);
    }

    class18HW6(int x){
        System.out.println("This constructor is default, with int parameter: "+ x);
    }

    protected class18HW6(boolean x){
        System.out.println("This constructor is protected, with boolean parameter: "+ x);
    }

    public static void main (String[] args){
        class18HW6 obj1 = new class18HW6("Hello");
        class18HW6 obj2 = new class18HW6(13);
        class18HW6 obj3 = new class18HW6(true);
        class18HW6 obj4 = new class18HW6();

    }



}
