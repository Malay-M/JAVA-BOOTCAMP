/*23. [Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)*/

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyNumber {
    public static void main(String[] args) {

        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        ArrayList<Integer> lucky = new ArrayList<>();

        int max, min;
        int[] rowMin = new int[matrix.length];
        int[] colMax = new int[matrix[0].length];


        for(int i = 0; i < matrix.length; i++) {
            min = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++) {
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }

        System.out.println(Arrays.toString(rowMin));

        for(int i = 0; i < matrix[0].length; i++) {
            max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++) {
                if(max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            colMax[i] = max;
        }

        System.out.println(Arrays.toString(colMax));

        for(int i = 0; i < rowMin.length; i++) {
            for(int j = 0; j < colMax.length; j++) {
                if(rowMin[i] == colMax[j]) {
                    lucky.add(rowMin[i]);
                }
            }
        }

        System.out.println(lucky);
    }
}
