package com.jb.leetcode.array.duplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
 * inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * @link https://leetcode.com/problems/find-the-duplicate-number/
 *
 * @author jbhushan
 */
public class FindSingleDuplicateNumber {

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};

        containsDuplicate(arr);

        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static int containsDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int num : arr){
           if(map.containsKey(num)){
               return num;
           } else {
               map.put(num, 1);
           }
       }
       return -1;
    }

    /**
     * This method is only valid when number contains from 1 to n
     * @param arr
     * @return
     */
    public static int xorOperation(int[] arr) {
        int xor = 0;
        for(int i=0; i< arr.length; i++){
            xor = xor ^ arr[i];
        }

        for(int i=1; i<=arr.length; i++){
            xor = xor ^ i;
        }

        return xor;
    }

    public static int negative(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i< arr.length; i++){
            if(arr[Math.abs(arr[i])] > 0){
                arr[Math.abs(arr[i])] *= -1;
            } else {
                return Math.abs(arr[i]);
            }
        }
        return -1;
    }

}
