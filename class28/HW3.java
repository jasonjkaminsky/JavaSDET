package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW3 {
    // Create a Set of cities in which you want to make sure that insertion
// order is maintained. Then remove any city that starts with “A”;
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Athens");
        cities.add("Barcelona");
        cities.add("Dallas");
        cities.add("Istanbul");
        cities.add("Seattle");
        cities.add("Albany");
        cities.add("Rome");

        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

        System.out.println(cities);

    }
}
