package com.example.coding.workout.InstrumentShop.product;


import com.example.coding.workout.InstrumentShop.InstrumentSpec;
import com.example.coding.workout.InstrumentShop.enums.Builder;
import com.example.coding.workout.InstrumentShop.enums.Style;
import com.example.coding.workout.InstrumentShop.enums.Type;
import com.example.coding.workout.InstrumentShop.enums.Wood;

public class MandolinSpec extends InstrumentSpec {
    public Style style;

    public MandolinSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model, Style style) {
        super(builder, type, topWood, backWood, model);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
//    public boolean matches(InstrumentSpec spec){
//        if(!super.matches(spec))
//            return false;
//        if((spec instanceof MandolinSpec))
//            return false;
//        MandolinSpec mandolinSpec= (MandolinSpec) spec;
//        if(style!=mandolinSpec.style)
//            return false;
//
//        return true;
//    }
}
