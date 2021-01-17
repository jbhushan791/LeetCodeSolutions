package com.jb.leetcode.linkedlist;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * @Link https://leetcode.com/problems/intersection-of-two-linked-lists/
 * @author jbhushan
 */
public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        int l1 = length(p1);

        int l2 = length(p2);

        int extraLength = Math.abs(l1 - l2);
        p1 = headA;
        p2 = headB;
        return l1 > l2 ? getIntersectedNode(p1, p2, extraLength)
                : getIntersectedNode(p2, p1, extraLength);

    }

    private int length(ListNode node) {
        int l = 0;
        while (node != null) {
            l++;
            node = node.next;
        }
        return l;
    }

    private ListNode getIntersectedNode(ListNode h1, ListNode h2, int extraLength) {

        while (extraLength > 0) {
            extraLength--;
            h1 = h1.next;
        }

        while (h1 != h2) {
            h1 = h1.next;
            h2 = h2.next;
        }
        return h1;
    }
}
