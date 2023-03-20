package com.example.demo.domain.dto.response;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class ProductResponse {
    Long id;
    BigDecimal price;
    Info info;

    @Value
    public static class Info {
        Long id;
        Date date;
    }
}
