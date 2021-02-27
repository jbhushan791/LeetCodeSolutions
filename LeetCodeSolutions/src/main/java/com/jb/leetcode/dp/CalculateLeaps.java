package com.jb.leetcode.dp;

/**
 * @author jbhushan
 */
public class CalculateLeaps {

    public static void main(String[] args){
        CalculateLeaps climbingStairs = new CalculateLeaps();
        climbingStairs.climbingStairs(4);

    }

    public int climbingStairs(int n){
        int leaps = 0;
        if(n==1 || n==0){
            leaps = 1;
        } else {
            for(int i=0;i<n;i++){
                leaps+=climbingStairs(i);
            }
        }
        System.out.println(" Total Leaps: "+leaps);
        return leaps;
    }
}
