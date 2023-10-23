/*11. Compound Interest Java Program*/

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Compound Interest");
        System.out.print("Price:");
        float price = input.nextFloat();
        System.out.print("Interest Rate:");
        float rate = input.nextFloat();
        System.out.print("Time:");
        float time = input.nextFloat();
        float a =  1 + (rate / 100);
        float b = (float) Math.pow(a, time);
        float amount = price * b;
        float CompInt = amount - price;
        System.out.println("Total Amount: " + amount);
        System.out.println("Compound Interest: " + CompInt);
    }
}
