package com.example.coding.workout.Algo.tree;

import com.sun.source.tree.Tree;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.AnnotatedArrayType;
import java.util.HashMap;
import java.util.TreeMap;

public class SideViewOfTree {

    public static void main(String[] args) {

        Btree node= new Btree(20);
        node.left= new Btree(8);
        node.right= new Btree(22);
        node.left.left= new Btree(5);
        node.left.right= new Btree(3);
        node.left.right.left= new Btree(10);
        node.left.right.right= new Btree(14);
        node.right.left= new Btree(4);
        node.right.right= new Btree(25);
        print(node);
        System.out.println("\n right side image");
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        rightSideView(node,tm,0);
        tm.forEach((a,b)-> System.out.print(" "+b));

        System.out.println("\n left side view");
        tm= new TreeMap<>();
        leftSideView(node,tm,0);;
        tm.forEach((a,b)-> System.out.print(" "+b));
    }

    private static void print(Btree node)
    {
        if(node==null) return;
        //System.out.print(" "+node.data);  //pre order
        print(node.left);
        // System.out.print(" "+node.data);  //in order
        print(node.right);
        System.out.print(" "+node.data);  //post order

        //pre order: 20 8 5 3 10 14 22 4 25
        //in order : 5 8 10 3 14 20 4 22 25
        //post order:5 10 14 3 8 4 25 22 20

    }

    private static void rightSideView(Btree node, TreeMap<Integer,Integer>tm,int level){
        if(node==null) return;
        tm.put(level,node.data);
        rightSideView(node.left,tm,level+1);
        rightSideView(node.right,tm,level+1);
    }

    private static void leftSideView(Btree node, TreeMap<Integer,Integer>tm,int level){
        if(node==null) return;
        tm.put(level,node.data);
        leftSideView(node.right,tm,level+1);
        leftSideView(node.left,tm,level+1);
    }
}
