/*25. [Plus One](https://leetcode.com/problems/plus-one/)*/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 8};
        int[] nums = new int[digits.length + 1];

        digits[digits.length - 1] += 1;

        System.out.println(Arrays.toString(digits));

        for(int i = digits.length - 1; i > 0; i--) {
            if(digits[i] > 9) {
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
        }
        System.out.println(Arrays.toString(digits));

        if(digits[0] > 9) {
            digits[0] -= 10;
            nums[0] = 1;
            for(int i = 1; i <= digits.length; i++) {
                nums[i] = digits[i - 1];
            }

            System.out.println(Arrays.toString(nums));

        } else {

            System.out.println(Arrays.toString(digits));

        }

    }
}
