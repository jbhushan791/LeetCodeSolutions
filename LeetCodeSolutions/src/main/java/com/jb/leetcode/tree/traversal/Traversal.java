package com.jb.leetcode.tree.traversal;

import com.jb.leetcode.tree.TreeNode;

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
public class Traversal {

    public static void main(String[] args){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        Traversal traversal = new Traversal();

        System.out.println("PREORDER");
        traversal.preOrder(tree);
        System.out.println();

        System.out.println("INORDER");
        traversal.inOrder(tree);
        System.out.println();

        System.out.println("POSTORDER");
        traversal.postOrder(tree);
        System.out.println();
    }


    private void preOrder(TreeNode t){

        if(t!=null){
            System.out.print(t.val+" ");
            preOrder(t.left);
            preOrder(t.right);
        }
    }

    private void inOrder(TreeNode t){

        if(t!=null){
            inOrder(t.left);
            System.out.print(t.val+" ");
            inOrder(t.right);
        }
    }

    private void postOrder(TreeNode t){

        if(t!=null){
            postOrder(t.left);
            postOrder(t.right);
            System.out.print(t.val+" ");
        }
       // System.out.println();
    }
}
