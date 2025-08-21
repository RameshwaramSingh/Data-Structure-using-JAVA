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

//leetcode ques no 222
https://leetcode.com/problems/count-complete-tree-nodes/description/

// brute force slolution
int countNode(TreeNode root){
  if(root == null){
  return 0;
}
else{
  return  return 1 + countNodes(root.left) + countNodes(root.right);
}

// efficient Solution  
class Solution {
    public int countNodes(TreeNode root) {
        int lh =0;  // left height
        int rh = 0; // right height
        TreeNode curr = root;
        while(curr!=null){
            lh++;
            curr = curr.left;
        }
        curr = root;
         while(curr!=null){
            rh++;
            curr = curr.right;
        }
        if(lh==rh){
            return (int)Math.pow(2,lh)-1; // type casting from double to int
        }
        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
}
