package com.jb.leetcode.dp;

/**
 * @author jbhushan
 */
public class ClimbingStairs {

    public static void main(String[] args){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairs.climbingStairs(10);

    }

    public int climbingStairs(int n){
        if(n==1){
            return 1;
        }

        int f=1;
        int s=2;
        for(int i=3; i<=n; i++){
            s+=i;
        }
        System.out.println("Total number of ways: "+s);
        return s;
    }
}
