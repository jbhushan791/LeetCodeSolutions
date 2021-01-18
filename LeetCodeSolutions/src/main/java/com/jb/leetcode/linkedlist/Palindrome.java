package com.jb.leetcode.linkedlist;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * @Link https://leetcode.com/problems/palindrome-linked-list/
 * @author jbhushan
 */
public class Palindrome {

    public static void main(String[] args){

        ListNode head = new ListNode(59);
        ListNode n1 = new ListNode(49);
        ListNode n2 = new ListNode(39);
        ListNode n3 = new ListNode(49);
        ListNode n4 = new ListNode(59);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Palindrome p = new Palindrome();
        System.out.println(p.palindrome(head));

    }

    public boolean palindrome(ListNode head) {
        ListNode middle = MiddleElement.findMiddleUsingTwoPointer(head);
        if(middle == null || middle.next == null){
            return true;
        }

        // break into two lists
        ListNode secondHalf = middle.next;
        middle.next = null;

        ReverseLinkedList.reverse(secondHalf);

        boolean result = compareList(head, secondHalf);

        ReverseLinkedList.reverse(null,secondHalf);
        middle.next = secondHalf;
        return result;
    }

    boolean compareList(ListNode l1, ListNode l2){
        while(l2 != null && l1.val != l1.val){
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l2 == null){
            return true;
        }

        return false;
    }


}
