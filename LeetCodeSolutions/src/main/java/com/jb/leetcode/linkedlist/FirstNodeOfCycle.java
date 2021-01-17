package com.jb.leetcode.linkedlist;

/**
 *Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Notice that you should not modify the linked list.
 *
 * @Link https://leetcode.com/problems/linked-list-cycle-ii/
 *
 * @author jbhushan
 */
public class FirstNodeOfCycle {

    public static ListNode findFirstNode(ListNode head){
        ListNode pointer = head;
        ListNode fast = pointer;
        ListNode slow = pointer;
        boolean cycle = detectLoop(head, fast, slow);

        if(cycle){
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }

    public static boolean detectLoop(ListNode head, ListNode fast, ListNode slow ){

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
