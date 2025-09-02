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

//leetcode ques no 687
https://leetcode.com/problems/longest-univalue-path/

class Solution {
    int maxlen = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return maxlen;
    }
    private int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftPath = 0;
        int rightPath = 0;

        if(node.left!=null && node.left.val == node.val){
            leftPath = left + 1;
        }

        if(node.right!=null && node.right.val == node.val){
            rightPath = right+1;
        }

        maxlen = Math.max(maxlen,leftPath+rightPath);

        return Math.max(leftPath,rightPath);
    }
}
