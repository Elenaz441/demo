package com.example.demo.domain.entity.context;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class ProductContext {
    BigDecimal price;
    String description;
    Date productionDate;
}
