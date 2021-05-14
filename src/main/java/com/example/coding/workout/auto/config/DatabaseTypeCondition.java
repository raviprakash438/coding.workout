package com.example.coding.workout.auto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.util.Map;

public class DatabaseTypeCondition implements Condition {

    @Value("${db.type}")
    private String enableDBType;

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        System.out.println("In DatabaseTypeCondition class.");
        Map<String,Object> attributes= metadata.getAnnotationAttributes(DatabaseType.class.getName());
        String type= (String) attributes.get("value");
      //  System.out.println("System properties: "+ System.getProperties());
        //String enableDBType= System.getProperty("dbType","MYSQL");
        System.out.println("enableDBType: "+enableDBType +" type: "+type);
        return (enableDBType!=null && type !=null && enableDBType.equalsIgnoreCase(type));
    }
}
