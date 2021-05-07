package com.example.coding.workout.InstrumentShop;


import com.example.coding.workout.InstrumentShop.enums.Builder;
import com.example.coding.workout.InstrumentShop.enums.Type;
import com.example.coding.workout.InstrumentShop.enums.Wood;

public class InstrumentSpec {

    public Builder builder;
    public Type type;
    public Wood topWood;
    public Wood backWood;
    public String model;

    public InstrumentSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model) {
        this.builder = builder;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public String getModel() {
        return model;
    }

    public boolean matches(InstrumentSpec spec){
        System.out.println("inside InstrumentSpec matches method.");
        if(builder!=spec.builder)
            return false;
        if(backWood!=spec.backWood)
            return false;

        return true;
    }
}
