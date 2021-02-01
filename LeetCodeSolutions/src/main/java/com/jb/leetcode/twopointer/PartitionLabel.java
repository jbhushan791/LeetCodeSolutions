package com.jb.leetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

/**
 * A string S of lowercase English letters is given. We want to partition this string into
 * as many parts as possible so that each letter appears in at most one part, and return a
 * list of integers representing the size of these parts.
 *
 * @link https://leetcode.com/problems/partition-labels/
 *
 * @author jbhushan
 */
public class PartitionLabel {

    public static void main(String[] args){
        PartitionLabel pl = new PartitionLabel();
        pl.partitionLabels("ababcbacadefegdehijhklij");

    }

    private List<Integer> partitionLabels(String str){

        // maintain the last index of occurrence of any character
        int[] lastIndex = new int[26];
        for(int i=0; i<str.length(); i++){
            lastIndex[str.charAt(i)-'a'] =i;
        }

        // partition whenever last occurrence of any character is found
        List<Integer> result = new ArrayList<Integer>();
        int j =0;
        int start=0;
        for(int i=0; i<str.length(); i++){
            j = Math.max(j, lastIndex[str.charAt(i)-'a']);
            if(i==j){
                // adding 1 because index is 1 smaller than actual length
                result.add(i-start+1);
                // set start
                start = i+1;
            }
        }
        for(int n : result){
            System.out.print(" "+n);
        }
        return result;
    }

}
