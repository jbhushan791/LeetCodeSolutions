package com.jb.leetcode;

/**
 * @author jbhushan
 */
public class JumpGame2 {

    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        int minJumps = minJumps(nums);
        System.out.println(minJumps);
    }

    public static int minJumps(int[] nums){
        int curReach = 0;
        int jumps = 0;
        int maxReach = 0;
        for(int i=0; i< nums.length -1; i++){
            if(i+nums[i] > maxReach){
                maxReach = i+nums[i];
            }
            if(i == curReach){
                jumps++;
                curReach = maxReach;
            }
        }
        return jumps;
    }
}
