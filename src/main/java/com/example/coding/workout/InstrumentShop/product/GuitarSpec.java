package com.example.coding.workout.InstrumentShop.product;

import com.example.rest.InstrumentShop.InstrumentSpec;
import com.example.rest.InstrumentShop.enums.Builder;
import com.example.rest.InstrumentShop.enums.Type;
import com.example.rest.InstrumentShop.enums.Wood;

public class GuitarSpec extends InstrumentSpec {
    public int numStrings;


    public GuitarSpec(Builder builder, Type type, Wood topWood, Wood backWood, String model, int numStrings) {
        super(builder, type, topWood, backWood, model);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
//    public boolean matches(InstrumentSpec spec){
//        if(!super.matches(spec))
//            return false;
//        if(!(spec instanceof GuitarSpec))
//            return false;
//        GuitarSpec guitarSpec= (GuitarSpec) spec;
//        if(numStrings!=guitarSpec.numStrings)
//            return false;
//
//        return true;
//    }
}
