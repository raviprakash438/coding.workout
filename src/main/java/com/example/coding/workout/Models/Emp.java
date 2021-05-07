package com.example.coding.workout.Models;


import com.example.coding.workout.Interface.Employee;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("Emp")
public class Emp implements Employee {
    String str1="abc";
    String str2="abc";
    String str3="abc";
    String str4="abc";
    public final String FullName="Ravi";
    public static final String LastName="Ravi";

    public String name="Ravi";
    protected String Firstname="Ravi";

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    @Override
    public void EmplyeeDefault(){
        System.out.println("Employee Company is Apha Google.");
    }
    @Override
    public void EmployeeDetails() {
        System.out.println("Emp details...");
        System.out.println("str1: "+ str1.hashCode());
        System.out.println("str2: "+ str2.hashCode());
        System.out.println("str3: "+ str3.hashCode());
        System.out.println("str4: "+ str4.hashCode());
    }

    public String GetEmpName() throws IOException {
        System.out.println("Parant class");
        return name;
    }


}
