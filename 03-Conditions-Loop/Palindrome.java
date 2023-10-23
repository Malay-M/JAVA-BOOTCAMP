/*17. Find if a number is palindrome or not*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int sum = 0, temp = num, rem;
        while (num != 0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is a palindrome number");
        else
            System.out.println(temp + " is not a palindrome number");
    }
}
