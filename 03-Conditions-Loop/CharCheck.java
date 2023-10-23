/*21. Java Program Vowel Or Consonant */

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char:");
        String ch = input.next();

        if (ch.equals("a") || ch.equals("A") || ch.equals("e" )|| ch.equals("E") || ch.equals("i" ) || ch.equals("I") || ch.equals("o" )|| ch.equals("O") || ch.equals("u" )|| ch.equals("U"))
            System.out.println(ch + " is an Vowel");
        else
            System.out.println(ch + " is an Consonant");
    }
}
