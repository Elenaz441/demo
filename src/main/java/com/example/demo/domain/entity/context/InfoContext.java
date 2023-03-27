package com.example.demo.domain.entity.context;

import com.example.demo.adapter.web.annotation.DateConstraint;
import lombok.Value;

import javax.validation.constraints.PastOrPresent;
import java.util.Date;

@Value
public class InfoContext {
    @DateConstraint
    Date date;
}
