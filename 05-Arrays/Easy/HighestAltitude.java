/*12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)*/

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int n = gain.length;
        int[] ans = new int[n + 1];

        for(int i = 0; i < n; i++) {
            ans[i + 1] = ans[i] + gain[i];
        }

        int max = ans[0];
        for(int i = 0; i < ans.length; i++) {
            if(ans[i] > max)
                max = ans[i];
        }

        System.out.println(max);
    }
}
