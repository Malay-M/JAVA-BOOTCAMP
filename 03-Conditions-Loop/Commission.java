/*6. Calculate Commission Percentage*/

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total sales:");
        int price = input.nextInt();
        int commission = price * 5 / 100;
        System.out.println("Commission Amount: " + commission);
    }
}
