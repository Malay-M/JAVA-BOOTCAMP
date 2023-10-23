/*8. Calculate Depreciation of Value*/

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Assets price:");
        int price = input.nextInt();
        System.out.print("Depreciation rate(in %):");
        int depRate = input.nextInt();
        System.out.print("Time(in year):");
        int time = input.nextInt();

        int dep = (price * depRate * time) / 100;

        System.out.println("Depreciation value after " + time + " year : " + (price - dep));
    }
}
