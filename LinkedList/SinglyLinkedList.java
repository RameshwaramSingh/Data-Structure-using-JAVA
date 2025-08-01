package com.priyanshu.LinkedList;

public class SinglyLinkedList{

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail==null){
            insertFirst(val);
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteLast(){
        int val;
        if(size<=1){
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        val = temp.next.value;
        temp.next = null;
        size--;
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(23);
        list.display();

    }
}
