/*10. Calculate CGPA Java Program*/

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subject:");
        int n = input.nextInt();
        int num , sum = 0, GradePoint, PointSum = 0;
        for (int i = 1; i <= n ; i++)
        {
            System.out.print("Subject" + i + ":");
            num = input.nextInt();
            sum = sum + num;
            num = num / 10;
            if(num == 10)
            {
                GradePoint = 10;
            }
            else
            {
                GradePoint = num + 1;
            }
            PointSum = PointSum + GradePoint;
        }
        float cgpa = (float) PointSum / n;
        System.out.println("Total Marks Obtained: " + sum + "/" + (n * 100));
        System.out.println("Total Grade Point: " + PointSum + "/" + (n * 10));
        System.out.println("CGPA: " + cgpa);
    }
}
