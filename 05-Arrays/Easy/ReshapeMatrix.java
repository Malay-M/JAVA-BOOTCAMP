/*24. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)*/

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[] items = new int[mat.length * mat[0].length];

        for(int i = 0, k = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++, k++) {
                items[k] = mat[i][j];
            }
        }

        System.out.println(Arrays.toString(items));

        if(items.length == (r * c)) {
            int[][] matrix = new int[r][c];

            for(int i = 0, k = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++, k++) {
                    matrix[i][j] = items[k];
                }
            }

            for(int[] x : matrix) {
                System.out.println(Arrays.toString(x));
            }
        }  else {
            for(int[] x : mat) {
                System.out.println(Arrays.toString(x));
            }
        }

    }
}
