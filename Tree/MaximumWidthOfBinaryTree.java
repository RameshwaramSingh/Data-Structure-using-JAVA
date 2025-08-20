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

//leetcode ques no 662
https://leetcode.com/problems/maximum-width-of-binary-tree/description/

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root== null){
            return 0;
        }

        Queue<Pair<TreeNode,Long>> q = new LinkedList<>();
        q.offer(new Pair<>(root,1L)); // root index = 1
        int maxWidth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            long left = q.peek().getValue(); // index of first Node
            long right = left; // intialize right
            for(int i =0;i<size;i++){
                Pair<TreeNode,Long> p =q.poll();
                TreeNode node = p.getKey();
                long idx = p.getValue();

                right = idx; // update rightMost Index

                if(node.left!=null){
                    q.offer(new Pair<>(node.left,idx*2));
                }
                if(node.right!=null){
                    q.offer(new Pair<>(node.right,idx*2+1));
                }
            }
            maxWidth = Math.max(maxWidth,(int)(right-left+1));
        }
        return maxWidth;
    }
}
