package org.example.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("passwordValidatorLength")
public class PasswordValidatorLengthImpl implements PasswordValidator{

    private final int minLength;

    public PasswordValidatorLengthImpl(@Value("${org.example.validator.password.minlength}") int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String password) {
        if(password.length() < minLength) {
            throw new IllegalArgumentException("Некорректная длина пароля");
        }
    }
}
