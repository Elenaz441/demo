package com.example.demo.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyDescriptionValidator implements ConstraintValidator<DescriptionConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.contains("котик");
    }
}