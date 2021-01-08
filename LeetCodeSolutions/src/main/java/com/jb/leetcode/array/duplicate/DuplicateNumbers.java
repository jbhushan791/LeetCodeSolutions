package com.jb.leetcode.array.duplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
 * and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * @link https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *
 * @author jbhushan
 */
public class DuplicateNumbers {

    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};

        disappearedNumbers(arr);

    }

    public static List<Integer> disappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i =0; i< arr.length;i++){
            if(arr[Math.abs(arr[i])-1] > 0){
                arr[Math.abs(arr[i])-1] *= -1;
            } else{
                list.add(Math.abs(arr[i]) );
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }
        return list;
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
