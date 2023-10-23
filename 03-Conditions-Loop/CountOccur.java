import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a big number:");
        long num = input.nextLong();
        System.out.print("Enter digit that occurs multiple time:");
        long digit = input.nextLong();
        long i, count = 0;
        while (num != 0)
        {
            i = num % 10;
            if(digit == i)
                count++;
            num = num / 10;
        }
        System.out.println(digit + " occurs in " + count + " times");
    }
}
