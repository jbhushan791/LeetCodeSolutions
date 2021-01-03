package com.jb.leetcode.array.majority;

import java.util.ArrayList;
import java.util.List;

/**
 * return majority elements from array where count > n/3
 *
 * @author jbhushan
 */
public class MajorityElement2 {

    public static void main(String[] args){
        int[] arr = {1,5,5,5,5,4,4,4,4,4,5,5,6,6};

        List<Integer> result = findMajorityUsingMoore(arr);

        for(Integer n : result){
            System.out.println(n);
        }
    }

    public static List<Integer> findMajorityUsingMoore(int[] arr) {
        Integer voter1=null;
        int counter1 = 0;

        Integer voter2=null;
        int counter2 = 0;

        for(int num: arr){
            if(voter1 != null && voter1 == num){
                counter1++;
            } else if(voter2 != null && voter2 == num){
                counter2++;
            } else if(counter1 == 0){
                voter1 = num;
                counter1++;
            }else if(counter2 == 0){
                voter2 = num;
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }

        List<Integer> list = new ArrayList<Integer>(2);
        counter1 = 0;
        counter2 = 0;

        for(int n : arr){
            if (n == voter1) {
                counter1++;
            } else if (n == voter2) {
                counter2++;
            }
        }

        if(counter1 > arr.length/3){
            list.add(voter1);
        }

        if(counter2 > arr.length/3){
            list.add(voter2);
        }

        return list;
    }

}
