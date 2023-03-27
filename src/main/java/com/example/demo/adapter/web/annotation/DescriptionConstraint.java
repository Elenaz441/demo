package com.example.demo.adapter.web.annotation;

import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.Constraint;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@NotBlank
@Size(min = 10, max = 10000)
@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@Documented
public @interface DescriptionConstraint {
    String message() default "Please, enter correct description (10-10000 symbols)";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
