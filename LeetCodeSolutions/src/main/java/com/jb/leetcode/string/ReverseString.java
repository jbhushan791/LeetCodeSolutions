package com.jb.leetcode.string;

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated
 * by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include
 * any extra spaces.
 *
 * @Link https://leetcode.com/problems/reverse-words-in-a-string/
 *
 * @author jbhushan
 */
public class ReverseString {

    public static void main(String[] args){
        ReverseString reverseString2 = new ReverseString();
        String s = "the sky is blue";
        reverseString2.reverseWords(s);
    }

    public void reverseWords(String s){

        StringBuilder sb = trimSpaces(s);
        reverse(sb, 0, sb.length()-1);
        reverseEachWord(sb);

        System.out.println(sb.toString());
    }

    private StringBuilder trimSpaces(String s){

        int l = 0;
        int r = s.length()-1;

        while(l<=r && s.charAt(l) == ' '){
            l++;
        }

        while(l<=r && s.charAt(r) == ' '){
           r--;
        }

        StringBuilder sb = new StringBuilder();
        while(l<=r){
            char c = s.charAt(l);
            if(c != ' '){
                sb.append(c);
            } else if(sb.charAt(sb.length()-1) != ' '){
                sb.append(c);
            }
            l++;
        }
        return sb;
    }

    public void reverse(StringBuilder sb, int l, int r){
        while(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;
            r--;
        }
    }

    public void reverseEachWord(StringBuilder sb){
        int len = sb.length();
        int start = 0;
        int end =0;

        while(start< len){
            while(end < len && sb.charAt(end) != ' '){
                end++;
            }
            reverse(sb, start, end-1);
            start = end +1;
            end++;
        }
    }

}
