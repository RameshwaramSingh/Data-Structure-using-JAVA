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

// leetcode ques no 1448
https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

class Solution {
    int count =0;
    public int goodNodes(TreeNode root) {
        countNode(root,root.val);
        return count;
    }

    private void countNode(TreeNode node, int maxSoFar){
        if(node == null){
            return;
        }
        if(node.val>=maxSoFar){
            count++;
        }

        int newMax = Math.max(maxSoFar, node.val);

        countNode(node.left,newMax);
        countNode(node.right,newMax);
    }
}
