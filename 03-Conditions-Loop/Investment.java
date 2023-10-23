/*18. Future Investment Value*/

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment value:");
        float invest = input.nextFloat();
        System.out.print("Enter interest rate:");
        float rate = input.nextFloat();
        System.out.print("Enter time:");
        float time = input.nextFloat();
        float FutureValue = invest * ( 1 + ((rate / 100) * time));
        System.out.println("Future Investment Value: " + FutureValue);
    }
}
