package com.jb.leetcode.array;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate
 * (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai)
 * and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the
 * container contains the most water.
 *
 * Notice that you may not slant the container.
 *
 * @link https://leetcode.com/problems/container-with-most-water/
 *
 * @author jbhushan
 */
public class ContainerWithMostWater {

    public static void main(String[] args){

        int[] height = {1,8,6,2,5,4,8,3,7};
        trapRainWater(height);

        int[] height1 = {1,1};
        trapRainWater(height1);

    }

    private static int trapRainWater(int[] height){
        int area = 0;
        int start = 0;
        int end = height.length-1;
        while (start<end){
           area = Math.max(area, Math.min(height[start], height[end]) * (end-start));
            if(height[start]<height[end]){
                start++;
            } else {
                end--;
            }
        }

        System.out.println("Volume: "+area);
        return area;
    }
}
