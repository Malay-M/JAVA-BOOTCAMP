/*11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)*/

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMatching {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<String>> items = new ArrayList<>();

        String ruleKey = "color", ruleValue = "silver";

        for(int i = 0; i < 3; i++) {
            items.add(new ArrayList<>());
        }

//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                items.get(i).add(in.nextLine());
//            }
//        }
        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");


        items.get(1).add("computer");
        items.get(1).add("silver");
        items.get(1).add("lenovo");


        items.get(2).add("phone");
        items.get(2).add("gold");
        items.get(2).add("iphone");

        int ans = 0;
        if (ruleKey == "type") {
            ans = checkType(items, ruleValue);
        } else if(ruleKey == "color") {
            ans = checkColor(items, ruleValue);
        } else if (ruleKey == "name") {
            ans = checkName(items, ruleValue);
        }
        System.out.println(ans);
    }

    static int checkType(ArrayList<ArrayList<String>> items, String ruleValue){
        int n = items.size();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(items.get(i).get(0) == ruleValue)
                count++;
        }
        return count;
    }

    static int checkColor(ArrayList<ArrayList<String>> items, String ruleValue){
        int n = items.size();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(items.get(i).get(1) == ruleValue)
                count++;
        }
        return count;
    }

    static int checkName(ArrayList<ArrayList<String>> items, String ruleValue){
        int n = items.size();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(items.get(i).get(2) == ruleValue)
                count++;
        }
        return count;
    }
}
