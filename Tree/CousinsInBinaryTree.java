/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//leetcode ques no 993
//https://leetcode.com/problems/cousins-in-binary-tree/description/

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);
        return(
            (level(root,xx,0)==level(root,yy,0)) && (!isSibling(root,xx,yy))
        );
    }
    TreeNode findNode(TreeNode node , int x){
        if(node == null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        TreeNode n = findNode(node.left,x);

        if(n!=null){
            return n;
        }
        return findNode(node.right,x);
    }

    boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        if(node == null){
            return false;
        }
        return(
            (node.left==x &&node.right == y) || (node.left==y && node.right == x) || isSibling(node.left,x,y) 
            || isSibling(node.right,x,y)
        );
    }

    int level(TreeNode node,TreeNode x, int lvl){
        if(node == null){
            return 0;
        }
        if(node == x){
            return lvl;
        }
        int l = level(node.left,x,lvl+1);
        if(l!=0){
            return l;
        }
        return level (node.right,x,lvl+1);
    }
}
