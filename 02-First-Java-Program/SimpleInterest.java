/*3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.*/

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal:");
        float principal = input.nextFloat();
        System.out.print("Time(in years):");
        float time = input.nextFloat();
        System.out.print("Interest Rate:");
        float rate = input.nextFloat();

        float SimpleInt = (principal * time * rate) / 100;

        System.out.print("Simple Interest: "+SimpleInt);
    }
}
