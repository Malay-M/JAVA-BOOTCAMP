/*7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)*/

public class GoodPair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j =0; j < nums.length; j++) {
                if(goodPair(nums, i, j))
                    count++;
            }
        }

        System.out.println(count);

    }

    static boolean goodPair(int[] nums, int i, int j) {
        if(nums[i] == nums[j] && i < j)
            return true;
        return false;
    }
}
