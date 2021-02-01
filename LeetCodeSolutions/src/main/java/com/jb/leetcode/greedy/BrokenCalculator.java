package com.jb.leetcode.greedy;

/**
 * On a broken calculator that has a number showing on its display, we can perform two
 * operations:
 *
 * Double: Multiply the number on the display by 2, or;
 * Decrement: Subtract 1 from the number on the display.
 * Initially, the calculator is displaying the number X.
 *
 * Return the minimum number of operations needed to display the number Y.
 *
 *
 * @Link https://leetcode.com/problems/broken-calculator/
 * @author jbhushan
 */
public class BrokenCalculator {

    public static void main(String[] args){
        BrokenCalculator brokenCalculator = new BrokenCalculator();
       System.out.println(brokenCalculator.operationCount(2,3));
    }

    public int operationCount(int x, int y){
        int count=0;
        while(y > x){
            count++;
            if(y % 2 == 0){
                y = y/2;
            } else {
                y++;
            }
        }
        return count + x-y;
    }
}
