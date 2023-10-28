/*3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)*/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int n = nums.length;
        int[] ans = new int[n];
        for(int i =0; i < n; i++) {
            ans[i] = runningSum(nums, i);
        }
        System.out.println(Arrays.toString(ans));
    }

    static int runningSum(int[] nums, int index){

        int sum = 0;
        for(int i = 0; i <= index; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}
