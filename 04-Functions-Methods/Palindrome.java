/*10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        if(palindrome(n))
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }

    static boolean palindrome(int n){
        int temp = n, sum = 0, rem;
        while(n > 0) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if(temp == sum)
            return true;
        return false;
    }
}
