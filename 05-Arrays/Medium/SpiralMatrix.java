/*1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)*/

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> list = new ArrayList<>();

        int n = matrix.length - 1;
        int m = matrix[0].length - 1;

        int top = 0, bottom = n, left = 0, right = m;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }
}
