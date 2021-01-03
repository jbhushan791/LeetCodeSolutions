package com.jb.leetcode.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * @link https://leetcode.com/problems/move-zeroes/
 *
 * @author jbhushan
 */
public class MoveZeros {

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};

        moveZeros(arr);

        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static void moveZeros(int[] arr) {
        int i = 0;
        int j = 0;
        while(i< arr.length){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }
    }

}
