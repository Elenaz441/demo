package com.example.demo.adapter.web.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyDateValidator.class)
@Documented
public @interface DateConstraint {

    String message() default "Date should be this format: \"yyyy-MM-dd\"";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

