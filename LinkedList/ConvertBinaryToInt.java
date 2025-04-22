package com.priyanshu.LinkedList;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ConvertBinaryToInt {
    static int getDecimalValue(ListNode head) {
        double ans = 0;
        int size = -1;
        ListNode temp = head;
        while(temp.next!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        if(temp.next==null){
            if(temp.val==1){
                return 1;
            }
            else{
                return 0;
            }
        }
        while(temp.next.next!=null){
            if(temp.val==1){
                ans = ans+Math.pow(2,size);
            }
            size--;
            temp = temp.next;
        }
        temp = temp.next;
        if(temp.val==1){
            ans = ans+1;
        }
        int ans1= (int)ans;
        return ans1;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(1);
    }
}
