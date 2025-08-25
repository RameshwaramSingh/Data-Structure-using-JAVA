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

//leetcode ques no 404
https://leetcode.com/problems/sum-of-left-leaves/

class Solution {
   public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0;
    int sum = 0;

    if (root.left != null) {
        // check if left is a leaf
        if (root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }
    }
    sum += sumOfLeftLeaves(root.right);

    return sum;
}

}
