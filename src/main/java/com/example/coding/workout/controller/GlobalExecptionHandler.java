package com.example.coding.workout.controller;

import com.example.rest.entity.StudentErrorResponse;
import com.example.rest.error.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExecptionHandler {
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> StudenNotFound(StudentNotFoundException ex){

        StudentErrorResponse studentErrorResponse= new StudentErrorResponse();

        studentErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        studentErrorResponse.setMessage(ex.getMessage());
        studentErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(studentErrorResponse,HttpStatus.NOT_FOUND);
    }

}
