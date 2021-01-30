package com.jb.leetcode.character;

/**
 * @author jbhushan
 */
public class DeciBinaryNumber {

    public static void main(String[] args){
        DeciBinaryNumber deciBinaryNumber = new DeciBinaryNumber();
        System.out.println(deciBinaryNumber.max("11879"));

    }

    public int max(String str){
        Integer max = Integer.MIN_VALUE;
        for(char c : str.toCharArray()){
            max = Math.max(max, c-'0');
        }

        return max;
    }
}
