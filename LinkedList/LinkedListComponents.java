//leetcode ques no 817
https://leetcode.com/problems/linked-list-components/description/?envType=problem-list-v2&envId=linked-list

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int components = 0;
        boolean inComponent = false;
        
        while (head != null) {
            if (set.contains(head.val)) {
                if (!inComponent) {
                    components++; // new component found
                    inComponent = true;
                }
            } else {
                inComponent = false; // exited a component
            }
            head = head.next;
        }
        return components;
    }
}
