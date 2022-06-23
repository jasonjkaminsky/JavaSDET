package com.syntax.class14;

public class class14HW5 {

	public static void main(String[] args) {
		
// Create a method createEmail(). Based on values of users name, lastName and
// email type, your method should return complete email Address.
// Example:  createEmail(John, Snow, 
		
		class14HW5 object = new class14HW5();
		System.out.println(object.createEmail("John", "Snow", "gmail"));
	
	}
		
		String createEmail(String firstName, String lastName, String email){
			return firstName + lastName + "@" + email;
		}
		
	}
