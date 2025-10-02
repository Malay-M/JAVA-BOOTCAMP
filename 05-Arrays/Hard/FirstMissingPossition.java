/*2. [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) */

import java.util.HashSet;

public class FirstMissingPossition {
    
    public static int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        int count = 1;

        while(count <= nums.length) {
            if(!hs.contains(count)) {
                return count;
            } else {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        
        int[] nums = {7,8,9,11,12};

        System.out.println(firstMissingPositive(nums));
    }
}
