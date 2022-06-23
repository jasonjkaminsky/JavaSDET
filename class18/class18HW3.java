package com.syntax.class18;

public class class18HW3 {

    private static String onlyVow (String str){
        return str.replaceAll("[^aeiou]", "");
    }

    public static void main (String[] args){
        String myStr = "I love Syntax Technologies!";
        System.out.println(onlyVow(myStr));
    }


}
