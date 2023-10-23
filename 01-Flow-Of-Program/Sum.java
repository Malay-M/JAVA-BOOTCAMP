/*2. Take two numbers and print the sum of both.*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
