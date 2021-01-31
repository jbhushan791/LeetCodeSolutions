package com.jb.leetcode.array.binarysearch;

/**
 * You are given an integer array nums sorted in ascending order (with distinct values),
 * and an integer target.
 *
 * Suppose that nums is rotated at some pivot unknown to you beforehand
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * If target is found in the array return its index, otherwise, return -1.
 *
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array
 *
 * @author jbhushan
 */
public class FindInRotatedArray {

    public static void main(String[] args){

        FindInRotatedArray findInRotatedArray = new FindInRotatedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int index = findInRotatedArray.findIndexInRotatedArray(nums, 3);
        System.out.println("Index: "+index);

    }

    private int findIndexInRotatedArray(int[] nums, int target){
        int start=0;
        int end = nums.length-1;
        while(start <=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid -1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target < nums[end] && target > nums[mid]){
                    start = mid+1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
