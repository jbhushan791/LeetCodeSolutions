package com.jb.leetcode.string;

/**
 * Given a string s, determine if it is valid.
 *
 * A string s is valid if, starting with an empty string t = "", you can transform t
 * into s after performing the following operation any number of times:
 *
 * Insert string "abc" into any position in t. More formally, t becomes tleft + "abc" +
 * tright, where t == tleft + tright. Note that tleft and tright may be empty.
 * Return true if s is a valid string, otherwise, return false.
 *
 * @Link https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
 * @author jbhushan
 */
public class ValidSubstitution {

    public static void main(String[] args){

        System.out.println(validSubstitution("aabcbc"));

        System.out.println(validSubstitution("abccba"));

    }

    private static boolean validSubstitution(String str){
        if(str.equals("")){
            return true;
        } else {
            if(str.contains("abc")){
                str = str.replace("abc","");
                return validSubstitution(str);
            } else {
                return false;
            }
        }
    }
}
