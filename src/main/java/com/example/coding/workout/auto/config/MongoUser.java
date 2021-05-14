package com.example.coding.workout.auto.config;

public class MongoUser implements UserDAO {
    @Override
    public void UserDetails() {
        System.out.println("Getting Mongo user");
    }
}
