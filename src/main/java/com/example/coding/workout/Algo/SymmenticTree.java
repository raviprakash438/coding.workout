package com.example.coding.workout.Algo;

public class SymmenticTree {

    Node root;
    public static void main(String[] args) {

        SymmenticTree tree = new SymmenticTree();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
        System.out.println(isMirror(tree.root,tree.root));

    }

    public static boolean isMirror(Node node1, Node node2){

        if(node1==null && node2==null)
            return true;

        if(node1 !=null && node2!=null && node1.key==node2.key)
            return(isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left));


        return false;
    }
}

class Node{
    int key;
    Node left,right;
    Node(int num){
        this.key=num;
        left=right=null;
    }
}
