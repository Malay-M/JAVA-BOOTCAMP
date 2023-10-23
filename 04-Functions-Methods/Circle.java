/*6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]*/

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        float radius = in.nextFloat();

        float circumference = circumference(radius);
        float area = area(radius);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }

    static float circumference(float r) {
        float circumference = 2 * (float) (22 / 7) * r;
        return circumference;
    }

    static float area(float r) {
        float area = (float) (22 / 7) * r * r;
        return area;
    }
}
