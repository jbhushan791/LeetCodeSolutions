package com.jb.leetcode.array.subarray;

import java.util.*;

/**
 Given an array of integers nums and an integer k, return the total
 number of continuous subarrays whose sum equals to k.
 * @Link https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * @author jbhushan
 */
public class SubArraySum {

    public static void main(String[] args){
        int[] arr = {1,1,1};

        int count = subArrayCount(arr, 2);
        System.out.println(count);

        int[] a = {1,2,3};
        count = subArrayCount(a, 3);
        System.out.println(count);
    }

    public static int subArrayCount(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int sum=0;
        int count =0;
        map.put(0, 1);

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-target)){
                count += map.get(sum-target);
            } else {
                map.put(sum, i);
            }

        }
       return count;
    }
}
