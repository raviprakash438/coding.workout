package com.example.coding.workout.Models;

public abstract class AbstractEmployee {

    AbstractEmployee(){
        System.out.println("Abstract class constructor is called.");
    }

   // @Value("${emp.type}")
    private String EmpType;
    public String Department;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public final void EmpAddress(){
        System.out.println("Emp address");
    }

    public abstract void EmployeeDetails() ;
    public void EmpBaseDetails(){
        System.out.println("Emp base details from Abstract class and Emp type is : "+EmpType);
    }

}
