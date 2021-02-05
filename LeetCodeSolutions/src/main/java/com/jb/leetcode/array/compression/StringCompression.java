package com.jb.leetcode.array.compression;

/**
 * @author jbhushan
 */
public class StringCompression {

    public static void main(String[] args){
        StringCompression strCompression = new StringCompression();

        char[] c = {'a','b','b','c','c','c'};
        System.out.println(strCompression.compression(c));

    }

    private int compression(char[] chars){
        int startIndex=0,write=0;
        for(int i=0; i< chars.length; i++){
            // if reached end or when different character appears
            if(i+1 == chars.length || chars[i+1]!= chars[i]){
                chars[write++]=chars[i];
                // This condition check if the given character count is greater than 1
                if(i>startIndex){
                    // Populate number in different cells (more than 1 digit number)
                    for(char c : Integer.toString(i-startIndex).toCharArray()){
                        chars[write++]=c;
                    }
                }
                // set the start index
               startIndex = i+1;
            }
        }
        return write;
    }
}
