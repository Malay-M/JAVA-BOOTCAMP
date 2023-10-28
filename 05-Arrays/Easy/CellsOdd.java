/*14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)*/

import java.util.Arrays;

public class CellsOdd {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {
                {0, 1},
                {1, 1}
        };

        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            incRow(matrix, row);
            incCol(matrix, col);
        }

        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

        int count = oddCount(matrix);
        System.out.println(count);
    }


    static void incRow(int[][] matrix, int row) {
        for(int i = 0; i < matrix[row].length; i++){
            matrix[row][i]++;
        }
    }

    static void incCol(int[][] matrix, int col) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][col]++;
        }
    }

    static int oddCount(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }
}