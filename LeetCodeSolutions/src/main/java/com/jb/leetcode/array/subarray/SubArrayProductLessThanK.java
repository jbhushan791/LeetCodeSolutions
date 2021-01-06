package com.jb.leetcode.array.subarray;

import java.util.HashMap;
import java.util.Map;

/**
 Your are given an array of positive integers nums.

 Count and print the number of (contiguous) subarrays where the product of all the elements in the
  subarray is less than k.
 * @Link https://leetcode.com/problems/subarray-product-less-than-k/
 *
 * @author jbhushan
 */
public class SubArrayProductLessThanK {

    public static void main(String[] args){
        int[] arr = {10, 5, 2, 6};

        int count = numSubarrayProductLessThanK(arr, 100);
        System.out.println(count);

    }

    public static int numSubarrayProductLessThanK(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int prod=1;
        int count =0;
        int left=0;
        for(int right=0; right<arr.length; right++){
            prod *= arr[right];
            while (prod >= target){
                prod /= arr[left];
                left++;
            }
            count += right - left +1;
        }
       return count;
    }
}
