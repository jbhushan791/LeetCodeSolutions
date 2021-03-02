package com.jb.leetcode.dp;

/**
 * @author jyotibhushan
 */
public class PaintFence {

    public static void main(String[] args){
        PaintFence paintFence = new PaintFence();
        paintFence.total(7, 2);

    }

    private int total(int n, int k){
        if(n==0){
            return 0;
        }

        if(n==1){
            return k;
        }

        int[] t = new int[n+1];
        t[1] = k;
        t[2] = k*k;
        for(int i =3; i<n+1; i++){
            t[i] = (t[i-1]+t[i-2])*(k-1);
        }
        System.out.println("Total num of ways: " +t[n]);
        return t[n];
    }
}
