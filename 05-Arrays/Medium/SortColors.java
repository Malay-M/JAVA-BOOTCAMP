/*9. [Sort Colors](https://leetcode.com/problems/sort-colors/) */

import java.util.Arrays;

public class SortColors {
    
    public static void sortColors(int[] nums) {
        
        int low = 0, mid = 0, high = nums.length -1;

        while(mid <= high) {

            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }

        }


        
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}
