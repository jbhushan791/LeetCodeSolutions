package com.jb.leetcode.array;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i
 * and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 * @link https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * @author jbhushan
 */
public class CountofSmallNumbers {

    public static void main(String[] args){
        int[] arr = {8,1,2,2,3};
        count(arr);
    }

    public static void count(int[] arr) {
       int count[] = new int[101];
       int result[] = new int[arr.length];
       for(int num : arr){
           count[num] = count[num]+1;
       }

       // update count of all smaller number including itself
       for(int i=1; i<count.length;i++){
           count[i] += count[i-1];
       }

       for(int i=0; i< arr.length; i++){
           if(arr[i] == 0){
               result[i]=0;
           } else {
               result[i] = count[arr[i]-1];
           }
       }

       for(int n : result){
           System.out.print(n+" ");
       }
    }

}
