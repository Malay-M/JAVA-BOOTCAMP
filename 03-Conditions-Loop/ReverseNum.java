import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        int i,sum = 0, rem = 0;

        while (num !=0 )
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.print("Reverse: " + sum);
    }
}
