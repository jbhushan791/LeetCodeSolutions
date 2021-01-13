package com.jb.leetcode.array.rotate.matrix;

/**
 * @author jbhushan
 */
public class MatrixRotation {

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateAnticlockwise(matrix);
        System.out.println();
        rotateClockwise(matrix);
    }

    private static void rotateAnticlockwise(int[][] nums){

        for(int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        reverse(nums);
        transpose(nums);

        System.out.println("Anti clockwise");
        for(int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotateClockwise(int[][] nums){

        for(int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        transpose(nums);
        reverse(nums);

        System.out.println("Clockwise");
        for(int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[][] nums){
        // reverse
        for(int i=0; i<nums.length; i++){
            int k = nums.length-1;
            for(int j=0; j<k;k--,j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][k];
                nums[i][k] = temp;
            }
        }
    }

    public static void transpose(int[][] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }
}
