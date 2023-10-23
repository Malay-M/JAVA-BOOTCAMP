/*25. Take integer inputs till the user enters 0 and print the largest number from all.*/

import java.util.Scanner;

public class AllLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max, num;
        System.out.print("Enter number:");
        num = input.nextInt();
        max = num;
        while (num != 0)
        {
            if (num > max)
                max = num;
            System.out.print("Enter number:");
            num = input.nextInt();
        }
        System.out.print("Max: " + max);
    }
}
