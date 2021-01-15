package com.jb.leetcode.hash.disjoint;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author jbhushan
 */
public class Disjoint {

    public static void main(String[] args){
        int[] arr = {4};
        int[] arr1 = {1,2,3};
        boolean contains = disjointUsingMerge(arr,arr1);
        System.out.println(contains);

        int[] a1 = {4};
        int[] a2 = {1,2,3};
        contains = dispointUsingBST(a1,a2);
        System.out.println(contains);

    }

    private static boolean disjointUsingMerge(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                return false;
            } else if(nums1[i] < nums2[j]){
                i++;
            } else{
                j++;
            }
        }
        return true;
    }

    private static boolean dispointUsingBST(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for(int i=0; i<nums1.length; i++){
            treeSet.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(treeSet.contains(nums2[i])){
                return false;
            }
        }
        return true;
    }

}
