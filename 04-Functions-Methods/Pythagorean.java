/*
12. [Write a function to check if a given triplet is a Pythagorean triplet or not.]
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).*/

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter triplet:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(pythagorean(a, b,c))
            System.out.println("Triplet is a Pythagorean triplet");
        else
            System.out.println("Triplet is not a Pythagorean triplet");
    }

    static boolean pythagorean(int a, int b, int c) {
        return ((a * a) + (b * b)) == (c * c);
    }
}
