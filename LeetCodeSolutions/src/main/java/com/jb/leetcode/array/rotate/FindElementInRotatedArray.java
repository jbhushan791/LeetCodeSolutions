package com.jb.leetcode.array.rotate;

/**
 * You are given an integer array nums sorted in ascending order (with distinct values), and
 * an integer target.
 * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7]
 * might become [4,5,6,7,0,1,2]).
 * If target is found in the array return its index, otherwise, return -1.
 *
 * @Link https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * @author jbhushan
 */
public class FindElementInRotatedArray {

    public static void main(String[] args){
        FindElementInRotatedArray findElementInRotatedArray = new FindElementInRotatedArray();

        int[] nums = {4,5,6,7,0,1,2};
        findElementInRotatedArray.findElementInRotatedArray(nums,0);

        findElementInRotatedArray.findElementInRotatedArray(nums,3);
    }

    public int findElementInRotatedArray(int[] nums, int target){
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                System.out.println("Found Index: "+mid);
                return mid;
            } else if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else {
                if(target <= nums[end] && target > nums[mid] ){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        System.out.println("Found Index: "+ -1);
         return -1;
    }
}
