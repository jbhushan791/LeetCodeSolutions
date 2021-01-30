package com.jb.leetcode.string;

/**
 * Given an input string , reverse the string word by word.
 *
 * Note:
 *
 * A word is defined as a sequence of non-space characters.
 * The input string does not contain leading or trailing spaces.
 * The words are always separated by a single space.
 *
 * @Link https://leetcode.com/problems/reverse-words-in-a-string-ii
 * @author jbhushan
 */
public class ReverseString2 {

    public static void main(String[] args){
        ReverseString2 reverseString2 = new ReverseString2();
        char[] s ={'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        reverseString2.r(s);
    }

    public void r(char[] s){
        reverse(s, 0, s.length-1);
        reverseEachWord(s);
    }

    private void reverse(char[] s, int l, int r){
        char temp;
        while (l<r){
            temp = s[l];
            s[l]= s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }

    private void reverseEachWord(char[] s){
       int start = 0;
       int end = s.length-1;
        while (start < s.length-1){
            while (end < s.length-1 && s[end] != ' '){
                end++;
            }
            reverse(s, start, end-1);
            start = end+1;
            end++;
        }
    }
}
