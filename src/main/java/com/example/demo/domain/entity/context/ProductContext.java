package com.example.demo.domain.entity.context;

import com.example.demo.domain.entity.Info;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class ProductContext {
    BigDecimal price;
    Info info;
}
