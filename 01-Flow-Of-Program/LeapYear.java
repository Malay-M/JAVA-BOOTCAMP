/*1. Input a year and find whether it is a leap year or not.*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("Enter the year:");
        year = in.nextInt();

        if(year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if(year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if(year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        in.close();
    }
}