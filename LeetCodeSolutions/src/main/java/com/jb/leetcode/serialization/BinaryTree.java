package com.jb.leetcode.serialization;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jyotibhushan
 */
public class BinaryTree {

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

//        TreeNode treeNode = new TreeNode(1);
//        treeNode.left
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    private String serialize(TreeNode node, String s){
        Integer val = node.val;
        if(val == null){
            s += s+"null,";
        } else {
            s += s+val+",";
            s += serialize(node.left, s);
            s += serialize(node.right, s);
        }

        System.out.println("Serialized: "+s);
        return s;
    }

    private TreeNode deserialize(String s){
        Queue<String> queue = new LinkedList<String>();
        queue.addAll(Arrays.asList(s.split(",")));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String val = queue.remove();
        if(val.equals("null")){
            return null;
        } else {
            TreeNode treeNode = new TreeNode(Integer.valueOf(val));
            treeNode.left = buildTree(queue);
            treeNode.right = buildTree(queue);
            return treeNode;
        }
    }
}
