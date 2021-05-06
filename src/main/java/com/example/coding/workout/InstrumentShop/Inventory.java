package com.example.coding.workout.InstrumentShop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List<Instrument> instruments;

    public static void Add(Instrument instrument){
        instruments.add(instrument);
    }

    public List<Instrument> Search(InstrumentSpec instrumentSpec){
        List<Instrument>matchedInstrument= new ArrayList<>();
        for(Instrument instrument: instruments){
            if(instrument.getSpec().matches(instrumentSpec)){
                matchedInstrument.add(instrument);
            }

        }
        return matchedInstrument;
    }
}
