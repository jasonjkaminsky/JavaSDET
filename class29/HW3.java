package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW3 {

//    Create a map of Best Buy store. Place item id and item name into it.
//    Example (7664847 = Printer, 7879885= TV etc )
//    Retrieve all keys and values from a Best Buy map using EntrySet.
public static void main(String[] args) {
    Map <Integer, String> bestBuy = new HashMap<>();

    bestBuy.put(8905438, "Printer");
    bestBuy.put(9474839, "Computer");
    bestBuy.put(7654543, "iPhone");
    bestBuy.put(9543535, "Tablet");


    Iterator<Map.Entry<Integer,String>> iter = bestBuy.entrySet().iterator();
    while(iter.hasNext()){
        Map.Entry<Integer,String> mentry = iter.next();
        System.out.println(mentry.getKey() + " = " + mentry.getValue());
    }

}




}
