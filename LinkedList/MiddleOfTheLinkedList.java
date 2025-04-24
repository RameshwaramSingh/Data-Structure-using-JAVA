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

//leetcode ques no 876
class MiddleOfTheList {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int mid;
        if(size%2==0){
            mid = (size/2)+1;
            for(int i =1;i<mid;i++){
            head = head.next;
        }
        }
        else{
            mid =size/2;
            for(int i =1;i<=mid;i++){
            head = head.next;
        }
        }
        return head;
    }
}
