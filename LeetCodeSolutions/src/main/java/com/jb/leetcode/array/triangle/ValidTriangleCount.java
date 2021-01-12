package com.jb.leetcode.array.triangle;

import java.util.Arrays;

/**
 * Given an array consists of non-negative integers, your task is to count the number of triplets
 * chosen from the array that can make triangles if we take them as side lengths of a triangle.
 *
 * @Link https://leetcode.com/problems/valid-triangle-number/
 *
 * @author jbhushan
 */
public class ValidTriangleCount {

    public static void main(String[] args){

        int[] length = {2,2,3,4};
        count(length);

    }

    private static int count(int[] length){
        Arrays.sort(length);
        int count=0;
        for(int i=0; i<length.length-2; i++){
            int k =i+2;
            for(int j = i+1; j<length.length-1 & length[i] != 0; j++){
                while(k <length.length && length[i] +length[j] > length[k]){
                    k++;
                }
                count += k-j-1;
            }
        }

        System.out.println("Total triangles: "+count);
        return count;
    }
}
