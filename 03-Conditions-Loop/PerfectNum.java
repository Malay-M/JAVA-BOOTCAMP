/*22. Perfect Number In Java*/

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }
        if (num == sum)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }

}
