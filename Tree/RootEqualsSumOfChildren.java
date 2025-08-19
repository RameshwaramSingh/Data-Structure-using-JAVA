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

// leetcode ques no 2236
https://leetcode.com/problems/root-equals-sum-of-children/description/

class Solution {
    public boolean checkTree(TreeNode root) {
        if(root == null ){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left!=null){
            sum = sum+root.left.val;
        }
        if(root.right!=null){
            sum = sum+root.right.val;
        }
        return(root.val == sum && checkTree(root.left) && checkTree(root.right));
    }
}
