/*13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)*/

import java.util.Arrays;

public class ImageFlipping {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int n = image.length;
        int[][] flipInverse = new int[n][n];

        for(int i = 0; i < n; i++) {
            int k = image[i].length - 1;
            for(int j = 0; j < image[i].length; j++){
                flipInverse[i][j] = 1 - image[i][k];
                k--;
            }
        }


        for(int i =0; i < n; i++) {
            System.out.println(Arrays.toString(flipInverse[i]));
        }

    }
}
