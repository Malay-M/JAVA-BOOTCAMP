/*8. To find out whether the given String is Palindrome or not.*/

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String string = input.nextLine();

        int length = string.length();
        String Reverse="";
            for(int i = length - 1; i >= 0; i--) {

                Reverse = Reverse + string.charAt(i);
            }
        System.out.println();
        if (string.equals(Reverse))
            System.out.println("Given String is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
