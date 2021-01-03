package com.jb.leetcode.array.sum;

import java.util.*;

/**
 * Given an array nums of n integers and an integer target, find three integers in
 * nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly
 * one solution.
 *
 *  @link https://leetcode.com/problems/3sum-closest/
 *
 * @author jbhushan
 */
public class ThreeSumClosest {

    public static void main(String[] args){
        int[] arr = {-1,2,1,-4};

        int sum = threeSumClosest(arr, 1);

        System.out.println(sum);
    }

    public static int threeSumClosest(int[] arr, int target){
        int minSum = Integer.MAX_VALUE;
        int currentSum =0;
        for(int i=0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length -1;
            while(l<r){
                currentSum = arr[i] + arr[l]+ arr[r];
                if(Math.abs(target - currentSum) < Math.abs(minSum)){
                    minSum = target-currentSum;
                } else if(target < currentSum){
                    l++;
                } else{
                    r--;
                }
            }
        }
        return (target-minSum);
    }

}
