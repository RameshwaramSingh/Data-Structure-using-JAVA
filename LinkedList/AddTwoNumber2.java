/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//leetcode ques no 445
https://leetcode.com/problems/add-two-numbers-ii/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverse(l1);
        ListNode revL2 = reverse(l2);
        ListNode dummyHead = new ListNode(0); // this is used to represent dummyHead which is used to store the answer
        ListNode curr = dummyHead;
        int carry = 0;
        while(revL1!=null || revL2!=null || carry!=0 ){
            int x = 0;
            int y = 0;
            if(revL1!= null){
                x = revL1.val;
            }
            if(revL2!=null){
                y = revL2.val;
            }
            int sum = x+y+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(revL1!= null){
                revL1 = revL1.next;
            }
            if(revL2!=null){
                revL2 = revL2.next;;
            }
        }
        ListNode ans = reverse(dummyHead.next);
        return ans;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
