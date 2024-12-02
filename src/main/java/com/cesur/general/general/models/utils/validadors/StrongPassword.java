package com.cesur.general.general.models.utils.validadors;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = StrongPasswordValidador.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface StrongPassword {
    
    String message() default "La contraseña no cumple los estandares";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
