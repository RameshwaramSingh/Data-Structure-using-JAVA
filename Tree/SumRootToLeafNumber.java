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
//leetcod ques no 129
https://leetcode.com/problems/sum-root-to-leaf-numbers/

class Solution {
    public int sumNumbers(TreeNode root) {
        return helper (root,0);
    }
    int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = sum*10+node.val;
        if(node.left == null && node.right == null){
            return sum;
        }
        return helper(node.left,sum) + helper(node.right,sum);
    }
}
