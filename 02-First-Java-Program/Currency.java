/*6. Input currency in rupees and output in USD.*/

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees:");
        float inr = input.nextFloat();
        float usd = inr / 83;
        System.out.println("USD :$" + usd);
    }
}
