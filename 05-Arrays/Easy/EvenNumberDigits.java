/*16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)*/

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12 ,345 ,2 ,6 , 7896};
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int n = numDigits(nums[i]);
            if(n % 2 == 0)
                count++;
        }
        System.out.println(count);
    }

    static int numDigits(int num) {
        int count = 0;
        while(num > 0) {
            num = (int) num / 10;
            count++;
        }
        return count;
    }
}
