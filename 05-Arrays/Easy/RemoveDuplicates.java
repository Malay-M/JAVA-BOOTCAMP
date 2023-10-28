/*26. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)*/

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] items = new int[nums.length];

        int num = nums[0], k = 1;
        items[0] = num;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > num) {
                items[k] = nums[i];
                k++;
            }
            num = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = items[i];
        }

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(nums));
        System.out.println(k);



    }
}
