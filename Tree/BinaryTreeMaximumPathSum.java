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

//leetcode ques no 124

class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);  // these both are used when the node value is negative
        right = Math.max(0,right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans,pathSum);

        return Math.max(left,right) + node.val;
    }
}
