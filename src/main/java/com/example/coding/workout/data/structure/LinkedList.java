package com.example.coding.workout.data.structure;

import java.util.HashSet;

public class LinkedList {

    LinkedList next = null;
    int data;

    LinkedList(int data) {
        this.data = data;
    }

    public void add(int data) {
        LinkedList node = new LinkedList(data);
        LinkedList n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void printLinkedList() {
        LinkedList node = this;
        System.out.println("-------------------");
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void printLinkedList(LinkedList node) {
        // CustomLinkedList node= this;
        System.out.println("-------------------");
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public LinkedList delete(int data) {
        LinkedList node = this;
        if (node.data == data) {
            return node.next;
        }
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                return this;
            }
            node = node.next;
        }
        return this;
    }

    public int size() {
        int counter = 1;
        LinkedList node = this;
        while (node.next != null) {
            counter++;
            node =node.next;
        }
        return counter;
    }

    public LinkedList distinct(){
        LinkedList node=this;
        while (node!=null && node.next!=null){
            LinkedList j=node;

            while (j.next!=null){
                if(node.data==j.next.data){
                    j.next=j.next.next;
                }
                else{
                    j=j.next;
                }
            }
            node=node.next;
        }
        return this;
    }

    public LinkedList distinct1(){
        LinkedList node= this;
        HashSet<Integer> set= new HashSet<>();
        while (node!=null && node.next!=null){
            if(set.contains(node.next.data)){
                node=node.next.next;
            }
            else {
                set.add(node.data);
                node=node.next;
            }
        }

        return this;
    }
}
