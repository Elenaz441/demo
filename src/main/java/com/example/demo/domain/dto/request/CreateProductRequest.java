package com.example.demo.domain.dto.request;

import com.example.demo.domain.entity.Info;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class CreateProductRequest {
    BigDecimal price;
    Info info;
}
