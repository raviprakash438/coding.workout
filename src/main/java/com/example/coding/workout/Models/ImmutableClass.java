package com.example.coding.workout.Models;

import java.util.Date;

public  final class ImmutableClass extends Emp1
{
    private final String Name;
    private final Date CurrentData;

    public ImmutableClass(String name, Date currentData) {
        this.Name = name;
        CurrentData = currentData;
    }

    public String getName() {
        return Name;
    }

    public Date getCurrentData() {
        return CurrentData;
    }


}
