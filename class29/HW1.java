package com.syntax.class29;

import java.util.Map;
import java.util.TreeMap;

public class HW1 {

    // Create a map of a building. Store floor number and its associated company name.
    // (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map

    public static void main(String[] args) {

        Map<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Samsung");
        building.put(1, "Target");
        building.put(4, "Facebook");
        building.put(3, "Google");
        building.put(2, "Tesla");
        building.put(7, "Facebook");

        System.out.println(building);
        System.out.println(building.size());

        building.put(4, "IBM");
        building.replace(3, "Walmart");
        building.remove(7);

        System.out.println(building);

    }
}
