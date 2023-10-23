/*14. [Write a function that returns the sum of first n natural numbers.]*/

import java.util.Scanner;

public class SumOfN {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of values:");
        int n = in.nextInt();
        System.out.print("Enter all values:");
        for(int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum(num);
        }

        System.out.println("Sum of n numbers are " + sum);
    }

    static void sum(int n) {
        sum = sum + n;
    }
}
