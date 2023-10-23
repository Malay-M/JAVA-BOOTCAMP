/*5. Calculate Distance Between Two Points*/

import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st point:");
        System.out.print("X1: ");
        int x1 = input.nextInt();
        System.out.print("Y1: ");
        int y1 = input.nextInt();
        System.out.println("Enter 2nd point:");
        System.out.print("X2: ");
        int x2 = input.nextInt();
        System.out.print("Y2: ");
        int y2 = input.nextInt();

        float distance;

        distance = (float) Math.sqrt((Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2)));

        System.out.print("Distance: " + distance);
    }
}
