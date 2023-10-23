/*24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)*/

import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter number:");
        num = input.nextInt();
        while (num != 0)
        {
            sum = sum + num;
            System.out.print("Enter number:");
            num = input.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}
