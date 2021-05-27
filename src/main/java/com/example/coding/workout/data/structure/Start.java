package com.example.coding.workout.data.structure;

public class Start {

    public static void main(String[] args) {
//        LinkedList ll= new LinkedList(11);
//        ll.add(5);  ll.add(6);  ll.add(5);  ll.add(1);
//        ll.add(6);  ll.add(7);  ll.add(7);  ll.add(11);
//
//
//        ll.printLinkedList();
//        System.out.println("linked list Size: "+ ll.size());
//
//        // CustomLinkedList delLst= ll.delete(7);
//        LinkedList distinct= ll.distinct();
//         ll.printLinkedList(distinct);
//        System.out.println("using distinct1----------");
//        LinkedList distinct1= ll.distinct1();
//        ll.printLinkedList(distinct1);

        BinaryTree binaryTree= new BinaryTree(25);
        binaryTree.add(20);
        binaryTree.add(30);
        binaryTree.add(5);
        binaryTree.add(10);
        binaryTree.add(100);
        binaryTree.add(2);
        binaryTree.add(5);

        binaryTree.print(binaryTree);
        System.out.println();
        System.out.println("is 22 present: "+binaryTree.contains(22));
    }
}
