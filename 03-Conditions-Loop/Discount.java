/*. Calculate Discount Of Product*/

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (for 10% discount):");
        float amount = input.nextFloat();
        float discount = amount * 90 / 100;

        System.out.println("Discounted Amount: " + discount);
    }
}
