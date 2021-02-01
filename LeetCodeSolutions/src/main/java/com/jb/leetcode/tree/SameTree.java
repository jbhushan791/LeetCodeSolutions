package com.jb.leetcode.tree;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the
 * same or not.
 *
 * Two binary trees are considered the same if they are structurally identical,
 * and the nodes have the same value.
 *
 * @Link https://leetcode.com/problems/same-tree/
 *
 * @author jbhushan
 */
public class SameTree {

    private boolean isSameTree(TreeNode t1, TreeNode t2){

        if(t1 == null && t2 == null){
            return true;
        }

        if(t1 == null || t2 == null){
            return false;
        }


        return (t1.val == t2.val) && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
}
