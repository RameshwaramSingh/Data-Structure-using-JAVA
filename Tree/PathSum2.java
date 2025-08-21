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

// leetcode ques no 113
https://leetcode.com/problems/path-sum-ii/description/

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,targetSum,new ArrayList<>(), ans);
        return ans;
    }
    private void helper(TreeNode node, int target, List<Integer> path,List<List<Integer>>ans){
        if(node == null){
            return;
        }

        path.add(node.val);

        // if it's a leaf node and target - val = 0 -> valid path
        if(node.left == null && node.right == null && target == node.val){
            ans.add(new ArrayList<>(path)); // add copy of current path
        }
        else{
            helper(node.left,target-node.val,path,ans);
            helper(node.right,target-node.val,path,ans);
        }

        //backtrack
        path.remove(path.size()-1); // if value is greater than sum remove the value from list
    }
}
