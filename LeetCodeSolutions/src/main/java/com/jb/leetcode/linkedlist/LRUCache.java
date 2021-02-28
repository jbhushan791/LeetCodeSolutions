package com.jb.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU)
 * cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise,
 * add the key-value pair to the cache. If the number of keys exceeds the capacity from
 * this operation, evict the least recently used key.
 *
 * @Link https://leetcode.com/problems/lru-cache
 *
 * @author jbhushan
 */
public class LRUCache {

    class DlinkedNode{
        int key;
        int val;
        DlinkedNode prev;
        DlinkedNode next;
    }

    /**
     * This method is used to add given node to the head
     * @param node
     */
    private void addNode(DlinkedNode node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    /**
     * This method is used to remove give node
     * @param node
     */
    private void removeNode(DlinkedNode node){
        DlinkedNode prev = node.prev;
        DlinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void moveNodeToHead(DlinkedNode node){
        removeNode(node);
        addNode(node);
    }

    private DlinkedNode popTail(){
        DlinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

    private Map<Integer, DlinkedNode> cache = new HashMap<Integer, DlinkedNode>();
    int size;
    int capacity;
    DlinkedNode head;
    DlinkedNode tail;

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.head = new DlinkedNode();
        this.tail = new DlinkedNode();

        head.next = tail;
        tail.prev=head;
    }

    public int get(int key){
        DlinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }
        // since it is most recently used, move to head
        moveNodeToHead(node);
        return node.val;
    }

    public void put(Integer key, Integer val){
        // check if key exists or not
        DlinkedNode node = cache.get(key);
        if(node == null){
            DlinkedNode newNode = new DlinkedNode();
            newNode.val = val;
            newNode.key = key;
            cache.put(key, newNode);
            addNode(newNode);
            size++;
            //check for capacity
            if(size > capacity){
                DlinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            }
        } else {
            node.val = val;
            moveNodeToHead(node);
        }

    }
}
