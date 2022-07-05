package com.syntax.class26;

public abstract class Vehicle {
// Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
// which should be returning a price of the Vehicle.  Create 2 sub classes: Sedan and Truck. The Truck class
// has field as weight and has its own implementation of  calculateSalePrice() method in which returned
// price calculated as following: if weight>2000 then returned price car should include 10% discount,
// otherwise 20% discount.  The Sedan class has field as length and also does it is own implementation
// of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
// otherwise 10% discount

static double vehiclePrice = 26000;

public abstract double calculateSalePrice();

}
