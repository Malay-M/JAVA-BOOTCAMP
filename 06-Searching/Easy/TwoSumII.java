/*4. [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) */

import java.util.Arrays;

public class TwoSumII {


    public static int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length-1;

        while(i < j) {

            int sum = numbers[i] + numbers[j];

            if(sum > target) {
                j--;
            } else if(sum < target) {
                i++;
            } else {
                return new int[] {i+1, j+1};
            }

        }

        return new int[0];
    }

    public static void main(String[] args) {
        
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));


    }

    
    
}
