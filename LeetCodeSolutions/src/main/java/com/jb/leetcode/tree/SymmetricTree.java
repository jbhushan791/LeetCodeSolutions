package com.jb.leetcode.tree;

/**
 *Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its
 * center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 * @Link https://leetcode.com/problems/symmetric-tree/
 *
 * @author jbhushan
 */
public class SymmetricTree {

    private boolean isSymmetric(TreeNode t){
        return isMirror(t,t);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) &&
                isMirror(t1.left, t2.right) &&
                isMirror(t1.right, t2.left);
    }
}
