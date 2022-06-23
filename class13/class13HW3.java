package com.syntax.class13;

public class class13HW3 {

	public static void main(String[] args) {
		
		String stuff1 = "Batch 13";
		String stuff2 = " is the best batch";
		
		stuff1 = stuff1 + stuff2;
		
		stuff2 = stuff1.substring(0, stuff1.length() - stuff2.length());
		stuff1 = stuff1.substring(stuff2.length());
		
		System.out.println("Now stuff1 is: " +stuff1+ ", and stuff2 is: " +stuff2);
		
	}

}
