package com.jb.leetcode.array.duplicate;

import java.util.*;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices
 * i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is
 * at most k.
 *
 * @link https://leetcode.com/problems/contains-duplicate-ii/
 *
 * @author jbhushan
 */
public class ContainsDuplicates2 {

    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        boolean contains = containsDuplicate(arr, 3);
        System.out.println(contains);

        int[] a = {1,2,3,1,2,3};
         contains = containsDuplicate(a, 2);
        System.out.println(contains);
    }

    public static boolean containsDuplicate(int[] arr, int k) {
        Set<Integer> list = new HashSet<Integer>();

        for(int i =0; i< arr.length;i++){
           if(list.contains(arr[i])){
               return true;
           }
           list.add(arr[i]);
           if(list.size() > k){
               list.remove(arr[i-k]);
           }
        }
        return false;
    }

}
