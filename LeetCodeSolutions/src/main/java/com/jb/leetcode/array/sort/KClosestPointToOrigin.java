package com.jb.leetcode.array.sort;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 *
 * @author jyotibhushan
 */
public class KClosestPointToOrigin {

    public static void main(String[] args){
        KClosestPointToOrigin origin = new KClosestPointToOrigin();

        int[][] points = {{1,3},{-2,2}};
        origin.getClosestPoints(points, 1);

    }

    private int[][] getClosestPoints(int[][] points, int k){
        int len = points.length;
        int[] dist = new int[len];
        for(int i=0; i<len; i++){
            dist[i] = calculateDist(points[i]);
        }

        Arrays.sort(dist);
        int distAtK = dist[k-1];

        int[][] results = new int[k][2];
        int t =0;
        for(int i=0; i<len; i++){
            if(distAtK >= calculateDist(points[i])){
                results[t] = points[i];
                t++;
            }
        }

        for(int[] p: results){
            for(int i : p){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        return results;
    }

    private int calculateDist(int[] point) {
        return point[0]*point[0] + point[1]*point[1];
    }

}
