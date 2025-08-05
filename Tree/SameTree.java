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

//leetcde ques no 100
https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //chatgpt
        // Both null => same
        if (p == null && q == null) return true;

        // One is null, one is not => not same
        if (p == null || q == null) return false;

        // Values not equal => not same
        if (p.val != q.val) return false;

        // Recurse on left and right
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
