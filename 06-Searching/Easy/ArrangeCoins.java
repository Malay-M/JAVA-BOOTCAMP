/*6. [Arranging Coins(Easy)](https://leetcode.com/problems/arranging-coins/) */

public class ArrangeCoins {


    public static int arrangeCoins(int n) {
        
        long i = 0;
        long j = n;
        long mid = 0;
        long sum = 0;
        
        while(i <= j) {
            mid = i + (j-i)/2;
            sum = (mid * (mid + 1)) / 2;
            
            if(n > sum) {
                i = mid + 1;
            } else if(n < sum) {
                j = mid - 1;
            } else {
                return (int)mid;
            }
        }

        return (int)j;
    }

    public static void main(String[] args) {
        // int n = 9;
        int n = 10;

        System.out.println(arrangeCoins(n));
    }
}
