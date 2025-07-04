//leetcode ques no 103
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        //for this program we use double ended queue in this we can insert and delete from both end

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i =0;i<levelSize;i++){
                if(!reverse){
                    //when reverse condition is false then we store the level in normal form
                    //insert from last and delete from first
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);

                    if(currentNode.left!=null){
                        queue.addLast(currentNode.left);
                    }

                    if(currentNode.right!=null){
                        queue.addLast(currentNode.right);
                    }
                }
                else{
                    //when we have to print or store in reverse order
                    //in this delete from last and insert from first 
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    //in this first we store the right node and then left
                    if(currentNode.right!=null){
                        queue.addFirst(currentNode.right);
                    }
                    
                    if(currentNode.left!=null){
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
