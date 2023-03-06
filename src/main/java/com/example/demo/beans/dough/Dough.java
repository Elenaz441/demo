package com.example.demo.beans.dough;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PROTECTED;

@Getter
@FieldDefaults(level = PROTECTED)
public abstract class Dough {

    @NonNull
    private final Integer costPerKilo;
    Boolean isAvailable = false;
    
    public Dough(Integer cost){
        this.costPerKilo = cost;
    }

    public void start() {
        isAvailable = true;
        System.out.println("Ready to cook!");
    }

    public void stop() {
        isAvailable = false;
        System.out.println("Dough is over!");
    }
}
