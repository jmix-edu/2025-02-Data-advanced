package com.company.projectmanagementdata.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ValidDatesProjectValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidDatesProject {

    String message() default "The start date can not be later than end date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
