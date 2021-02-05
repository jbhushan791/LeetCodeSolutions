package com.jb.leetcode.array.slidingwindow;

/**
 * @author jbhushan
 */
public class GrumpyOwner {

    private int maximumCustomer(int[] customers, int[] grumpy , int x){

        int localSum=0;
        for(int i=0; i<x;i++){
            localSum += customers[i];
        }

        int oldSum=localSum;

        for(int i =x; i<customers.length; i++){
            // irrespective of grumpyness, add because we want to span sliding window
            localSum += customers[i];

            // update on the basis of grmpyness
            if(grumpy[i-x] == 1){
                localSum -= customers[i-x];
            }

            if(grumpy[i] == 0) {
                oldSum -= customers[i-x];
            }
            oldSum = Math.max(oldSum,localSum);
        }

        return oldSum;
    }
}
