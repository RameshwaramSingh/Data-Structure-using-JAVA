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

//leetcode ques no 230
https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

class Solution {

    // Inorder traversal is used
    
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }
    public TreeNode helper(TreeNode root, int k){
        if (root == null){
            return null;
        }
        TreeNode left = helper(root.left,k);
        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }
        return helper(root.right,k);
    }
}
