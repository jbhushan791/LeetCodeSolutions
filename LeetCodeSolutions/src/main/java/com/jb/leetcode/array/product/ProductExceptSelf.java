package com.jb.leetcode.array.product;

/**
 * @author jbhushan
 */
public class ProductExceptSelf {

    public static void main(String[] mains){
        ProductExceptSelf p = new ProductExceptSelf();

        int[] nums = {1,2,3,4};
        p.productExceptSelf(nums);

    }

    public void productExceptSelf(int[] nums){
        int[] left = new int[nums.length];

        // left product of array
        left[0] = 1;
        for(int i=1; i< nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        int r = 1;
        for(int i= nums.length-1; i>=0; i--){
            left[i] = left[i] *r;
            r = r * nums[i];
        }

        for(int prod : left){
            System.out.print(prod+" ");
        }
    }
}
