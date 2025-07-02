package com.priyanshu.Tree;

 class BST {
    public class Node{
        private int value;
        private Node right;
        private Node left;
        private int height;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(Node node){
        return root == null; // this will check the condition and return it accordingly whether it is null or not
    }

    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(node.value>value){
            node.left = insert(value,node.left);
        }
        if(value>node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void populate(int arr[]){
        for(int i =0;i<arr.length;i++){
            this.insert(arr[i]); // this is used to insert multiple value at one time
        }
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public boolean balanced(){
        return balanced(root);
    }
    public void display(){
        display(this.root,"Root Node :");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"left child of "+node.value+":");
        display(node.right,"right child of "+node.value+":");
    }

     public static void main(String[] args) {
        BST tree = new BST();
        int [] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
     }
}
