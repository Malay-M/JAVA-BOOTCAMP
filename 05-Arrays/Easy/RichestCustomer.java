/*4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)*/

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},{7, 1, 3},{1, 9, 5}
        };
        int[] amount = new int[accounts.length];

        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            amount[i] = sum;
        }

        int max = amount[0];

        for(int i = 0; i < amount.length; i++){
            if(max < amount[i])
                max = amount[i];
        }
        System.out.println(max);

    }
}
