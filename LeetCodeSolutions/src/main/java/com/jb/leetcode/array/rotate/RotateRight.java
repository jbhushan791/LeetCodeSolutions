package com.jb.leetcode.array.rotate;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * @Link https://leetcode.com/problems/rotate-array/
 *
 * @author jbhushan
 */
public class RotateRight {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);

    }


    private  static void rotate(int[] nums, int k){
        while(k !=0){
            rotateRightUsingConstant(nums);
            k--;
        }

        for(int num :nums){
            System.out.print(num+" ");
        }
    }
    private static void rotateRightUsingConstant(int[] nums){
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0;i--){
            nums[i]= nums[i-1];
        }
        nums[0]= temp;
    }

    //private static
}
