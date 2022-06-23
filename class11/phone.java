package com.syntax.class11;

public class phone {
	
		String brand;
		String model;
		int version;
		int year;
		double price;
		String color;
		
		void turnOn() {
			System.out.println("phone turning on");
		}
		
		void makeCall() {
			System.out.println("phone making call");
		}
		
		void restart() {
			System.out.println("phone resetting");
		}
		
		void shutDown(){
			System.out.println("phone shutting down");
		}
		
		public static void main (String[] args) {
			phone iPhone = new phone();
			iPhone.brand= "Apple";
			iPhone.model = "iPhone";
			iPhone.version = 10;
			iPhone.year = 2022;
			iPhone.price = 619.99;
			iPhone.color = "red";
			iPhone.turnOn();
			iPhone.makeCall();
			iPhone.restart();
			iPhone.shutDown();
			
			phone Pixel = new phone();
			Pixel.brand= "Google";
			Pixel.model = "Pixel";
			Pixel.version = 6;
			Pixel.year = 2021;
			Pixel.price = 539.99;
			Pixel.color = "grey";
			Pixel.turnOn();
			Pixel.makeCall();
			Pixel.restart();
			Pixel.shutDown();
			
			phone Samsung = new phone();
			Samsung.brand= "Samsung";
			Samsung.model = "Galaxy";
			Samsung.version = 3;
			Samsung.year = 2010;
			Samsung.price = 89.99;
			Samsung.color = "black";
			Samsung.turnOn();
			Samsung.makeCall();
			Samsung.restart();
			Samsung.shutDown();
			
		}
		
	}
