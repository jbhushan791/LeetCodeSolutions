package com.jb.leetcode.tree;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter
 * of a binary tree is the length of the longest path between any two nodes in a tree. This path
 * may or may not pass through the root.
 *
 * @Link https://leetcode.com/problems/diameter-of-binary-tree/
 *
 * @author jbhushan
 */
public class Diameter {


    int diameter = 1;

    private int diameter(TreeNode t){

       getDiameter(t);
       return diameter-1;
    }

    private int getDiameter(TreeNode t) {
        if(t==null){
            return 0;
        }
        int l = getDiameter(t.left);
        int r = getDiameter(t.right);
        diameter = Math.max(l+r+1,diameter);
        return Math.max(l,r)+1;
    }
}
