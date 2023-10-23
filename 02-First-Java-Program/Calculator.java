/*4. Take in two numbers and an operator (+, -,* ,/ ) and calculate the value.
(Use if conditions)*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = input.nextInt();
        System.out.print("Enter operation(+,-,*,/):");
        char operation = input.next().charAt(0);

        if(operation == '+')
            System.out.println("Result: "+ (num1+num2));
        else if(operation == '-')
            System.out.println("Result: "+ (num1-num2));
        else if(operation == '*')
            System.out.println("Result: "+ (num1*num2));
        else if(operation == '/')
            System.out.println("Result: "+ (num1/num2));
        else
            System.out.println("Please enter right operation!!!");

    }
}
