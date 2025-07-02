package com.priyanshu.Tree;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class BFS {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i = 0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    //this is used to build the tree at runtime
    public static TreeNode buildTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value(-1 for null) : ");
        int val = sc.nextInt();
        if(val==-1) return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println("Enter the left child of "+node.val+" (-1 for null):");
            int leftVal = sc.nextInt();
            if(leftVal != -1){
                node.left = new TreeNode(leftVal);
                queue.offer(node.left);
            }
            System.out.println("Enter the right child of "+node.val+" (-1 for null):");
            int rightVal = sc.nextInt();
            if(rightVal != -1){
                node.right = new TreeNode(rightVal);
                queue.offer(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        List<List<Integer>> result = levelOrder(root);
        System.out.println("Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
