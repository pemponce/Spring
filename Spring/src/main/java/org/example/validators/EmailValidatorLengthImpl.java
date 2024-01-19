package org.example.validators;

public class EmailValidatorLengthImpl implements EmailValidator {

    private int minlength;

    public EmailValidatorLengthImpl(int minlength) {
        this.minlength = minlength;
    }

    @Override
    public void validate(String email) {
        if (email.length() < minlength) {
            throw new IllegalArgumentException("Длина почты некрректна");
        }
    }
}
