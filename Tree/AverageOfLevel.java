https://leetcode.com/problems/average-of-levels-in-binary-tree/
//leetcode ques no 637


package com.priyanshu.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class AverageOfLevel {

    public static TreeNode bulidTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value (-1 for null)");
        int val = sc.nextInt();

        if (val == -1) return null;
        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println("Enter the left child of " + node.val + " (-1 for null)");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                node.left = new TreeNode(leftVal);
                queue.offer(node.left);
            }
            System.out.println("Enter the right child of " + node.val + " (-1 for null)");
            int rightVal = sc.nextInt();
            if(rightVal!=-1){
                node.right = new TreeNode(rightVal);
                queue.offer(node.right);
            }
        }
        return root;
    }

    public static TreeNode createTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node value (-1 for null)");
        int val = sc.nextInt();

        if(val == -1){
            return null;
        }

        TreeNode node = new TreeNode(val);

        System.out.println("Enter left child of "+val+" (-1 for null)");
        node.left = createTree();

        System.out.println("Enter right child of "+val+" (-1 for null)");
        node.right = createTree();

        return node;
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double averageLevel = 0;

            for(int i =0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                averageLevel = averageLevel+currentNode.val;

                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        List<Double> result= averageOfLevels(root);
        System.out.println("Average of all level");
        for(Double ans :result){
            System.out.println(ans);
        }
    }
}
