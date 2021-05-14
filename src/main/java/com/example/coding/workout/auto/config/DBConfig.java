package com.example.coding.workout.auto.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

    @Bean
    @DatabaseType("MYSQL")
    public UserDAO jdbcUser() {
        return new JdbcUser();
    }

    @Bean
    @DatabaseType("MONGO")
    public UserDAO mongoUser(){
        return new MongoUser();
    }

}
