package com.jb.leetcode;

/**
 * @author jbhushan
 */
public class JumpGame {

    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        boolean reach = canReach(nums);
        System.out.println(reach);
    }

    public static boolean canReach(int[] nums){
        int maxReach = 0;
        for(int i=0; i< nums.length; i++){
            if(i > maxReach){
                return false;
            }
            if(i+nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
        }
        if(maxReach >= nums.length-1){
            return true;
         }
        return false;
    }
}
