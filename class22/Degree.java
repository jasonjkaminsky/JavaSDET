package com.syntax.class22;

public class Degree {

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

    class Bachelors extends Degree{}

    class Masters extends Degree{
        @Override
        void getPrerequisite() {};

    public static void main(String[] args) {
        Degree obj1 = new Degree();
        obj1.getPrerequisite();
        Bachelors obj2 = new Bachelors();
        obj2.getPrerequisite();
        Degree obj3 = new Masters();
        obj3.getPrerequisite();
    }
}
