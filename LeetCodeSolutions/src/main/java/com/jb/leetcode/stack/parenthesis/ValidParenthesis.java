package com.jb.leetcode.stack.parenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
 * if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * @Link https://leetcode.com/problems/valid-parentheses/
 * @author jbhushan
 */
public class ValidParenthesis {

    public static void main(String[] args){

    }

    private boolean isParenthesisValid(String s){

        // Maintain all parenthesis in map, closing as key and opening as value
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                Character top = stack.isEmpty()?'#': stack.pop();
                if(top != c){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return true;
    }

    private boolean isBalanced(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(check(c , sb)){
                sb.replace(sb.length()-1, sb.length(), "");
                sb.trimToSize();
            } else {
                sb.append(c);
            }
        }
        return  sb.length() == 0;
    }

    private boolean check(Character c, StringBuilder sb){
        if(sb.length() > 0){
            Character prev = sb.charAt(sb.length()-1);
            // System.out.println("Current "+c+" Befire "+prev);
            switch(c){
                case ')':
                    if(prev == '('){
                        return true;
                    }
                case ']':
                    if(prev == '['){
                        return true;
                    }
                case '}':
                    if(prev == '{'){
                        return true;
                    }
            }
        }
        return false;
    }
}
