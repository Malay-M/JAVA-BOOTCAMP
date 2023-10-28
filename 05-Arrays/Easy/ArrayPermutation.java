/*1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)*/

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
         ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
