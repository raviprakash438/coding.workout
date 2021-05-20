package com.example.coding.workout.Multithreading;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) throws InterruptedException {
        Stream<Integer> arr=Stream.of(1,2,3,4,5);
        int[] intArr= new int[]{1,2,3,4,5};
        List<Integer> lst= new ArrayList<>();
        lst.add(1); lst.add(2);  lst.add(3);
        lst.add(4); lst.add(5);  lst.add(6);
        System.out.println("The max value is: "+lst.stream().max((o1, o2) -> o1 -o2));

        Arrays.stream(intArr).forEach(System.out::println);
       // Arrays.stream(intArr).forEach(s-> System.out.println(s));
        System.out.println("The sum total of the number >3 is: "+Arrays.stream(intArr).filter(sb->sb>3).sum());


    }
}
