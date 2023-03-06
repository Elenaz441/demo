package com.example.demo.beans.bakeryProduct;

import com.example.demo.beans.dough.Dough;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NapoleonCake extends BakeryProduct {

    public NapoleonCake(@Qualifier(value = "puffDough") Dough dough) {
        super(dough);
    }
}
