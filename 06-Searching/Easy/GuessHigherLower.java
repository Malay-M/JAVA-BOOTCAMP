/*2. [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) */

public class GuessHigherLower {

    static int pick = 6; 

    public static int guessNumber(int n) {
        int low = 1, high = n, mid;  
        int ans = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            int res = guess(mid); 

            if (res == 0) {
                ans = mid;
                break;
            } else if (res == 1) {
                low = mid + 1;
            } else if (res == -1) {
                high = mid - 1;
            }
        }
        return ans;
    }


    public static int guess(int num) {
        if (num == pick) return 0;
        else if (num > pick) return -1;
        else return 1;
    }


    
    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
}
