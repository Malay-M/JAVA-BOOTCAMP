/*7. To calculate Fibonacci Series up to n numbers.*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum=0;
        System.out.println("Enter fibonacci series number:");
        int n = input.nextInt();
        System.out.println("Fibonacci Series:");
        while(sum <= n)
        {
            System.out.print(sum +" ");
            a = b;
            b =sum;
            sum = a + b;
        }
    }
}
