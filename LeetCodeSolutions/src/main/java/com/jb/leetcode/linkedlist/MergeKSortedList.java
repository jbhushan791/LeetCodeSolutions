package com.jb.leetcode.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * You are given an array of k linked-lists lists,
 * each linked-list is sorted in ascending order.
 *
 * @Link https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * @author jbhushan
 */
public class MergeKSortedList {

    public static ListNode merge(ListNode[] heads){

        ListNode head = null;
        ListNode last = null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
           new Comparator<ListNode>(){
               @Override
               public int compare(ListNode o1, ListNode o2) {
                   return o1.val-o2.val;
               }
           }
        );

        // Puh first node of all linked list and form minheap
        for(int i=0; i< heads.length; i++){
            if(heads[i] !=null){
                pq.add(heads[i]);
            }
        }

        while(pq != null){
            //get the first element of priority queue
            ListNode top = pq.peek();
            pq.remove();

            // push next element into heap
            if(top.next != null){
                pq.add(top.next);
            }
            if(head == null){
                head = top;
                last =  top;
            } else {
                last.next = top;
            }
            last = top;
        }
        return head;
    }
}
