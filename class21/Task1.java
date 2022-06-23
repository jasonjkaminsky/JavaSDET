package com.syntax.class21;

import java.sql.SQLOutput;

public class Task1 {
}


class UserClass {
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends UserClass {
    String userAddress;
    UserInfo(String name, String mobileNumber, String userAddress){
        super (name, mobileNumber);
        this.userAddress = userAddress;
    }

    void printInfo(){
        System.out.println("Name " + name + "Mobile Number " + mobileNumber + "User Address" + userAddress);
    }

}
