package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW7 {

    // Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(13);
        ints.add(21);
        ints.add(8);
        ints.add(21);


        //  Using regular for loop  //
//        int sum = 0;
//        for (int i= 0; i < ints.size(); i++){
//            sum += ints.get(i);
//        }

//        int sum = 0;
//        System.out.println(sum);

        // Using Iterator //
        int sum = 0;
        Iterator<Integer> iter = ints.iterator();
        while(iter.hasNext()){
            sum += iter.next();
        }
        System.out.println(sum);

    }
}
