package com.jb.leetcode.array;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * @link https://leetcode.com/problems/3sum/
 *
 * @author jbhushan
 */
public class ThreeSum {

    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>>  triplet = twoSum(arr, 0);

        for(List<Integer> l : triplet){
            System.out.println(l.get(0)+" "+l.get(1)+" "+l.get(2)+" ");
        }
    }

    public static List<List<Integer>>  twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i=0; i<arr.length;i++) {
            int l = i+1;
            int r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[r] + arr[l];
                if (sum == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[l]);
                    list.add(arr[r]);
                    set.add(list);
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    /**
     * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
     * Return the sum of the three integers. You may assume that each input would have exactly one solution.
     *
     * @link https://leetcode.com/problems/3sum-closest/
     */
    public static int threeSumClosest(int[] arr, int target){
        int minSum = Integer.MAX_VALUE;
        int currentSum =0;
        for(int i=0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length -1;
            while(l<r){
                currentSum = arr[i] + arr[l]+ arr[r];
                if(Math.abs(target - currentSum) < Math.abs(minSum)){
                    minSum = currentSum;
                } else if(target < currentSum){
                    l++;
                } else{
                    r--;
                }
            }
        }

        return (target=minSum);
    }

}
