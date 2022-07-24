package com.syntax.class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HWcreatePropsFile {
    public static void main(String[] args) throws IOException {
        // Path where we want to create the file
        String path = "Files/FB.properties";

        // We need to go to that path to create this file programmatically,
        // this is how we do that
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        // Create the object of properties class to store properties inside the file
        Properties properties = new Properties();

        // Store key value pair inside the object
        properties.setProperty("browser", "Chrome");
        properties.setProperty("url", "https://facebook.com");
        properties.setProperty("username", "MisterPatiChai");
        properties.setProperty("password", "ILovePatiChai99");

        // Store this data in the form of a file on our hard drive
        properties.store(fileOutputStream, "New properties have been added");

        // Close that file
        fileOutputStream.close();

    }
}
