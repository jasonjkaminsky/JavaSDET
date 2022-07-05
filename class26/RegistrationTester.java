package com.syntax.class26;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration obj = new Registration();

        obj.setEmail("billybob@gmail.com");
        obj.setEmail("billybob@yahoo.com");

        obj.setUserName("Billy");
        obj.setUserName("BillyBob22");

        obj.setPassword("billy");
        obj.setPassword("BillyBob22");
        obj.setPassword("fsdfhhvdhk");

        System.out.println("The email is: " + obj.getEmail());
        System.out.println("The username is: " + obj.getUserName());
        System.out.println("The password is: " + obj.getPassword());

    }



}
