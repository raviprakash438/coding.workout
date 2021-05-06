package com.example.coding.workout.Algo;

public class CustomeDoubleLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    Node head, tail = null;

    public void add(int num) {
        Node node = new Node(num);
        if (head == null) {
            node.prev = null;
            node.next = null;
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("DLList is empty.");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
