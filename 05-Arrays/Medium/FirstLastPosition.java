/*6. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) */

import java.util.Arrays;

public class FirstLastPosition {


    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        

        return ans;
    }

    public static int findFirst(int[] nums,int target) { 

        int start = 0, end = nums.length -1;
        int mid = start + (end - start)/2;
        int index = -1;
        while(start<= end) {

            if(nums[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start)/2;

        }

        return index;
    }

    public static int findLast(int[] nums, int target) {

        int start = 0, end = nums.length-1;
        int index = -1;
        int mid = start + (end - start)/2;
        while(start <= end) {

            if(nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = start + (end - start)/2;
        }

        return index;
    }


    public static void main(String[] args) {
        // int[] nums = {5,7,7,8,8,10};
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}   
