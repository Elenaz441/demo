package com.example.demo.domain.entity;

import com.example.demo.adapter.repository.base.BaseDomainEntity;
import com.example.demo.domain.entity.context.ProductContext;
import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class Product extends BaseDomainEntity<Long> {
    BigDecimal price;
    String description;
    Date productionDate;

    public static Product createProductFrom(ProductContext context) {
        return new Product(
                context.getPrice(),
                context.getDescription(),
                context.getProductionDate());
    }
}
