package com.jb.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a last in first out (LIFO) stack using only two queues. The implemented stack
 * should support all the functions of a normal queue (push, top, pop, and empty).
 *
 * @Link https://leetcode.com/problems/implement-stack-using-queues/submissions/
 *
 * @author jbhushan
 */
public class StackUsing2Queues {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int top;

    public static void main(String[] args){

        StackUsing2Queues stack = new StackUsing2Queues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());

    }

    public void push(int num){
        q2.add(num);
        top = num;
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q2;
        q2=q1;
        q1=temp;
    }

    public int pop(){
        int x = q1.remove();
        if(!q1.isEmpty()){
            top = q1.peek();
        }
        return x;
    }

    public int top(){
        return top;
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }
}
