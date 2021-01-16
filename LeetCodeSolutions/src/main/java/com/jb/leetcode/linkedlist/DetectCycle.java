package com.jb.leetcode.linkedlist;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * @Link https://leetcode.com/problems/linked-list-cycle/solution/
 * @author jbhushan
 */
public class DetectCycle {

    public static boolean detectLoop(ListNode head){

        ListNode pointer = head;
        ListNode fast = pointer;
        ListNode slow = pointer;

        while(slow!=null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
