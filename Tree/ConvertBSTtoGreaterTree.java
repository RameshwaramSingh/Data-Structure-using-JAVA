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

// leetcode ques no 1038 or 538 both are same
https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
https://leetcode.com/problems/convert-bst-to-greater-tree/description/

class Solution {
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;

        // reverse inorder: right -> root -> left
        bstToGst(root.right);

        sum += root.val;
        root.val = sum;

        bstToGst(root.left);

        return root;
    }
}
