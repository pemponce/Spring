package org.example.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//Аннотатция Component помечает данный класс для спринга
//спринг тепреь знает об этом классе и он будет создавать бин для него
@Component("emailValidatorLength")
public class EmailValidatorLengthImpl implements EmailValidator {

    private final int minlength;

    public EmailValidatorLengthImpl(@Value("${org.example.validator.email.minlength}")  int minlength) {
        this.minlength = minlength;
    }

    @Override
    public void validate(String email) {
        if (email.length() < minlength) {
            throw new IllegalArgumentException("Длина почты некрректна");
        }
    }
}
