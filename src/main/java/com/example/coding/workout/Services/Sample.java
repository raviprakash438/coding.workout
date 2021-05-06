package com.example.coding.workout.Services;

import java.util.*;

public class Sample  {

    public static void main(String[] args) {
        Dog d1 = new Dog(3,"red", 30);
        Dog d2 = new Dog(2,"black", 20);
        Dog d3 = new Dog(4,"white", 1);
        Dog d4 = new Dog(1,"white", 15);
        Dog d5 = new Dog(5,"blue", 10);

        HashMap hm = new HashMap();
        char[] arr= "abqacb".toCharArray();
        SortedSet<Character> ss = new TreeSet<>();
        SortedMap<Character,Integer> sm = new TreeMap<>();
        Hashtable<String,String>hm1 = new Hashtable<>();

        for(char c: arr){
            ss.add(c);
            if(sm.containsKey(c)){
                sm.put(c,(sm.get(c)+1));
            }
            else{
                sm.put(c,1);
            }
        }
        Iterator itr= ss.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entity: sm.entrySet()){
            int num=entity.getValue();
            while (num>0){
                sb.append(entity.getKey());
                num--;
            }
        }
        System.out.println(sb.toString());



        ArrayList<Dog> arrayList= new ArrayList();
        arrayList.add(d4);
        arrayList.add(d2);
        arrayList.add(d3);
        arrayList.add(d1);
        arrayList.add(d5);

        ColorCompare colorCompare= new ColorCompare();
        Collections.sort(arrayList,colorCompare);


        TreeMap<Dog, Integer> treeMap = new TreeMap<>();
        treeMap.put(d1, 10);
        treeMap.put(d2, 15);
        treeMap.put(d3, 5);
        treeMap.put(d4, 20);
        treeMap.put(d5, 25);

        for (Map.Entry<Dog, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey().id+" - "+entry.getKey().color + " - " + entry.getValue());
        }
        System.out.println(" ----comparator------ ");
        for (Dog dog:arrayList) {
            System.out.println(dog.id+" - "+ dog.color+ " - "+ dog.size);
        }
        Comparator sizeCompare= (Comparator<Dog>) (o1, o2) -> o1.size-o2.size;

        Collections.sort(arrayList,sizeCompare.reversed());
        System.out.println(" ---compare by size--- ");
        for (Dog dog:arrayList) {
            System.out.println(dog.id+" - "+ dog.color+ " - "+ dog.size);
        }
    }
}

class Dog implements Comparable<Dog> {
    int id;
    String color;
    int size;

    public Dog(int id, String color, int size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    @Override
    public int compareTo(Dog o) {
        return this.id-o.id;
    }
}

class ColorCompare implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.color.compareToIgnoreCase(o2.color);
    }


}
