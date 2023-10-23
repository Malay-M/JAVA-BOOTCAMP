/*9. Calculate Batting Average*/

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total runs:");
        int runs = input.nextInt();
        System.out.print("No of time outs:");
        int out = input.nextInt();

        float avg = (float)  runs / out;
        System.out.println("Batting average of the batsman: " + avg);
    }
}
