package com.example.demo.beans.bakeryProduct;

import com.example.demo.beans.dough.Dough;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bun extends BakeryProduct{

    public Bun(@Qualifier(value = "yeastDough") Dough dough) {
        super(dough);
    }
}
