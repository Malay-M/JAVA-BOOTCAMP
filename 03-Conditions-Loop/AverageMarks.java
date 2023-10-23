/*12. Calculate Average Marks*/

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subject:");
        int n = input.nextInt();
        int num, sum = 0, avg;
        for (int i = 1; i <= n; i++)
        {
            System.out.print("Subject" + i + ":");
            num = input.nextInt();
            sum = sum + num;
        }
        avg = sum / n;
        System.out.println("Average Marks: " + avg);
    }
}
