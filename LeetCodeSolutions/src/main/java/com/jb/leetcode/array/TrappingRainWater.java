package com.jb.leetcode.array;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * @link https://leetcode.com/problems/trapping-rain-water/
 *
 * @author jbhushan
 */
public class TrappingRainWater {

    public static void main(String[] args){

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trapRainWater(height);

        int[] height1 = {4,2,0,3,2,5};
        trapRainWater(height1);

    }

    private static int trapRainWater(int[] height){
        int[] left = new int[height.length];
        int max = -1;
        for(int i=0; i<height.length;i++){
            max = Math.max(max, height[i]);
            left[i] = max;
        }

        int[] right = new int[height.length];
        max = -1;
        for(int i = height.length-1; i>=0; i--){
            max = Math.max(max, height[i]);
            right[i] = max;
        }

        int total = 0;
        for(int i=0; i<height.length;i++){
            total = total + Math.min(left[i], right[i]) -height[i];
        }

        System.out.println("rain water trapped: "+total);
        return total;
    }
}
