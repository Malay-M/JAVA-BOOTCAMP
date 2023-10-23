/*13. Sum Of N natural Numbers*/

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n = input.nextInt(), sum = 0;
        for (int i =1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + "natural number is " + sum);
    }
}
