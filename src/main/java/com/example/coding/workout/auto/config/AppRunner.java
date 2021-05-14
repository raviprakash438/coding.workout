package com.example.coding.workout.auto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    UserDAO userDAO;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("In AppRunner run method.");
        userDAO.UserDetails();
    }
}
