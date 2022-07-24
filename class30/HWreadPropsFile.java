package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HWreadPropsFile {
    public static void main(String[] args) throws IOException {
        // 1. get the path of the file
        String path = "Files/FB.properties";

        // 2. navigate to the location the file is stored in
        // * with the help of class FileInputStream if we are reading the file
        // * or with FileOutputStream if we are writing the data in that file
        FileInputStream fileInputStream=new FileInputStream(path);

        // 3. we need a class that understands how to read the data from the file type--> create an object of that class
        Properties properties=new Properties();

        // 4. loading the data from the file inside the properties Object
        properties.load(fileInputStream); //Reads a property list (key and element pairs) from the input byte stream.

        // 5. read or write data in file
        // properties class extends HashTable which is a map, so we can use method .get or entrySet()
        // to read the data
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));

        fileInputStream.close();
    }
}
