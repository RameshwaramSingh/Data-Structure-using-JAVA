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

//leetcode ques no 2476
https://leetcode.com/problems/closest-nodes-queries-in-a-binary-search-tree/description/

class Solution {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list = inorder(root, new ArrayList<>());
        List<List<Integer>> ans = new ArrayList<>();

        for (int q : queries) {
            int floor = findFloor(list, q);
            int ceil = findCeil(list, q);
            ans.add(Arrays.asList(floor, ceil));
        }
        return ans;
    }

    private List<Integer> inorder(TreeNode node, List<Integer> ans) {
        if (node == null) return ans;
        inorder(node.left, ans);
        ans.add(node.val);
        inorder(node.right, ans);
        return ans;
    }

    // Find largest value <= target
    private int findFloor(List<Integer> list, int target) {
        int l = 0, r = list.size() - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) <= target) {
                ans = list.get(mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    // Find smallest value >= target
    private int findCeil(List<Integer> list, int target) {
        int l = 0, r = list.size() - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) >= target) {
                ans = list.get(mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
