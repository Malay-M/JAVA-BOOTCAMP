/*9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)*/

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        int[] target = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            addData(nums[i], index[i], target);
        }
        System.out.println(Arrays.toString(target));
    }

    static void addData(int value, int index, int[] target) {

        int temp;
        for(int i = index; i < target.length; i++) {
            temp = target[i];
            target[i] = value;
            value = temp;
        }

    }
}
