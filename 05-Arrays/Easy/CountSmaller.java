/*8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)*/

import java.util.Arrays;

public class CountSmaller {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(smallCount(nums, i, j)){
                    count++;
                }
            }

            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));
    }

    static boolean smallCount(int[] nums, int i, int j) {
        if(j != i && nums[j] < nums[i])
            return true;
        return false;
    }
}
