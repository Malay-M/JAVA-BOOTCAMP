/*3. [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixIII {
    
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int steps = 0;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dirIndex = 0;
        List<int[]> result = new ArrayList<>();

        result.add(new int[]{rStart, cStart});

        


        while(result.size() < rows*cols) {

            if(dirIndex == 0 || dirIndex == 2) {
                steps++;
            }

            for(int i = 0; i < steps; i++) {
                rStart += direction[dirIndex][0];
                cStart += direction[dirIndex][1];

                if(rStart >= 0 && rStart < rows && cStart >= 0  && cStart < cols) {
                    result.add(new int[]{rStart, cStart});
                }
                
            }

            dirIndex = (dirIndex + 1) % 4;
        }



        return result.toArray(new int[result.size()][]);
    }





    public static void main(String[] args) {
        
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows, cols, rStart, cStart)));

    }


}
