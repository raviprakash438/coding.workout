package com.example.coding.workout.Interface;

public interface Employee  {

    void EmployeeDetails();
    default void EmplyeeDefault(){
        System.out.println("Employee Company is Google.");
    }
    default void EmployeeDefault1(){
        System.out.println("Default1 Company is Apple.");
    }
}
