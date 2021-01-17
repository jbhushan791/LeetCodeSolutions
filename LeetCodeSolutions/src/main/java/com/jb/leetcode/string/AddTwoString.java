package com.jb.leetcode.string;

/**
 * @author jbhushan
 */
public class AddTwoString {

    public static void main(String[] args){

    }

    public static String add(String s1, String s2){
        StringBuilder str = new StringBuilder();
        int l1 = s1.length()-1;
        int l2 = s2.length()-1;
        int carry =0;

        while(l1 >= 0 || l2 >= 0){
            int p = s1.charAt(l1)>0 ? s1.charAt(l1)-'0':0;
            int q = s2.charAt(l2)>0 ? s2.charAt(l2)-'0':0;
            int sum = (p+q+carry)%10;
            carry = (p+q+carry)/10;
            str.append(sum);
            l1--;
            l2--;
        }

        if(carry>0){
            str.append(carry);
        }

        return str.reverse().toString();
    }
}
