/* 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) */

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int n = nums.length;
        int[] ans = new int[n * 2];

        for(int i =0; i < n * 2; i++){

            if(i < n){
                ans[i] = nums[i];
            }
            if(i >= n){
                ans[i] = nums[i - n];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
