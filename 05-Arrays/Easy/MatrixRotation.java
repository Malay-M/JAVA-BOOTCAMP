/*20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)*/

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        int[][] rotate = new int[mat.length][mat.length];
        boolean ans = false;



        for(int i = 0; i < 4; i++) {

            rotate(mat, rotate);
            if(Arrays.deepEquals(mat, target)) {
                ans = true;
                break;
            }

        }

        System.out.println(ans);

    }

    static void rotate(int[][] mat, int[][] rotate) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0, k = mat.length - 1; j < mat.length; j++, k--) {
                rotate[i][j] = mat[k][i];
            }
        }
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                mat[i][j] = rotate[i][j];
            }
        }

        for(int x[] : mat) {
            System.out.println(Arrays.toString(x));
        }
    }

}
