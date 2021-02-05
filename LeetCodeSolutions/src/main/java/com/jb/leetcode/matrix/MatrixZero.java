package com.jb.leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jbhushan
 */
public class MatrixZero {

    public static void main(String[] args){

    }

    private void setZeros(int[][] matrix) {
      int r = matrix.length;;
      int c = matrix[0].length;
      Set<Integer> rows = new HashSet<Integer>();
      Set<Integer> cols = new HashSet<Integer>();

      for(int i=0; i<r; i++){
          for(int j=0; j<c; j++){
              rows.add(i);
              cols.add(j);
          }
      }

        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void efficientApproach(int[][] matrix){
        Boolean isCol = false;
        int r = matrix.length;;
        int c = matrix[0].length;

        for(int i=0; i<r; i++){
            if(matrix[i][0] == 0){
                isCol = true;
            }
            for(int j=1; j<c; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[0][j]==0 || matrix[i][0] == 0){
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j =0; j<c; j++){
                matrix[0][j]=0;
            }
        }

        if(isCol){
            for(int i=0; i<r; i++){
                matrix[i][0]=0;
            }
        }
    }
}
