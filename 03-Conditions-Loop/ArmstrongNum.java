/*14. Armstrong Number In Java*/

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();
        int temp = num, count = 0, rem, sum = 0;

        while(num != 0)
        {
            num = num / 10;
            count++;
        }
        num = temp;
        while (num != 0)
        {
            rem = num % 10;
            sum = sum + (int)Math.pow(rem, count);
            num = num / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is a armstrong number");
        else
            System.out.println(temp + " is not a armstrong number");
    }
}
