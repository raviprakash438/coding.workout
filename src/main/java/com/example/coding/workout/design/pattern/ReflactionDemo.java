package com.example.coding.workout.design.pattern;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflactionDemo {

    public static void main(String[] args) throws IllegalAccessException,
            InvocationTargetException, InstantiationException, NoSuchFieldException, NoSuchMethodException {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = null;
        Singleton singleton2 = singleton;
        System.out.println("singleton address: "+ singleton);

        Class cls = singleton.getClass();
        System.out.println("Name of the class is: " + cls.getName());

        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("constructor name: " + c);
            //the below code will break the singleton pattern.
            c.setAccessible(true);
            singleton1=(Singleton) c.newInstance();
            System.out.println("singleton1 address: "+ singleton1);
        }

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("method name: " + m.getName());
        }

        Field[] fields= cls.getDeclaredFields();
        for(Field f: fields){
            System.out.println("Field name: "+ f);
        }
        Field counterField= cls.getDeclaredField("counter");
        counterField.setAccessible(true);
        counterField.set(cls,10);

        Method method= cls.getDeclaredMethod("printCounter");
        method.setAccessible(true);
        method.invoke(cls);


    }

}
