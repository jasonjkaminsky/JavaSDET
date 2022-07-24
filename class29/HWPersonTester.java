package com.syntax.class29;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HWPersonTester {

    //  Create a Person class with following private fields: name, lastName, age, salary.
    //  Variables should be initialized through constructor.
    //  Inside the class also create a method to print user details.
    //  In Test Class create a Map that will store key in ascending order. In that map store
    //  personId and a Person Object. Print each object details.

    public static void main(String[] args) {
        Map<Integer, HWPerson> people = new TreeMap<>();

        HWPerson person1 = new HWPerson("Steve", "McNally", 45, 110000);
        HWPerson person2 = new HWPerson("Abdul", "Rauf", 35, 68000);
        HWPerson person3 = new HWPerson("Lindsay", "Becker", 27, 31000);
        HWPerson person4 = new HWPerson("Maria", "Smith", 56, 90000);

        people.put(543254, person4);
        people.put(653265, person2);
        people.put(433265, person1);
        people.put(265544, person3);

        Set<Map.Entry<Integer, HWPerson>> peopleSet = people.entrySet();

        Iterator<Map.Entry<Integer, HWPerson>> iter = peopleSet.iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, HWPerson> mentry = iter.next();
            System.out.print("ID: " + mentry.getKey() + " ");
            mentry.getValue().print();
        }
    }
}
