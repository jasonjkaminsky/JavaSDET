package com.syntax.class11;

public class dog {

	String name;
	int age;
	double height;
	int weight;
	String color;
	String favFood;
	String temperament;
	
	void bark() {
		System.out.println("dog barking");
	}
	
	void sit() {
		System.out.println("dog sitting down");
	}
	
	void rollOver() {
		System.out.println("dog rolling over");
	}
	
	void playDead(){
		System.out.println("dog playing dead");
	}
	
	void fetch() {
		System.out.println("dog fetching an object");
	}
	
	void eat() {
		System.out.println("dog eating its favorite food");
	}
	
	public static void main (String[] args) {
		dog husky = new dog();
		
		husky.name = "Big Dog";
		husky.age = 13;
		husky.height = .95;
		husky.weight = 33;
		husky.color = "white";
		husky.favFood = "bones";
		husky.temperament = "calm";
		husky.bark();
		husky.sit();
		husky.rollOver();
		husky.playDead();
		husky.fetch();
		husky.eat();
		
		System.out.println(husky.height);
		
		dog bulldog = new dog();
		bulldog.name = "Charles";
		bulldog.age = 7;
		bulldog.height = .36;
		bulldog.weight = 21;
		bulldog.color = "brown";
		bulldog.favFood = "everything";
		bulldog.temperament = "agressive";
		
		System.out.println(bulldog.favFood);
		
		dog labrador = new dog();
		labrador.name = "Homer";
		labrador.age = 10;
		labrador.height = .70;
		labrador.weight = 29;
		labrador.color = "chocolate";
		labrador.favFood = "bread";
		labrador.temperament = "playful";
		
		System.out.println(labrador.temperament);
	
}
}