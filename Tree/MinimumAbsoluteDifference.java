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

//leetcode ques no 530
https://leetcode.com/problems/minimum-absolute-difference-in-bst/

class Solution {
    Integer prev = null; // global variable to keep the track of previous value
    int minDiff= Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    void inorder(TreeNode node){
        if(node == null){
            return;
        }

        //left subtree
        inorder(node.left);

        //process currrent node
        if(prev!=null){
            minDiff = Math.min(minDiff, node.val-prev);
        }

        prev = node.val;

        // right subtree
        inorder(node.right);
    }
}
