package com.jb.leetcode.linkedlist;

/**
 * @author jbhushan
 */
public class OddEven {

    public ListNode oddEven(ListNode head){
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
