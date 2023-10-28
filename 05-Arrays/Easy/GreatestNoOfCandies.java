/*6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)*/

import java.util.Arrays;

public class GreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        boolean[] ans = new boolean[candies.length];
        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] >= max)
                ans[i] = true;
            else
                ans[i] = false;
        }

        System.out.println(Arrays.toString(ans));
    }
}
