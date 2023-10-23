/*19. HCF Of Two Numbers Program*/

import java.util.Scanner;

public class HCF {
    public static int gcd(int x, int y){
        while (x != y)
        {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = input.nextInt();
        System.out.print("Enter another number:");
        int b = input.nextInt();

        int hcf = (a * b) / gcd(a, b);
        System.out.println("HCF: " + hcf);
    }
}
