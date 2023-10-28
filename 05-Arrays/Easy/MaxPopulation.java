/*19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)*/

import java.util.Arrays;

public class MaxPopulation {
    public static void main(String[] args) {
        int[][] logs = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        int[] popu = new int[102];
        int index = 0;
        for(int[] log: logs) {
            popu[log[0] - 1950]++;
            popu[log[1] - 1950]--;
        }

        for(int i = 0; i < popu.length - 1; i++) {
            popu[i + 1] = popu[i + 1] + popu[i];
        }

        System.out.println(Arrays.toString(popu));

        int maxPopu = popu[0], maxYear;

        for(int i = 0; i < popu.length; i++) {
            if(popu[i] > maxPopu) {
                maxPopu = popu[i];
                index = i;
            }
        }

        maxYear = 1950 + index;
        System.out.println(maxYear);
    }
}
