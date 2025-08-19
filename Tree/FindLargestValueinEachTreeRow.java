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

// leetcode ques no 515
https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/

class Solution {

    // solved by myself

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size(); // size of the queue level by level
            int max = Integer.MIN_VALUE;
            for(int i =0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.val>max){
                    max = currentNode.val;
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
