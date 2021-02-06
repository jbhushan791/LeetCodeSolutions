package com.jb.leetcode.array.binarysearch;

/**
 * Given an array of integers nums and an integer threshold, we will choose a positive integer
 * divisor, divide all the array by it, and sum the division's result. Find the smallest divisor
 * such that the result mentioned above is less than or equal to threshold.
 *
 * Each result of the division is rounded to the nearest integer greater than or equal to that
 * element. (For example: 7/3 = 3 and 10/2 = 5).
 *
 * It is guaranteed that there will be an answer.
 *
 * @link https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 *
 * @author jbhushan
 */
public class SmallestDivisorGivenThreshold {

    public static void main(String[] args){

    }

    private int findSmallestDivisor(int[] nums, int threshold){

        // Assign range , starting from 1 to maximum present in given array
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int n : nums){
            right = Math.max(right,n);
        }

        while(left<=right){
            int pivot = left + ((right-left)>>2);
            int num = computeDivisorSum(nums,pivot);
            if(num > threshold){
                left = pivot+1;
            } else {
                right = pivot-1;
            }
        }

        return left;
    }

    private int computeDivisorSum(int[] nums, int pivot) {
        int divisorSum=0;
        for(int n: nums){
            divisorSum += divisorSum/pivot+(divisorSum%pivot==0?0:1);
        }
        return divisorSum;
    }
}
