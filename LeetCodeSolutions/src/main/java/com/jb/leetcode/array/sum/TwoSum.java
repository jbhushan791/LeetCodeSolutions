package com.jb.leetcode.array.sum;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers
 * such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 *
 * @link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * @author jbhushan
 */
public class TwoSum {

    public static void main(String[] args){
        int[] arr = {2,7,11,15};

        int[] indices = twoSum(arr, 9);

        for(int n : indices){
            System.out.print(n+" ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int sum = arr[r]+arr[l];
            if(sum == target){
                break;
            } else if (sum < target){
                l++;
            }else{
                r--;
            }
        }
        int[] index = {l+1,r+1};
        return index;
    }

}
