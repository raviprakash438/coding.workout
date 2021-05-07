package com.example.coding.workout.InstrumentShop;

import com.example.coding.workout.InstrumentShop.enums.Builder;
import com.example.coding.workout.InstrumentShop.enums.Type;
import com.example.coding.workout.InstrumentShop.enums.Wood;
import com.example.coding.workout.InstrumentShop.product.Guitar;
import com.example.coding.workout.InstrumentShop.product.GuitarSpec;

public class Start {

    public static void main(String[] args) {
        GuitarSpec spec= new GuitarSpec(Builder.ANY, Type.ELECTRIC, Wood.TINDER_WOOD,Wood.ROSEWOOD,"Model1",12);
        Guitar guitar = new Guitar("1",125,spec);
        Inventory.Add(guitar);
    }
}
