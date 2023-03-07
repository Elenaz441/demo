package com.example.demo.beans.catering;

import com.example.demo.beans.bakeryProduct.BakeryProduct;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cafe {

    @Autowired
    List<BakeryProduct> availableProducts;

    @PostConstruct
    public void postConstruct() {
        availableProducts.forEach(
                c -> System.out.printf("Bakery Product %s in cafe %n", c.hashCode())
        );
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Cafe is closed!");
    }
}
