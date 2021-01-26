package com.jb.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Implement a last in first out (LIFO) stack using only two queues. The implemented stack
 * should support all the functions of a normal queue (push, top, pop, and empty).
 *
 * @Link https://leetcode.com/problems/implement-stack-using-queues/submissions/
 *
 * @author jbhushan
 */
public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args){

        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());

    }

    public void push(int num){
        queue.add(num);
        int size = queue.size();
        while(size > 1){
            queue.add(queue.remove());
            size--;
        }
    }

    public int pop(){
        return queue.remove();
    }

    public int top(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
