package com.syntax.class26;

public class Sedan extends Vehicle {

    //  The Sedan class has field as length and also does its own implementation
    //  of calculateSalePrice(): if length of sedan is >20 feet then returned
    //  car price should include 5% discount,
    //  otherwise 10% discount

    double length;

    Sedan(double length){
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            vehiclePrice = vehiclePrice * .95;
        } else vehiclePrice = vehiclePrice * .90;
        return vehiclePrice;
    }
}
