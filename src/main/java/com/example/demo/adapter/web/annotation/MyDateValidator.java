package com.example.demo.adapter.web.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyDateValidator implements ConstraintValidator<DateConstraint, String> {

    public void initialize(DateConstraint constraint) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.length() != 10){
            return false;
        }

        if (value.charAt(4) != '-' || value.charAt(7) != '-'){
            return false;
        }

        return Integer.parseInt(value.substring(5, 7)) <= 12 && Integer.parseInt(value.substring(8)) <= 31;
    }
}

