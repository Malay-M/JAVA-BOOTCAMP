/*15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)*/

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        int n = mat.length;

        sum = diagonalSum(mat);

        if(n % 2 != 0){
            int half = n / 2;
            sum = sum - mat[half][half];
        }

        System.out.println(sum);


    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
        }

        for(int i = 0, j = n - 1; i < n; i++) {

                sum = sum + mat[i][j];
                j--;
            }
        return sum;
    }
}
