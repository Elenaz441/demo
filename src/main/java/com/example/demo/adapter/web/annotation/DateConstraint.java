package com.example.demo.adapter.web.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@NotNull
@PastOrPresent
@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@Documented
public @interface DateConstraint {

    String message() default "Должна быть прошедшая дата или сегодняшняя!!!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

