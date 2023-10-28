/*27. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/)*/

public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {1,2,3};

        int odd = 0, even = 0;
        
        for(int x : position) {
            if(x % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(Math.min(even, odd));

    }
}
