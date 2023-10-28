/*22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)*/

import java.util.Arrays;

public class SumUpToZero {
    public static void main(String[] args) {
        int n = 6;
        int[] nums = new int[n];

        if(n % 2 == 0) {
            EvenNum(nums);
        } else {
            OddNum(nums);
        }
        System.out.println(Arrays.toString(nums));
    }

    static void OddNum(int[] nums) {
        int num = (nums.length / 2) * -1;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = num;
            num++;
        }
    }

    static void EvenNum(int[] nums) {
        int num = 1;
        for(int i = 0; i < nums.length - 1; i = i + 2) {
            nums[i] = num;
            nums[i + 1] = num * -1;
            num++;
        }
    }
}
