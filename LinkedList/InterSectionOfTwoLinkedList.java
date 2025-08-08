/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// leetcod eques no 160
//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d = 0;
        if(c1>c2){
            // if head1 is greater than head2
            d = c1-c2;
            return getInterSectionNode(d,head1,head2);
        }
        else{
            // if head2 is greater than head1
            d = c2-c1;
            return getInterSectionNode(d,head2,head1);
        }
        // the d is used to traverse the both linked list from same level
    }

    // this is used to count the length of linked list
    int getCount(ListNode head){
        int c = 0;
        while(head!=null){
            c++;
            head = head.next;
        }
        return c;
    }

    // int this function both the linked list are traversing from same level if intersection is found return the node
    // otherwise return null

    ListNode getInterSectionNode(int d, ListNode h1, ListNode h2){
        ListNode curr1 = h1;
        ListNode curr2 = h2;
        for(int i = 0;i<d;i++){
            if(curr1 == null){
                return h1;
            }
            curr1 = curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1 == curr2){
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
}
