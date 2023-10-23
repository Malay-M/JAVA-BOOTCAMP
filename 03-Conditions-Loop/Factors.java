/*23. Input a number and print all the factors of that number (use loops).*/

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        System.out.println("All factors of " + num + " is:");

        for (int i = 1; i <= num/2; i++)
        {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }
}
