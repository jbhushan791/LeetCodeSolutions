package com.jb.leetcode.array.rotate;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * time complexity = O(n)
 * space complexity = O(1)
 *
 * @Link https://leetcode.com/problems/rotate-array/
 *
 * @author jbhushan
 */
public class RotateRightUsingGcd {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        rotateRight(nums,3);
    }

    private static int gcd(int n, int k){
        if(k ==0){
            return n;
        } else {
            return gcd(k, n%k);
        }
    }

    private  static void rotateRight(int[] nums, int k){
       int length = nums.length;
       int gcd = gcd(length, k);
        System.out.println("gdc: "+gcd);
       int temp=-1;
       int j =-1;
       int d = -1;
        for(int i =0; i<gcd; i++){
           j=i;
           temp = nums[i];
           while(true){
               d = (k+j);
               if (d >= length) {
                   // The element has to be shifted to its rotated position
                   d = d - length;
               }

               if(d == i){
                   break;
               }
               nums[j] = nums[d];
                j=d;
           }
            nums[j] = temp;
       }

       for(int num: nums){
           System.out.print(num+" ");
       }
    }


    private static void reverse(int[] nums, int left, int right){
       while(left<right){
           int temp = nums[left];
           nums[left] = nums[right];
           nums[right] = temp;
           left++;
           right--;
       }
    }
}
