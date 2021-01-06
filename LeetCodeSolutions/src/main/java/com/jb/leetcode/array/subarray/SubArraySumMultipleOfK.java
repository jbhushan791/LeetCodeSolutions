package com.jb.leetcode.array.subarray;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a list of non-negative numbers and a target integer k, write a function to check if the array
 * has a continuous subarray of size at least 2 that sums up to a multiple of k, that is, sums up to
 * n*k where n is also an integer.
 *
 * @Link https://leetcode.com/problems/continuous-subarray-sum/
 *
 * @author jbhushan
 */
public class SubArraySumMultipleOfK {

    public static void main(String[] args){
        int[] arr = {23, 2, 4, 6, 7};

        boolean present = checkSubarraySum(arr, 6);
        System.out.println(present);

    }

    public static boolean checkSubarraySum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(0, -1);
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(target != 0){
                sum %= target;
            }

            if(map.containsKey(sum)){
                if(i-map.get(sum) > 1){
                    return true;
                }
            }
           map.put(sum, i);
        }
       return false;
    }
}
