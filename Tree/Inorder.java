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


//leetcode ques no94
https://leetcode.com/problems/binary-tree-inorder-traversal/description/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public static void inorder(TreeNode node,List<Integer> result){
        if(node == null){
            return;
        }
        inorder(node.left,result);
        result.add(node.val);
        inorder(node.right,result);
    }
}
