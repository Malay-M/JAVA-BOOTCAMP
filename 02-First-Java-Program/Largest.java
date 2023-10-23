/*5. Take 2 numbers as input and print the largest number.*/

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = input.nextInt();

        if( num1 > num2 )
            System.out.println(num1 + " is larger than " + num2);
        else if(num1 < num2)
            System.out.println(num2 + " is larger than " + num1);
        else
            System.out.println(num1 + " and " + num2 + ", both numbers are equal");
    }
}
