/* 26. Write a program to print the sum of negative
numbers, sum of positive even numbers and the sum
 of positive odd numbers from a list of numbers
 (N) entered by the user. The list terminates when
 the user enters a zero. */

import java.util.Scanner;

public class ListOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int neg = 0, even = 0, odd = 0;
        while (num != 0)
        {
            if (num < 0)
                neg = neg + num;
            else if (num % 2 == 0)
                even = even + num;
            else
                odd = odd + num;

            System.out.print("Enter number:");
            num = input.nextInt();
        }

        System.out.println("Sum of all negative numbers: " + neg);
        System.out.println("Sum of all positive even numbers: " + even);
        System.out.println("Sum of all negative odd numbers: " + odd);
    }
}
