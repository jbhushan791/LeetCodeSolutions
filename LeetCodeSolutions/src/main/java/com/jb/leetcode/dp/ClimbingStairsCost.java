package com.jb.leetcode.dp;

/**
 * @author jbhushan
 */
public class ClimbingStairsCost {

    public static void main(String[] args){
        ClimbingStairsCost climbingStairs = new ClimbingStairsCost();
        int[] cost1 = {10, 15, 20};
        climbingStairs.climbingStairs(cost1);

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        climbingStairs.climbingStairs(cost2);

    }

    public int climbingStairs(int[] n){

        for(int i=2; i<n.length; i++){
            n[i]+=Math.min(n[i-2], n[i-1]);
        }
        System.out.println("Cost "+Math.min(n[n.length-1],n[n.length-2]));
        return Math.min(n[n.length-1],n[n.length-2]);
    }
}
