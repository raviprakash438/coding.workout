package com.example.coding.workout.InstrumentShop;

public abstract class Instrument {
    public String SerialNumber;
    public long price;
    public InstrumentSpec spec;

    public Instrument(String serialNumber, long price, InstrumentSpec spec) {
        SerialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    public void setSpec(InstrumentSpec spec) {
        this.spec = spec;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
