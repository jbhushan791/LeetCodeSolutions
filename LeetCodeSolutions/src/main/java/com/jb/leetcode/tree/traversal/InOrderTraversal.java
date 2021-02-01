package com.jb.leetcode.tree.traversal;

import com.jb.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Link https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * @author jbhushan
 */
public class InOrderTraversal {

    public static void main(String[] args){

    }

    private List<Integer> inorder(TreeNode t){
        List<Integer> inorder = new ArrayList<Integer>();
        helper(t,inorder);
        return inorder;
    }

    private void helper(TreeNode t, List<Integer> inorder) {
        if(t != null){
            if(t.left != null){
                helper(t.left,inorder);
            }
            inorder.add(t.val);
            if(t.right != null){
                helper(t.right,inorder);
            }
        }
    }
}
