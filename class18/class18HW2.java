package com.syntax.class18;

public class class18HW2 {

    public static  String revStr (String str){
        String newString = "";
        for (int i = str.length()-1; i >= 0; i--){
            newString += str.charAt(i);
        }
        return newString;
    }

    public static void main (String[] args){
        System.out.println(class18HW2.revStr("Hello World"));
    }

}
