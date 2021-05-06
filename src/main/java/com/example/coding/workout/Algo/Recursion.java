package com.example.coding.workout.Algo;

import java.util.HashMap;
import java.util.Map;

public class Recursion {
    public static void printInOrder(TreeNode trNode) {

        if (trNode == null) return;

        printInOrder(trNode.left);
        System.out.printf("%d\t", trNode.data);

        printInOrder(trNode.right);

    }

    public static HashMap<Integer, Integer> hm = new HashMap<>();

    public static void mirror(TreeNode trNode, int num,int key) {

        if (trNode == null) return;
        key = key+num;
        hm.put(key, trNode.data);

        mirror(trNode.left, -1,key);
        mirror(trNode.right, 1,key);


    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right.right = new TreeNode(14);
        root.left.right.left = new TreeNode(10);
        printInOrder(root);
        System.out.println("\n");
        mirror(root, 0,0);

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }
}
