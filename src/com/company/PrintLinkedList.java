package com.company;

public class PrintLinkedList {
    public static void main(String[] args) {
        Node head=new Node(3);
        Node second=new Node(4);
        Node thierd=new Node(5);
        Node fourth=new Node(6);
        head.next=second;
        second.next=thierd;
        thierd.next=fourth;
        PrintList(head);
        
    }

        static void PrintList(Node head) {
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
