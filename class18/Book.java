package com.syntax.class18;

public class Book {
    // Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    // Instance variables are being initialized
    // Both Constructors are being executed
    String title;
    String author;
    String publisher;
    long ISBN;
    int year;

    Book(String title, String author, String publisher, long ISBN){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        System.out.println("The book's title is " + title + " its author is " + author + ", publisher is " + publisher + " and its ISBN is " + ISBN);
    }

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("The book's title is " + title + " its author is " + author + " and it was published in " + year);
    }

    public static void main(String[] args) {
        Book book1 = new Book ("The Catcher in the Rye", "Salinger", "Little, Brown", 9787543321724L);
        Book book2 = new Book("For Whom the Bell Tolls", "Hemingway", 1940);
    }
}
