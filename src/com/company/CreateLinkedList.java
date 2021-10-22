package com.company;

public class CreateLinkedList {
    public static void main(String[] args) {
        Node first=new Node(3);
        Node second=new Node(4);
        Node thierd=new Node(5);
        Node fourth=new Node(6);
        first.next=second;
        second.next=thierd;
        thierd.next=fourth;
        System.out.println(thierd.data);
    }
}
