package com.example.demo.beans.catering;

import com.example.demo.beans.bakeryProduct.BakeryProduct;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bakery {

    private List<BakeryProduct> availableProducts;

    @Autowired
    public void setAvailableProducts(List<BakeryProduct> products){
        this.availableProducts = products;
    }

    @PostConstruct
    public void postConstruct() {
        availableProducts.forEach(
                c -> System.out.printf("Bakery Product %s in bakery %n", c.hashCode())
        );
    }
}
