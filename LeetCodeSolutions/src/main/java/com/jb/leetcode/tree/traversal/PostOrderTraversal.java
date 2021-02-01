package com.jb.leetcode.tree.traversal;

import com.jb.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Link https://leetcode.com/problems/binary-tree-postorder-traversal
 *
 * @author jbhushan
 */
public class PostOrderTraversal {

    public static void main(String[] args){

    }

    private List<Integer> preorder(TreeNode t){
        List<Integer> postorder = new ArrayList<Integer>();
        helper(t,postorder);
        return postorder;
    }

    private void helper(TreeNode t, List<Integer> postorder) {
        if(t != null){
            if(t.left != null){
                helper(t.left,postorder);
            }
            if(t.right != null){
                helper(t.right,postorder);
            }
            postorder.add(t.val);
        }
    }
}
