package com.example.coding.workout.auto.config;

public class JdbcUser implements UserDAO {
    @Override
    public void UserDetails() {
        System.out.println("Getting JDBC User");
    }
}
