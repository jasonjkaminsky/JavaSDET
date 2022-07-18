package com.syntax.class28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW2 {
    // Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Mozambique");
        countries.add("Zimbabwe");
        countries.add("Madagascar");
        countries.add("Cameroon");
        countries.add("Zambia");
        countries.add("Nigeria");

        for (String country : countries){
            System.out.println(country);
        }

        Iterator<String> iterator= countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
