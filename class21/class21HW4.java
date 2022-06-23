package com.syntax.class21;

public class class21HW4 {
//    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
//    with specific arguments and observe result.

    private void method(){
        System.out.println("1");
    }
    void method(String name){
        System.out.println("2");
    }
    void method(boolean isOkay, int num){
        System.out.println("3");
    }
    void method(String str, double num, String name){
        System.out.println("4");
    }

    public static void main(String[] args) {
        class21HW4 obj1 = new class21HW4();
        class21HW4 obj2 = new class21HW4("Hello"); // Java complains bc a method is private
        class21HW4 obj3 = new class21HW4(true, 55);
        class21HW4 obj4 = new class21HW4("Bye", 3.33, "See Ya");
    }



}
