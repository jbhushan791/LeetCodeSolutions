package com.jb.leetcode.array.duplicate;

import java.util.*;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 *
 * @link https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * @author jbhushan
 */
public class ContainsDuplicates2 {

    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        sortedSquares(arr);
        System.out.println(contains);
    }

    public static void sortedSquares(int[] arr) {
        int[] result = new int[arr.length];
        int l = 0;
        int r = arr.length-1;

        for(int i=arr.length-1; i >=0; i++){
            int square = 0;
           if(Math.abs(arr[l]) > Math.abs(arr[r])){
             square = arr[r];
             r--;
           }else{
               square = arr[l];
               l++;
           }
           result[i] = square*square;
        }
        for(int n : result){
            System.out.print(" " +n);
        }
    }

}
