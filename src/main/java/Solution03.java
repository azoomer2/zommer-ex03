import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = scan.nextLine();
        System.out.println("Who said it?");
        String author = scan.nextLine();
        System.out.println(author + "says, \"" + quote + ".\"");

    }

}

/*
    Psuedo Code

    System.in user for 'quote'
    System.in user for 'author'
    System.out 'author' + says + 'quote' using /"



 */