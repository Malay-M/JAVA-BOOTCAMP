/*16. Reverse A String In Java*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string that you want to reverse:");
        String string = input.nextLine();
        String reverse = "" ;
        for (int i = string.length() - 1; i >= 0; i--)
        {
            reverse = reverse + string.charAt(i);
        }
        System.out.println(reverse);
    }
}
