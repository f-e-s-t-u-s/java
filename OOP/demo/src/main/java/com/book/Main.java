package com.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //
        Book bookValues = new Book();

        System.out.println("Please enter the title of the book");
        bookValues.title = input.nextLine();

        System.out.println("Please enter the author name");
        bookValues.author = input.nextLine();

        System.out.println("Please enter the number of pages");
        bookValues.numberOfPages = input.nextInt();

        System.out.println("The book title is:" + bookValues.title);
        System.out.println("The book author is:" + bookValues.author);
        System.out.println("The book has " + bookValues.numberOfPages);

        input.close();

    }
}