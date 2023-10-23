/*1. [Define two methods to print the maximum and
the minimum number respectively among three
numbers entered by the user.]*/

import java.util.Scanner;

public class MaxMin {
    static int max = -9999, min = 9999;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.print("Enter three value:");
        for (int i = 0; i < 3; i++) {
            int n = in.nextInt();
            max = isMax(n);
            min = isMin(n);
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    static int isMax(int n) {
        if(n > max) {
            max = n;
        }
        return max;
    }

    static int isMin(int n) {
        if(n < min) {
            min = n;
        }
        return min;
    }
}
