package com.jb.leetcode.array.sort;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortStringByCount {

    public static void main(String[] args){

        SortStringByCount sortStringByCount = new SortStringByCount();

        sortStringByCount.sort("cccaaa");

        sortStringByCount.sort("Aabb");

    }

    private String sort(String s){
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }


        int max = Collections.max(map.values());

        List<List<Character>> buckets = new ArrayList<List<Character>>();
        for(int i=0; i<= max; i++){
            buckets.add(new ArrayList<Character>());
        }

        for(Character key : map.keySet()){
            int freq = map.get(key);
            buckets.get(freq).add(key);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = buckets.size()-1; i>=1; i--){
            for (Character c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }
        System.out.println(" Bucket sort "+sb.toString());
        return sb.toString();
    }
}
