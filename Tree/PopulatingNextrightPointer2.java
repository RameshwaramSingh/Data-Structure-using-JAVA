/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

// leetcode ques no 117
https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node current = root;

        //traversing level by level
        while(current!=null){
            Node dummy = new Node(0);
            Node tail = dummy;

            // traversee nodes in the current level
        while(current!=null){
            if(current.left!=null){
                tail.next = current.left;
                tail = tail.next;
            }
            if(current.right!=null){
                tail.next = current.right;
                tail = tail.next;
            }
            current = current.next; // move to the next node in the same level
        }
        //Move down to the first node in the next level
        current = dummy.next;
        }
        return root; 
    }
}
