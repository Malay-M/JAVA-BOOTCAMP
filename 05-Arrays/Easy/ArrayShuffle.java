/*5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)*/

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3, count = 0;
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n * 2; i++){
            if(i < n)
                x[i] = nums[i];
            else
                y[i - n] = nums[i];
        }

        for(int i = 0; i < n * 2; i = i + 2) {
            nums[i] = x[count];
            nums[i + 1] = y[count];
            count++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
