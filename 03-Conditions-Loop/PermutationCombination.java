/*15. Find Ncr & Npr*/

import java.util.Scanner;

public class PermutationCombination {

    public static int factorial (int n){
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return  fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = input.nextInt();
        System.out.print("Enter value of r:");
        int r = input.nextInt();
        int per, com;

        per = factorial(n) / factorial(n - r);
        com = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("Permutation: " + per);
        System.out.println("Combination: " + com);
    }
}
