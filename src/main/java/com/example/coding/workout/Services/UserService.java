package com.example.coding.workout.Services;

import com.example.coding.workout.Multithreading.ThreadSafeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserService {
    private int id;
    private Date dateOfBirth;


    public UserService(int id) {
        this.id = id;
        this.dateOfBirth = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String birthDate(){
        SimpleDateFormat df= ThreadSafeFormatter.df.get();
        return df.format(dateOfBirth);
    }
}
