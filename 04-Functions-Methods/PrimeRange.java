/*13. [Write a function that returns all prime numbers between two given numbers.]*/

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lower range:");
        int lower = in.nextInt();
        System.out.print("Upper range:");
        int upper = in.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + " are: ");
        for(int i = lower; i <= upper; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n){
        if(n == 0 || n == 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
