package com.example.coding.workout.Models;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class Config {

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }

    @Bean
    public SimpleBeanConsumer simpleBeanConsumer() {
        //log.info("calling simple bean again "+ simpleBean());
        return new SimpleBeanConsumer(simpleBean());
    }
}
