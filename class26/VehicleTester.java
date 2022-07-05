package com.syntax.class26;

public class VehicleTester {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(18);
        System.out.println(sedan1.calculateSalePrice());

        Truck truck1 = new Truck(21000);
        System.out.println(truck1.calculateSalePrice());

    }
}
