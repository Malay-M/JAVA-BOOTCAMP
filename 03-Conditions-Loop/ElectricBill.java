/*2. Calculate Electricity Bill*/

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total unit:");
        float unit = input.nextFloat();
        float bill;
        bill = unit * 10;
        System.out.println("Bill: " + bill);
    }
}
