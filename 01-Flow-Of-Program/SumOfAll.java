/*5. Keep taking numbers as inputs till the user enters 0, after that print sum of all.*/

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, num;
        System.out.print("Enter number:");
        num = in.nextInt();
        do {
            sum = sum + num;
            System.out.print("Enter number:");
            num = in.nextInt();
        } while(num != 0);

        System.out.println("Sum of all numbers: " + sum);
    }
}
