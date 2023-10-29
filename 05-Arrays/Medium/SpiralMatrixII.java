/*2. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)*/

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1, k = 1;

        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                matrix[top][i] = k;
                k++;
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                matrix[i][right] = k;
                k++;
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    matrix[bottom][i] = k;
                    k++;
                }
            }
            bottom--;
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    matrix[i][left] = k;
                    k++;
                }
                left++;
            }
        }

        for(int[] x : matrix) {
            System.out.println(Arrays.toString(x));
        }
    }
}
