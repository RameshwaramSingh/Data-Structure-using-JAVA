//Leetcode ques no 1367
https://leetcode.com/problems/linked-list-in-binary-tree/


class Solution {
    // matches a downward path starting from 'node'
    public boolean dfs(ListNode head, TreeNode node) {
        // If we reached the end of the list, all nodes matched → return true
        if (head == null) return true;

        // If tree path ended before list is fully matched → return false
        if (node == null) return false;

        // If current values don't match → path invalid
        if (head.val != node.val) return false;

        // Otherwise, move to the next node in the list,
        // and check both left and right subtree paths
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }

    // Main function: checks if linked list exists as a path anywhere in the tree
    public boolean isSubPath(ListNode head, TreeNode root) {
        // Base case: if tree is empty, no path can exist
        if (root == null) return false;

        // If current tree node matches head of linked list,
        // try to verify the entire path starting here
        if (head.val == root.val) {
            if (dfs(head, root)) {
                return true; // path found
            }
        }

        // Otherwise, keep searching in left and right subtrees
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
