package com.jb.leetcode.array.compression;

/**
 * @author jbhushan
 */
public class StringCompression {

    public static void main(String args){
        StringCompression strCompression = new StringCompression();

        char[] c = {'a','a','b','b','c','c','c'};
        System.out.println(strCompression.compression(c));

    }

    private int compression(char[] chars){
        int startIndex=0,write=0;
        for(int i=0; i< chars.length; i++){
            if(i+1 == chars.length || chars[i+1]!= chars[i]){
                chars[write++]=chars[i];
                if(i>startIndex){
                    for(char c : Integer.toString(i-startIndex).toCharArray()){
                        chars[write++]=c;
                    }
                }
               startIndex = i+1;
            }
        }
        return write;
    }
}
