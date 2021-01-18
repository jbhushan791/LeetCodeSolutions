package com.jb.leetcode.linkedlist;

/**
 * @author jbhushan
 */
public class ReverseLinkedList {

    public static void main(String[] args){

        ListNode l2 = new ListNode(0,null);
        ListNode l1 = new ListNode(8,l2);
        ListNode head = new ListNode(7,l1);

        ListNode h = reverse(head);

        System.out.print(h.val + " "+h.next.val+ " "+h.next.next.val );

        ListNode k = reverse(null, h);
        System.out.print(k.val + " "+k.next.val+ " "+k.next.next.val );

    }

    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode next = null;
        ListNode prev=null;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static ListNode reverse(ListNode prev, ListNode cur){
        if(cur != null){
            reverse(cur, cur.next);
            cur.next =prev;
        }
        return cur;
    }
}
