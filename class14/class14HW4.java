package com.syntax.class14;

public class class14HW4 {

	public static void main(String[] args) {
		// Create a method that will say Hello in different language
		// based on the country that will passed when method is executed


	class14HW4 object = new class14HW4();
	object.hello("Brazil");
	
}

void hello (String country) {
	switch (country) {
	case "Mexico":
		 System.out.println("Hola");
		 break;
	case "USA":
		System.out.println("Hello");
		break;
	case "Brazil":
		System.out.println("Olá");
		break;
	case "Sweden":
		System.out.println("Hallå");
		break;
	case "Germany":
		System.out.println("Hallo");
		break;
	default:
		System.out.println("Sorry, the country you input is not found");
	}
	
}
	
	
	
}
