package com.jb.leetcode.array.twopointer;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 *
 * @link https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * @author jbhushan
 */
public class SortedArraySquares {

    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        sortedSquares(arr);
    }

    public static void sortedSquares(int[] arr) {
        int[] result = new int[arr.length];
        int l = 0;
        int r = arr.length-1;

        for(int i=arr.length-1; i >=0; i--){
            int square = 0;
           if(Math.abs(arr[l]) > Math.abs(arr[r])){
             square = arr[l];
               l++;
           }else{
               square = arr[r];
              r--;
           }
           result[i] = square*square;
        }
        for(int n : result){
            System.out.print(" " +n);
        }
    }

}
