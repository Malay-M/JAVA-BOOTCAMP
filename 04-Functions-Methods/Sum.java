/*4. [Write a program to print the sum of two numbers
entered by user by defining your own method.]*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();

        int sum = sum(a, b);
        System.out.println("Sum: " + sum);
    }

    static int sum(int x, int y) {
        return x + y;
    }
}
