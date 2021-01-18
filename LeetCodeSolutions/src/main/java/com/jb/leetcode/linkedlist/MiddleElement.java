package com.jb.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of
 * linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * @Link https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * @author jbhushan
 */
public class MiddleElement {
    public static void main(String[] args){
        ListNode l3 = new ListNode(11,null);
        ListNode l2 = new ListNode(0,null);
        ListNode l1 = new ListNode(8,l2);
        ListNode head = new ListNode(7,l1);
        findMiddle(head);
        findMiddleUsingMap(head);
        findMiddleUsingTwoPointer(head);
    }

    private static void findMiddle(ListNode head){
        ListNode pointer = head;
        int count=0;
        while(pointer != null){
            count++;
            pointer = pointer.next;
        }
        System.out.println("Size "+count);
        int middle = count/2;
        while(middle>0){
            middle--;
            head = head.next;
        }
        System.out.println("Middle Element "+head.val);
    }

    private static void findMiddleUsingMap(ListNode head){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ListNode pointer = head;
        int count=0;
        while(pointer != null){
            map.put(  count++, pointer.val);
            pointer = pointer.next;
        }
        System.out.println("Size "+map.size());
        System.out.println("Middle Element "+map.get(map.size()/2));
    }

    public static ListNode findMiddleUsingTwoPointer(ListNode head){
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle Element "+slowPointer.val);

        return slowPointer;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        ListNode frontPoint = pointer;
        ListNode backPoint = pointer;
        for(int i=1; i<=n+1; i++){
            frontPoint = frontPoint.next;
        }

        while(frontPoint != null){
            backPoint = backPoint.next;
            frontPoint = frontPoint.next;
        }

        backPoint.next =   backPoint.next.next;

        return pointer;

    }
}
