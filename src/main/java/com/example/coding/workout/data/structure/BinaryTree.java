package com.example.coding.workout.data.structure;


import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class BinaryTree {

    int data;
    BinaryTree left, right;

    BinaryTree(int data) {
        this.data = data;
    }

    public void add(int data) {
        BinaryTree bt = this;
        BinaryTree node = new BinaryTree(data);

        if(node.data>this.data){
            if(this.right==null){
                this.right=node;
            }
            else {
                this.right.add(data);
            }
        }
        else{
            if(this.left==null){
                this.left=node;
            }
            else{
                this.left.add(data);
            }
        }


//        while (true) {
//            if (node.data > bt.data) {
//                if (bt.right == null) {
//                    bt.right = node;
//                    return;
//                } else {
//                    bt = bt.right;
//                }
//            }
//            else {
//                if (bt.left == null) {
//                    bt.left = node;
//                    return;
//                } else {
//                    bt = bt.left;
//                }
//            }
//        }

    }

    public boolean contains(int num){
        if(data==num){
            return true;
        }
        else {
            if(num>data){
                if(right==null){
                    return false;
                }
                else{
                 return   right.contains(num);
                }
            }
            else{
                if(left==null)
                    return false;

               return left.contains(num);

            }
        }
        //return false;
    }

    public void print(BinaryTree bt) {
        if(bt==null) return;
        print(bt.left);
        System.out.format("%s ",bt.data);
        print(bt.right);
    }

}
