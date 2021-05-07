package com.example.coding.workout.controller;

import com.example.coding.workout.Services.AuthorService;
import com.example.coding.workout.Services.StudentService;
import com.example.coding.workout.entity.Student;
import com.example.coding.workout.error.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HomeController {
    private StudentService studentService;
    @PostConstruct
    public void LoadData(){
        studentService= new StudentService();
    }

    @Autowired
    AuthorService authorService;

    @GetMapping("/students")
    public List<Student> getStudents() throws IOException, InterruptedException {

        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable int id){
        Optional<Student> student = studentService.getStudents().stream().filter(student1 -> student1.getId()==id).findFirst();
        if(student.isEmpty()){
            throw new StudentNotFoundException("Student not found for id : "+id);
        }
       return student;
    }

    @GetMapping("/author")
    public List<String> getAuthor() throws IOException {
        String url=" https://restmock.techgig.com/news?author=sama";

        List<String> titles= new ArrayList();

        authorService.getAuthorTitles(url,1,titles);

        Collections.sort(titles);
        return titles;
    }


//     @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> ExceptionHandler(Exception ex){
//         StudentErrorResponse studentErrorResponse= new StudentErrorResponse();
//
//         studentErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//         studentErrorResponse.setMessage(ex.getMessage());
//         studentErrorResponse.setTimestamp(System.currentTimeMillis());
//
//         return new ResponseEntity<>(studentErrorResponse,HttpStatus.BAD_REQUEST);
//
//     }
}
