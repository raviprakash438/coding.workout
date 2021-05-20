package com.example.coding.workout.Models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Emp1")
public class Emp1 {
    Emp1(){
        System.out.println("Emp1 class constructor is called.");
    }
    //@Value("${emp.type}")
    String empType;


    public void EmployeeDetails() {
        System.out.println("Employee Details");
    }
//    public static void EmpAddress(){
//        System.out.println("Emp address by child");
//    }

//    public void EmpBaseDetails(){
//        System.out.println("Emp base details from child class");
//    }

}
