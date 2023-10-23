/*1. Factorial Program In Java*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter a number:");
        int num = input.nextInt();
        while (num != 0)
        {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }
}
