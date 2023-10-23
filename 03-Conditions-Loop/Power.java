/*7. Power In Java*/

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        int base = input.nextInt();
        System.out.print("Exponent: ");
        int exp = input.nextInt();

        int power = (int) Math.pow(base,exp);
        System.out.println("Power: " + power);
    }
}
