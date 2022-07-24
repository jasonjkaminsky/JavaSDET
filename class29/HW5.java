package com.syntax.class29;

// Create a Map that will store Employee name and salary. Write a logic to retrieve an employee
// who gets the highest salary. Output should be in the format:   John Smith=$100000

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW5 {
    public static void main(String[] args) {
        Map<String, Integer> emMap = new HashMap<>();
        emMap.put("Dan", 47000);
        emMap.put("Anna", 99000);
        emMap.put("Jake", 66000);

        Iterator<Map.Entry<String, Integer>> iter = emMap.entrySet().iterator();

        int maxVal = 0;
        String result = "";

        while (iter.hasNext()) {
            Map.Entry<String, Integer> mentry = iter.next();
            if (mentry.getValue() > maxVal) {
                maxVal = mentry.getValue();
                result = mentry.getKey();
            }
        }

        System.out.println(result + " earns the highest salary at " + maxVal);

    }

}
