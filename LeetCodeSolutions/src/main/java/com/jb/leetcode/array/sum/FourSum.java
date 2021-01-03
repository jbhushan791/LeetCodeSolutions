package com.jb.leetcode.array.sum;

import java.util.*;

/**
 Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums
 such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of
 target.

 Notice that the solution set must not contain duplicate quadruplets.
 *
 * @author jbhushan
 */
public class FourSum {

    public static void main(String[] args){
        int[] arr = {1,0,-1,0,-2,2};

        List<List<Integer>> quadruplets = fourSum(arr, 0);

        for(List<Integer> l : quadruplets){
            System.out.println(l.get(0)+" "+l.get(1)+" "+l.get(2)+" "+l.get(3)+" ");
        }
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        // Sort the array
        Arrays.sort(arr);

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i=0; i<arr.length;i++) {
            for(int j=i+1; j<arr.length; j++) {
                int l = j + 1;
                int r = arr.length - 1;
                while (l < r) {
                    int sum = arr[i] + arr[j] + arr[r] + arr[l];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        set.add(list);
                        r--;
                        l++;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
