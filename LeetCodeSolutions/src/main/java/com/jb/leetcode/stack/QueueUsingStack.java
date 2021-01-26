package com.jb.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue
 * (push, peek, pop, and empty).
 *
 * @Link https://leetcode.com/problems/implement-queue-using-stacks/
 *
 * @author jbhushan
 */
public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<>();
    private int front;

    public static void main(String[] args){

        QueueUsingStack stack = new QueueUsingStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());

    }

    public void push(int x){
        while(s1.isEmpty()){
            front = x;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop(){
        int x = s1.pop();
        if(!s1.isEmpty()){
            front = s1.peek();
        }
        return x;
    }

    public int top(){
        return front;
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
}
