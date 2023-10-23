/*20. LCM Of Two Numbers*/

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = input.nextInt();
        System.out.print("Enter another number:");
        int b = input.nextInt();
        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("LCM: " + a);
    }
}
