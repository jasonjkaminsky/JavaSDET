package com.syntax.class18;

public class laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;
    public laptop() {

        System.out.println("Basic construction is happening...");
    }
    public laptop(String make) {
        this.make = make;

    }
    public laptop(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;

    }
    public laptop(String make, String model, String storage, String memory) {
      /*  this.make = make;
        this.model = model;
        this.storage = storage;*/
        this(make, model, storage);
        this.memory = memory;
    }

    public laptop(String make, String model, String storage, String memory, double screenSize) {
      /*  this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make, model, storage, memory);
        this.screenSize = screenSize;
    }

    public static void main(String[] args) {
        laptop apple=new laptop("Apple","M1Pro 14","512","16",14.2);
    }
}
