/*9. To find Armstrong Number between two given number.*/

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = input.nextInt();
        System.out.print("Enter another number:");
        int num2 = input.nextInt();
        System.out.println("Armstrong number between " + num1 + " and " + num2);
        for(int i = num1; i <= num2; i++)
        {
            //Count the length of integer
            int n = i;
            int count = 0;
            while(n != 0){
                n = n / 10;
                count++;
            }

            //convert into armstrong number
            int num = i;
            int rem, sum = 0, pow = 1;
            while(num != 0)
            {
                rem = num % 10;

                sum = sum + (int) Math.pow(rem,count);
                num = num / 10;
            }
            if(i == sum)
            {
                System.out.println(sum);
            }
        }

    }
}
