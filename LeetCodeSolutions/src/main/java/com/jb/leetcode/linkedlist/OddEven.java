package com.jb.leetcode.linkedlist;

/**
 * @author jbhushan
 */
public class OddEven {

    public static void main(String[] args){
        ListNode head = new ListNode(19);
        ListNode n1 = new ListNode(29);
        ListNode n2 = new ListNode(39);
        ListNode n3 = new ListNode(49);
        ListNode n4 = new ListNode(59);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        OddEven oddEven = new OddEven();
        oddEven.oddEven(head);
    }

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
        print(head);
        return head;
    }

    private void print(ListNode head){
        int count=0;
        ListNode pointer = head;
        while(pointer!=null){
            count++;
            pointer = pointer.next;
        }
        pointer = head;
        while (count > 0 && pointer != null){
            System.out.print(pointer.val+" ");
            pointer = pointer.next;
            count--;
        }

    }
}
