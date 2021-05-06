package com.example.coding.workout.Multithreading;

import com.example.rest.Models.Emp;

import java.text.SimpleDateFormat;

public class ThreadSafeFormatter {
    public static ThreadLocal<SimpleDateFormat> df= ThreadLocal.withInitial(()-> new SimpleDateFormat("yyyy-MM-dd"));
    public static ThreadLocal<Emp> holder= new ThreadLocal();
}
