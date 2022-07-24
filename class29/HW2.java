package com.syntax.class29;

import java.util.*;

public class HW2 {

    // Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.

    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Ecuador", "Quito");
        countries.put("Peru", "Lima");
        countries.put("Canada", "Ottawa");
        countries.put("England", "London");
        countries.put("Egypt", "Cairo");

        // creating an entrySet for all the entries
        Set entrySet = countries.entrySet();

        // creating iterator for the entrySet
        Iterator iter = entrySet.iterator();

        // Iterate through HashMap entries(Key-Value pairs)

        while(iter.hasNext()){
            Map.Entry mentry = (Map.Entry)iter.next();
            System.out.println("Country is " + mentry.getKey() + " and the capital is " + mentry.getValue());
        }

        // *** Using FOR EACH ( Enhanced) Loop *** //
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Country is " + entry.getKey() + " and the capital is " + entry.getValue());
        }

        Collection <String> capitals = countries.values();
        for(String country: capitals){
            System.out.println(country);
        }

    }
}
