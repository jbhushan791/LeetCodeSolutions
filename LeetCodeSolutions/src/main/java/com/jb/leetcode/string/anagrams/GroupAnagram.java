package com.jb.leetcode.string.anagrams;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer
 * in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * phrase, typically using all the original letters exactly once.
 *
 * @Link https://leetcode.com/problems/group-anagrams/
 *
 * @author jbhushan
 */
public class GroupAnagram {

    public static void main(String[] args){
        GroupAnagram ga = new GroupAnagram();
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        ga.groupAnagrams(str);

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length ==0){
            return  new ArrayList<>();
        }
        // MAp to store same str as key and list of anagrams
        Map<String, List<String>> result = new HashMap<String, List<String>>();
        int[] count = new int[26];
        for(String s: strs){
            // reset count to 0 for every string
            Arrays.fill(count,0);
            // get count of each character in given string
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            // form a string
            for(int i =0; i<26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            // check for same string in map and update accordingly
            if(!result.containsKey(sb.toString())){
                result.put(sb.toString(), new ArrayList());
            }
            result.get(sb.toString()).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
