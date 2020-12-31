package com.jb.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jbhushan
 */
public class MinAbsoluteDifference {

    public static void main(String[] args){
        int[] arr = {4,2,1,3};

        int num = findMinDiff(arr);
        System.out.println(num);

        List<List<Integer>> result = findMinAbsoluteDiff(arr);

        for(List<Integer> pair: result){
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }

    public static List<List<Integer>> findMinAbsoluteDiff(int[] arr){

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length -1; i++){
            minDiff = Math.min(minDiff, arr[i+1]-arr[i]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<arr.length -1; i++){
            if(minDiff == arr[i+1]-arr[i]){
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return result;
    }

    public static int findMinDiff(int[] arr){
        int maxNumSoFar = arr[0];
        int minDiffSoFar = Math.abs(arr[1]-arr[0]);
        int currentDiff = Math.abs(arr[1]-arr[0]);

        for(int i =1; i< arr.length; i++){
            if(arr[i] > maxNumSoFar){
                maxNumSoFar = arr[i];
            } else {
                currentDiff = Math.abs(arr[i] - maxNumSoFar);
                if(currentDiff < minDiffSoFar){
                    minDiffSoFar = currentDiff;
                }

            }
        }
        return minDiffSoFar;
    }
}
