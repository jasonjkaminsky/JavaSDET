package com.syntax.class26;

public class Registration {
// Create Registration Class in which you would have variables as email, userName and password that
// have an access scope only within its own class. After creating an object of the class user should
// be able to call methods and in each method separately pass values to set users email, username and password.
// Requirements:  Valid email consider to be only yahoo.  Valid userName and password cannot be empty and
//  should be of length larger than 6 characters. Also, valid password cannot contain userName.

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (email.contains("yahoo")) {
            System.out.println("email was accepted as: " + email);
        } else System.out.println("Please enter email with yahoo address");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (userName.isEmpty()) {
            System.out.println("Username cannot be empty");
        }
        if (userName.length() <= 6) {
            System.out.println("Username must be more than six characters");
        } else System.out.println("Username was accepted as: " + userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.isEmpty()) {
            System.out.println("Password cannot be empty");
        } else if (password.length() <= 6) {
            System.out.println("Password must be more than six characters");
            } else if (password.contains(userName)) {
                    System.out.println("The password cannot contain the username");
                } else {
                    System.out.println("Password was accepted as: " + password);
                }
            }
        }

