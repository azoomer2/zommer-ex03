/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Zommer
 */
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = scan.nextLine();
        System.out.print("Who said it? ");
        String author = scan.nextLine();
        System.out.println(author + " says, \"" + quote + ".\"");

    }

}

/*
    Psuedo Code

    System.in user for 'quote'
    System.in user for 'author'
    System.out 'author' + says + 'quote' using /"



 */