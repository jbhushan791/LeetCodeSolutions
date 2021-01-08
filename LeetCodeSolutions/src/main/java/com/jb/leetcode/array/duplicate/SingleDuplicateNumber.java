package com.jb.leetcode.array.duplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 *
 * @link https://leetcode.com/problems/contains-duplicate/
 *
 * @author jbhushan
 */
public class SingleDuplicateNumber {

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};

        containsDuplicate(arr);

        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static boolean containsDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int num : arr){
           if(map.containsKey(num)){
               return true;
           } else {
               map.put(num, 1);
           }
       }
       return false;
    }

    /**
     * This method is only valid when number contains from 1 to n
     * @param arr
     * @return
     */
    public static boolean xorOperation(int[] arr) {
        int xor = 0;
        for(int i=0; i< arr.length; i++){
            xor = xor ^ arr[i];
        }

        for(int i=1; i<=arr.length; i++){
            xor = xor ^ i;
        }

        return xor > 0;
    }

    public static boolean negative(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i< arr.length; i++){
            if(arr[Math.abs(arr[i])] > 0){
                arr[Math.abs(arr[i])] *= -1;
            } else {
                return true;
            }
        }
        return false;
    }

}
