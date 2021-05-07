package com.example.coding.workout.Services;


import com.example.coding.workout.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void AddStudent(Student student){
        if(students==null){
            students=new ArrayList<>();
        }
        students.add(student);
    }

    public StudentService() {
        AddStudent(new Student(1,"Tom","Cruise"));
        AddStudent(new Student(2,"Tony","Robin"));
        AddStudent(new Student(3,"Jack","Smith"));
    }
}
