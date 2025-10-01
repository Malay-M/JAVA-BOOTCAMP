/*7. [Jump Game](https://leetcode.com/problems/jump-game/) */

public class JumpGame {
    
    public static boolean canJump(int[] nums) {
        
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i > maxIndex) {
                return false;
            }

            maxIndex = Math.max(maxIndex, i + nums[i]);

            if(maxIndex == nums.length -1) {
                return true;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        
        // int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};

        System.out.println(canJump(nums));

    }
}
