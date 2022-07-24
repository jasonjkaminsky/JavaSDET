package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW6 {

    // Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.

    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();

        words.add("I");
        words.add("love");
        words.add("Java");
        words.add("coding");

        Iterator<String> iter = words.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }

}
