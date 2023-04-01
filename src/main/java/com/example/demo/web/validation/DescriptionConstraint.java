package com.example.demo.web.validation;

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
@Constraint(validatedBy = MyDescriptionValidator.class)
@Documented
public @interface DescriptionConstraint {
    String message() default "Пожалуйста, введите корректное описание. Размер описания должен находиться в диапозоне от 10 до 10000. И не забываем про котиков!!!";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}

