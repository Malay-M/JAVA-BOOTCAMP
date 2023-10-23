/*3. Calculate Average Of N Numbers*/

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter no of all number:");
        int n = input.nextInt();
        System.out.println("Enter all the number:");
        for (int i = 0; i < n; i++)
        {
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("Average: " + (sum / n));
    }
}
