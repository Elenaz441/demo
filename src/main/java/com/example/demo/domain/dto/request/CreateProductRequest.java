package com.example.demo.domain.dto.request;

import com.example.demo.domain.entity.Info;
import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.util.Date;

@Value
public class CreateProductRequest {
    @Min(value = 0, message = "Product must have a price more than zero")
    BigDecimal price;
    String description;
//    @PastOrPresent()
//    Info info;
    Date productionDate;
}
