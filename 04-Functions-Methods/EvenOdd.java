/*2. [Define two methods to find out
 whether a given number is even or odd.]*/

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();

        if(isEven(n))
            System.out.println(n + " is even number");
        else
            System.out.println(n + " is odd number");
    }

    static boolean isEven(int n) {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
}
