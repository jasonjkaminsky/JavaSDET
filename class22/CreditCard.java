package com.syntax.class22;

public class CreditCard {

    int balance = 12777;
    double interest;

    void calcInterest() {
        if (balance > 20000) {
            interest = 19;
        } else if (balance > 10000 && balance < 19999) {
            interest = 17;
        } else interest = 15;
        System.out.println(interest);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
    @Override
    void calcInterest() {
        if (balance > 20000) {
            interest = 22;
        } else if (balance > 10000 && balance < 19999) {
            interest = 19;
        } else interest = 16;
        System.out.println(interest);
    }

    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        obj1.calcInterest();
        Visa obj2 = new Visa();
        obj2.calcInterest();
        AX obj3 = new AX();
        obj3.calcInterest();
    }
}
