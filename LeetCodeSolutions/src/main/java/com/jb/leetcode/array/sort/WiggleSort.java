package com.jb.leetcode.array.sort;

/**
 * Given an unsorted array nums, reorder it in-place such that
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 *
 * @Link https://leetcode.com/problems/wiggle-sort/
 *
 * @author jbhushan
 */
public class WiggleSort {

    public static void main(String[] args){
        int[] nums = {3,5,2,1,6,4};
        wiggleSort(nums);
    }

    private static void wiggleSort(int[] nums){

        if(nums.length > 1){
            for(int i=0; i< nums.length; i= i+2){
                int temp =-1;
                if(i > 0 && nums[i] > nums[i-1]){
                    temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }

                if(i > 0 && nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }

        for(int num : nums){
            System.out.print(num+" ");
        }

    }
}
