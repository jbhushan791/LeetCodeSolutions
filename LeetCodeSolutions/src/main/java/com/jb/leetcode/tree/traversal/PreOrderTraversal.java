package com.jb.leetcode.tree.traversal;

import com.jb.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Link https://leetcode.com/problems/binary-tree-preorder-traversal
 *
 * @author jbhushan
 */
public class PreOrderTraversal {

    public static void main(String[] args){

    }

    private List<Integer> preorder(TreeNode t){
        List<Integer> preorder = new ArrayList<Integer>();
        helper(t,preorder);
        return preorder;
    }

    private void helper(TreeNode t, List<Integer> preorder) {
        if(t != null){
            preorder.add(t.val);
            if(t.left != null){
                helper(t.left,preorder);
            }
            if(t.right != null){
                helper(t.right,preorder);
            }
        }
    }
}
