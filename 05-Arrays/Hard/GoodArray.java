/*3. [Good Array](https://leetcode.com/problems/check-if-it-is-a-good-array/) */

public class GoodArray {
    
    public static boolean isGoodArray(int[] nums) {
        
        int gcd = nums[0];

        if(nums.length > 1) {
            for(int i = 1; i < nums.length; i++) {
                gcd = gcd(nums[i], gcd);

                if(gcd == 1) {
                    return true;
                }
            }
        }

        return gcd == 1;


    }



    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // public static int gcd(int a, int b) {

    //     while(a != b) {
    //         if(a > b) {
    //             a = a - b;
    //         } else {
    //             b = b - a;
    //         }
    //     }
        
    //     return a;
    // }

    public static void main(String[] args) {
        // int[] nums = {12,5,7,23};
        int[] nums = {29,6,10};

        System.out.println(isGoodArray(nums));
    }
}
