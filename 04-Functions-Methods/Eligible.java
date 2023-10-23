/*3. [A person is eligible to vote if his/her age is
 greater than or equal to 18. Define a method to
 find out if he/she is eligible to vote.]*/

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = in.nextInt();
        isEligible(age);
    }

    static void isEligible(int age) {

        if(age >= 18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
    }
}
