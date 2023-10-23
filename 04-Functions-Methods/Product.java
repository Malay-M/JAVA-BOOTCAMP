/*5. [Define a method that returns the product of two numbers entered by user.]*/

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();
        int product = product(a, b);
        System.out.println("Multiplication: " + product);
    }

    static int product(int x, int y){
        return x * y;
    }
}
