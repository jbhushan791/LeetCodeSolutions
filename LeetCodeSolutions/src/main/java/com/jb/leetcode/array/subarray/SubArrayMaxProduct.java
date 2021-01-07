package com.jb.leetcode.array.subarray;

import java.util.HashMap;
import java.util.Map;

/**
 Given an integer array nums, find the contiguous subarray within an array
 (containing at least one number) which has the largest product.
 *
 * https://leetcode.com/problems/maximum-product-subarray/
 *
 * @author jbhushan
 */
public class SubArrayMaxProduct {

    public static void main(String[] args){
        int[] arr = {2,3,-2,4};
        maxProduct(arr);

        int[] q = {-2,0,-1};
        maxProduct(q);
    }

    public static int maxProduct(int[] arr) {
        int maxSofar = arr[0];
        int minSofar = arr[0];
        int result = maxSofar;

        for(int i=1; i< arr.length; i++){
            int tempMax = Math.max(arr[i], Math.max(arr[i]*maxSofar, arr[i]*minSofar));
            minSofar = Math.min(arr[i], Math.min(arr[i]*maxSofar, arr[i]*minSofar));
            maxSofar = tempMax;
            result = Math.max(result,maxSofar);
        }

        System.out.println("Max Product: "+result);
       return result;
    }
}
