package com.example.coding.workout.Algo.tree;

import java.util.*;

public class BottomViewOfBinaryTree {

    public static void main(String[] args) {
        Btree node = new Btree(20);
        node.left = new Btree(8);
        node.right = new Btree(22);
        node.left.left = new Btree(5);
        node.left.right = new Btree(3);
       // node.right.left = new Btree(4);
        node.right.right = new Btree(25);
        node.left.right.left = new Btree(10);
        node.left.right.right = new Btree(14);

        print(node);
        System.out.println();

        Map<Integer, Integer[]> hm = new TreeMap<>();
        bottomMirror(node, 0, hm, 0);
        System.out.println("printing the bottom image");
        hm.forEach((k, v) -> {
//            System.out.format("%s : %s ", k, Arrays.toString(v));
//            System.out.println();
            System.out.format("%s ", v[0]);
        });

    }

    public static void print(Btree node) {
        if (node == null) return;

        print(node.left);
        System.out.format("%s ", node.data);
        print(node.right);
    }


    public static void bottomMirror(Btree node, int dist, Map<Integer, Integer[]> hm, int level) {
        if (node == null) return;

        bottomMirror(node.left, dist - 1, hm, level + 1);

        if (hm.containsKey(dist)) {
            Integer[] vals = hm.get(dist);
            if (vals[1] <= level) {
                hm.put(dist, new Integer[]{node.data, level});
            }
        } else {
            hm.put(dist, new Integer[]{node.data, level});
        }

        bottomMirror(node.right, dist + 1, hm, level + 1);
    }

}

