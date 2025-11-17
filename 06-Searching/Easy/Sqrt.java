/*1. [Square Root](https://leetcode.com/problems/sqrtx/) */

class Sqrt {

    public static int mySqrt(int x) {
        int start = 1;
        int end = x;

        if(x < 2) {
            return x;
        }

        while(start < end) {

            int mid = start + (end - start) / 2;

            int temp = x / mid;

            if(temp == mid) {
                return mid;
            } else if(temp < mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
            
        }

        return start - 1;
    }



    public static void main(String[] args) {
        int x = 3;

        System.out.println(mySqrt(x));
    }
}