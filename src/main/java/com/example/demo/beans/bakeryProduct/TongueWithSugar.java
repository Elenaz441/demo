package com.example.demo.beans.bakeryProduct;

import com.example.demo.beans.dough.Dough;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TongueWithSugar extends BakeryProduct {

    public TongueWithSugar(@Qualifier(value = "puffDough") Dough dough) {
        super(dough);
    }
}
