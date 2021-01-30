package com.jb.leetcode.array.equilibrium;

/**
 * 34.Given an array of integers nums sorted in ascending order, find the starting and ending
 * position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * Follow up: Could you write an algorithm with O(log n) runtime complexity?
 *
 * @link https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * @author jbhushan
 */
public class FindFirstAndLastIndex {

    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int[] indices = findRangeUsingBinarySearch(arr,8);

        for(int index : indices) {
            System.out.print(index+" ");
        }
    }

    public static int[] findRangeUsingBinarySearch(int[] arr, int target) {
        int[] range = {-1,-1};

        int leftIndex = findExtremeIndex(arr, target, true);

        if(leftIndex == arr.length || arr[leftIndex] != target){
            return range;
        }
        int rightIndex = findExtremeIndex(arr, target, false);

        range[0] = leftIndex;
        range[1] = rightIndex-1;
        return range;
    }

    private static int findExtremeIndex(int[] nums, int target, boolean left){
        int low=0;
        int high = nums.length-1;

        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid] > target || (left && nums[mid] == target)){
                high = mid;
            } else {
                low = mid+1;
            }
        }

        return low;
    }

}
