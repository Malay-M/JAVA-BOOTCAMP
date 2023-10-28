/*18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddArray {
    public static void main(String[] args) {
        int[] num = {6};
        int k = 7;
        int dig, rem;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = num.length - 1; i >= 0; i--) {
            rem = k % 10;
            dig = rem;
            k = k / 10;
            num[i] = num[i] + dig;
            if(num[i] > 9 && i > 0) {
                num[i] = num[i] - 10;
                num[i - 1] = num[i - 1] + 1;
            }
        }


        while(k > 0) {
            rem = k % 10;
            list.add(rem);
            k = k /10;
        }
        Collections.reverse(list);

        for(int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }

        for(int i = list.size() - 1; i > 0; i--) {
            if(list.get(i) > 9) {
                int sub = list.get(i) - 10;
                list.set(i, sub);
                list.set(i - 1, list.get(i -1) + 1);
            }
        }

        if(list.get(0) > 9) {
            int val = list.get(0);
            Collections.reverse(list);
            list.set(list.size() - 1, val - 10);
            list.add(1);
            Collections.reverse(list);
        }

        System.out.println(list);

    }

}
