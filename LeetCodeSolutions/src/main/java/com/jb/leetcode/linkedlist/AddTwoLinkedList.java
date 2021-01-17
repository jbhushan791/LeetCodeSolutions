package com.jb.leetcode.linkedlist;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order, and each of their nodes contains a single digit. Add the two
 * numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself
 *
 * @Link https://leetcode.com/problems/add-two-numbers/
 * @author jbhushan
 */
public class AddTwoLinkedList {

    public static void main(String[] args){

    }

    private static ListNode add(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode one = l1;
        ListNode two = l2;
        int carry =0;
        // check for null .
        // Use 'or' because length might be differ i.e. one can be bigger than other
        while(one!=null || two!=null){
            // Due to difference in length one linked list might end early so put 0 as value
            int x = one != null?one.val:0;
            int y = two != null?two.val:0;
            int sum =x+y+carry;
            // update carry
            carry = sum /10;
            // put remainder as value
            current.next = new ListNode(sum%10);
            current = current.next;
            // check for null as it might end early so no need to increment
            if(one != null){
                one = one.next;
            }
            // check for null as it might end early so no need to increment
            if(two != null) {
                two = two.next;
            }
        }
        // if there is leftover carry then add to new node
        if(carry>0){
            current.next = new ListNode(carry);
        }
        // return actual head of linked list
        return dummyHead.next;
    }
}
