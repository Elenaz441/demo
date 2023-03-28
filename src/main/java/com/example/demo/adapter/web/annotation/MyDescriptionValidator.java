package com.example.demo.adapter.web.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyDescriptionValidator implements ConstraintValidator<DescriptionConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.contains("котик");
    }
}