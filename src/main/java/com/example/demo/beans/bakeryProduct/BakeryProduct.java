package com.example.demo.beans.bakeryProduct;

import com.example.demo.beans.dough.Dough;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static lombok.AccessLevel.PROTECTED;


@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class BakeryProduct {

    @NonNull
    private final Dough dough;

    Boolean inStock = true;

    @PostConstruct
    public void postConstruct() {
        dough.start();
        System.out.printf("The dough is ready to cook: %s%n", dough.getIsAvailable());
        System.out.println(dough.getCostPerKilo());
    }

    @PreDestroy
    public void preDestroy() {
        dough.stop();
        System.out.printf("The dough is ready to cook: %s%n", dough.getIsAvailable());
        System.out.println(dough.getCostPerKilo());
    }
}
