package com.cesur.general.general.models.utils.validadors;



import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidador implements ConstraintValidator<StrongPassword, String> {

    private static final String PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false;
        }else if (password.matches(PASSWORD)) {
            return true;
        }
        return false;
    }
}
