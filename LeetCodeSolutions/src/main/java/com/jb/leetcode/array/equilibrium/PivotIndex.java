package com.jb.leetcode.array.equilibrium;

/**
 * 724.Given an array of integers nums, write a method that returns the "pivot" index of this array.
 *
 * We define the pivot index as the index where the sum of all the numbers to the left of the index
 * is equal to the sum of all the numbers to the right of the index.
 *
 * If no such index exists, we should return -1. If there are multiple pivot indexes,
 * you should return the left-most pivot index.
 *
 * @link https://leetcode.com/problems/find-pivot-index/
 *
 * @author jbhushan
 */
public class PivotIndex {

    public static void main(String[] args){
        int[] arr = {1,7,3,6,5,6};
        int index = findPivot(arr);
        System.out.print(index);
    }

    public static int findPivot(int[] arr) {
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
            if(sum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
       return -1;
    }

}
