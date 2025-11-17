/*5. [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/) */

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        if (num < 0) {
            return false;
        }

        if (num == 0 || num == 1) {
            return true;
        }

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // int num = 16;
        int num = 1;

        System.out.println(isPerfectSquare(num));
    }
}
