/*4. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) */

public class MatrixZeroes {
    

    public static void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowImpacted = false;
        boolean firstColImpacted = false;


        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0) {
                firstColImpacted = true;
                break;
            }
        }

        for(int i =0; i < n; i++) {
            if(matrix[0][i] == 0) {
                firstRowImpacted = true;
                break;
            }
        }


        for(int i =1; i < m; i++) {
            for(int j = 1; j< n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {

                if(matrix[i][0] == 0 || matrix[0][j]== 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        if(firstRowImpacted) {
            for(int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        if(firstColImpacted) {
            for(int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

    }






    public static void display(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        // int[][] matrix = {{1,1,1}, {1,0, 1}, {1,1,1}};
        int[][] matrix = {{1,1,1}, {0,1, 1}, {1,1,1}};


        setZeroes(matrix);
        
        display(matrix);
    }



}
