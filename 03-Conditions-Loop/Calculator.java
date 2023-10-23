import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        while(true)
        {
            System.out.println("-----Menu-----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("X. Exit");
            System.out.print("Enter your choice:");
            char ch = input.next().trim().charAt(0);
            if(ch == 'X' || ch == 'x')
            {
                break;
            }
            else {
                System.out.print("Enter 1st number:");
                num1 = input.nextInt();
                System.out.print("Enter 2nd number:");
                num2 = input.nextInt();

                if (ch == '1')
                {
                    result = num1 + num2;
                } else if (ch == '2')
                {
                    result = num1 - num2;
                } else if (ch == '3')
                {
                    result = num1 * num2;
                }
                else if (ch == '4')
                {
                    if (num2 == 0)
                    {
                        System.out.println("Result: Invalid");
                        break;
                    }
                    else {
                        result = num1 / num2;
                    }
                }
                else
                {
                    System.out.println("Enter valid choice");
                    break;
                }
                System.out.println("Result: " + result );
            }
        }

    }
}
