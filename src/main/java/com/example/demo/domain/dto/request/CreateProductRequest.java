package com.example.demo.domain.dto.request;

import com.example.demo.adapter.web.annotation.DateConstraint;
import com.example.demo.adapter.web.annotation.DescriptionConstraint;
import lombok.Value;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

@Value
public class CreateProductRequest {
    @Min(0)
    BigDecimal price;
    @DescriptionConstraint
    String description;
    @DateConstraint
    Date productionDate;
}
