package com.jb.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * A linked list is given such that each node contains an additional random pointer which could
 * point to any node in the list or null.
 *
 * Return a deep copy of the list.
 *
 * The Linked List is represented in the input/output as a list of n nodes. Each node is
 * represented as a pair of [val, random_index] where:
 *
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to,
 * or null if it does not point to any node.
 *
 * @Link https://leetcode.com/problems/copy-list-with-random-pointer/
 * @author jbhushan
 */
public class Clone {

    public static void main(String[] args){
        Node head = new Node(9);
        Node n1 = new Node(19);
        Node n2 = new Node(29);
        Node n3 = new Node(39);
        Node n4 = new Node(49);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head.random=n2;
        n2.random=n3;
        n3.random=n1;

        Clone clone = new Clone();
        clone.clone3(head);


    }

    public Node clone(Node head){
        Map<Node, Node> map = new HashMap<>();
        Node pointer = head;
        Node dummy = new Node(0);
        Node clone = dummy.next;

        while(pointer!=null){
            clone = new Node(pointer.val);
            map.put(pointer,clone);
            pointer = pointer.next;
            clone = clone.next;
        }
        pointer=head;
        clone = dummy.next;
        while(pointer!=null && clone.next!=null){

        }

        return dummy.next;
    }

    public Node clone2(Node head){


        return null;
    }

    /**
     * BEST METHOD
     * @param head
     * @return
     */
    public Node clone3(Node head){
        Node current = head;
        Node temp = null;

        // Create new node for each corresponding node and
        // point next of current node to new node
        // point new node next to current node next
        while(current!=null){
            temp = new Node(current.val);
            temp.next = current.next;
            current.next = temp;
            current = temp.next;
        }

        // set random node
        Node c = head;
        while(c != null){
            c.next.random = c.random != null?c.random.next:null;
            c = c.next.next;
        }

        // Reassign the same group
        Node oldPointer = head;
        Node newPointer = head.next;
        Node oldHead =  head.next;
        while(oldPointer !=null){
            oldPointer.next = oldPointer.next.next;
            newPointer.next = newPointer.next != null? newPointer.next.next:null;
            oldPointer = oldPointer.next;
            newPointer = newPointer.next;
        }

        System.out.println("Even");
        print(oldHead);

        return oldHead;


    }

        private Node split(Node head) {

            Node odd = head;
            Node even = head.next;
            Node evenHead = even;

            while(even!=null && even.next!=null){
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }

            //odd.next = evenHead;
            return evenHead;
        }

        private static void print(Node head){
            int count=0;
            Node pointer = head;
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
