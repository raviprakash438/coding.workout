package com.example.coding.workout.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start1 implements CommandLineRunner {

    @Autowired
    @Qualifier("Emp1")
    Emp1 employee;

    @Autowired
    SimpleBeanConsumer simpleBeanConsumer;
    public static void main(String[] args)  {
        SpringApplication.run(Start1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


       // employee.EmployeeDetails();
       // employee.EmpBaseDetails();
       // employee.EmpAddress();
        simpleBeanConsumer.M1();

    }
}
