package com.jb.leetcode.array.rotate;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * time complexity = O(n)
 * space complexity = O(1)
 *
 * @Link https://leetcode.com/problems/rotate-array/
 *
 * @author jbhushan
 */
public class RotateRightUsingReverse {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        rotateRight(nums,3);
    }


    private  static void rotateRight(int[] nums, int k){
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for(int num :nums){
            System.out.print(num+" ");
        }
    }
    private static void reverse(int[] nums, int left, int right){
       while(left<right){
           int temp = nums[left];
           nums[left] = nums[right];
           nums[right] = temp;
           left++;
           right--;
       }
    }
}
