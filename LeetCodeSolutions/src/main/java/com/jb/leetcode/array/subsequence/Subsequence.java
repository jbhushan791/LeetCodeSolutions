package com.jb.leetcode.array.subsequence;

import java.util.Arrays;

/**
 * @author jbhushan
 */
public class Subsequence {

    public static void main(String[] args){

    }


    /**
     * Time complexity O(nlogn)
     * @param nums
     * @return
     */
    private int findMaxSteak(int[] nums){
        Arrays.sort(nums);

        int curStreak =1;
        int longStreak =1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    curStreak++;
                } else {
                    longStreak = Math.max(longStreak,curStreak);
                    curStreak = 1;
                }
            }
        }

        return Math.max(curStreak,longStreak);
    }
}
