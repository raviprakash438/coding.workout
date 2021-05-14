package com.example.coding.workout.auto.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Target is a meta annotation. This means we are defining a custom annotation.
//The Element.TYPE & METHOD means we can decorate the custom annotation on class and method.
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(DatabaseTypeCondition.class)
public @interface DatabaseType {
    String value();
}
