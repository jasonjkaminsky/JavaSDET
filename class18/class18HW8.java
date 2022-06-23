package com.syntax.class18;

public class class18HW8 {

   // Write a Student class that have instance variables name and address. Create a constructor that
   //  will initialize those variables. Print name & address of given student using displayInfo method.

    private String name;
    private String address;

    public class18HW8(){
    name = "Samuel";
    address = "Miami";
    }

    public void displayInfo(){
        System.out.println("The student's name is " + name + " and his/her address is: " + address);
    }

    public static void main(String[] args) {
        class18HW8 stu = new class18HW8();
        stu.displayInfo();
    }
}