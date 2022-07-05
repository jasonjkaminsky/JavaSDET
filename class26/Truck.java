package com.syntax.class26;

public class Truck extends Vehicle {
// The Truck class has field as weight and has its own implementation of calculateSalePrice()
// method in which returned price calculated as following: if weight>2000 then returned
// price car should include 10% discount,  otherwise 20% discount.

    double weight;

    Truck(double weight){
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            vehiclePrice = vehiclePrice * .90;
        } else vehiclePrice = vehiclePrice * .80;
return vehiclePrice;
    }
}
