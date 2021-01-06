package com.jb.leetcode.array.subarray;

import java.util.HashMap;
import java.util.Map;

/**
 Given an array nums and a target value k, find the maximum length of a subarray that
 sums to k. If there isn't one, return 0 instead.

 Note:
 The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

 * @Link https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
 *
 * @author jbhushan
 */
public class SubArraySumMaxSize {

    public static void main(String[] args){
        int[] arr = {1, -1, 5, -2, 3};
        maxSubArrayLen(arr, 3);

        int[] a = {1, 1, 1};
        maxSubArrayLen(arr, 2);

    }

    public static int maxSubArrayLen(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int sum=0;
        int result =0;
        map.put(0, -1);

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-target)){
                result = Math.max(i - map.get(sum - target), result);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("Length: "+result);
       return result;
    }
}
