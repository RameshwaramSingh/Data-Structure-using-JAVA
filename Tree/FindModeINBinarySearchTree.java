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

// leetcode ques no 501
https://leetcode.com/problems/find-mode-in-binary-search-tree/description/

class Solution {
    Integer currValue = 0; // this is used to denote hte current value
    int count = 0;
    int maxCount = 0;
    List<Integer> ans = new ArrayList<>();

    void handleValue(int val){

        // function is used to count the frequency

        if(currValue != null && val == currValue){
            count++;
        }
        else{
            count = 1;
        }

        if(count>maxCount){
            maxCount = count;
            ans.clear();
            ans.add(val);
        }
        else if(count == maxCount){
            ans.add(val);
        }
        currValue = val;
    }

    void inorder(TreeNode root){
        if(root == null){
            return;
        }

        // this function is for traversal in bst inorder traversal produce the traversal in sorted order
        
        inorder(root.left);
        handleValue(root.val);
        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        int result[] = new int[ans.size()];
        for(int i =0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
