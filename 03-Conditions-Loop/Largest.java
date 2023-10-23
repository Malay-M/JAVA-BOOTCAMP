import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        /*
        //Q: Find the largest of the 3 number
        int max = a;
        if (b > max)
        {
            max = b;
        }

        if (c > max)
        {
            max = c;
        }
        System.out.println(max);

         */
        // Max using Math class

        int max = Math.max(Math.max(a,b), c);
        System.out.println(max);
    }
}
