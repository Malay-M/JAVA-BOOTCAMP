/*1. [Max Value of Equation](https://leetcode.com/problems/max-value-of-equation/) */

import java.util.PriorityQueue;

public class MaxValueEquation {
    
    public static int findMaxValueOfEquation(int[][] points, int k) {
        
        int maxValue = Integer.MIN_VALUE;
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]) ;

        for(int[] point : points) {

            int currentX = point[0];
            int currentY = point[1];

            while(!maxHeap.isEmpty() && currentX - maxHeap.peek()[1] > k) {
                maxHeap.poll();
            }


            if(!maxHeap.isEmpty()) {
                int value = currentX + currentY + maxHeap.peek()[0];
                maxValue = Math.max(maxValue, value);
            }


            maxHeap.offer(new int[] {currentY - currentX, currentX});

        }


        return maxValue;

    }


    public static void main(String[] args) {
        
        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};
        int k = 1;

        System.out.println(findMaxValueOfEquation(points, k));
    }
}