/*4. Take 2 numbers as inputs and find their HCF and LCM.*/

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();

        int mul ;

        mul = a * b;
        while(a != b) {
            if(a > b)
                a = a - b;
            else 
                b = b - a;
        }

        System.out.println("HCF: " + a);
        System.out.println("LCM: " + (mul / a));

    }
}
