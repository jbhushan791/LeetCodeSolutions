package com.jb.leetcode.array.majority;

/**
 * Determine whether the give number is majority element in the given array
 *
 * @author jbhushan
 */
public class MajorityElement {

    public static void main(String[] args){
        int[] arr = {1,5,5,5,5,5,5,5,5,5,5,5,6,6};

        long start = System.currentTimeMillis();
        boolean isMajority = isMajority(arr, 6);
        long stop = System.currentTimeMillis();
        System.out.println(isMajority + " ");
        System.out.println(stop-start);

        long s = System.currentTimeMillis();
        isMajority = isMajorityUsingBinarySearch(arr, 6);
        long st = System.currentTimeMillis();
        System.out.println(isMajority);
        System.out.println(st-s);

    }

    public static boolean isMajority(int[] arr, int target) {
        int l = 0;
        if(arr.length % 2 == 0){
            l = arr.length/2;
        } else {
           l = (arr.length/2) +1;
        }
        for(int i=0; i<l; i++){
            if(target ==arr[i]  && arr[i] == arr[i+((arr.length/2))]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMajorityUsingBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        int mid = 0;

        // Using Binary Search, find the first index of the target present in array
        while(left <= right){
             mid = left + (right-left)/2;
            if(arr[mid] == target){
                // if array is reached till first index or mid-1 is
                // not equal to target then it is not majority element
                if(mid == 0 || arr[mid-1] != target){
                    break;
                }
                right = mid-1;
            } else if(arr[mid] < target){
                left = mid+1;
            } else if(arr[mid+1] > target){
                right = mid-1;
            }
        }
        return mid + arr.length/2 < arr.length && arr[mid + arr.length/2 ] == target;
    }

    public static int count(int start, int end, int[] nums, int count, int target){
        for(int i = start; i<end; i++){
            if(target == nums[i]){
                count++;
            }
        }
        return count;
    }

}
