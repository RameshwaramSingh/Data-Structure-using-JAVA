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

//leetcode ques no 110
https://leetcode.com/problems/balanced-binary-tree/description/

class Solution {
    public boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }

        // check left and right subtrees are balanced
        boolean LeftNode = isBalanced(node.left);
        boolean RightNode = isBalanced(node.right);

        // if either is false, return false immediately
        if (!LeftNode || !RightNode) {
            return false;
        }

        // check balance of current node
        int left = height(node.left);
        int right = height(node.right);
        int balance = left - right;

        return Math.abs(balance) <= 1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
