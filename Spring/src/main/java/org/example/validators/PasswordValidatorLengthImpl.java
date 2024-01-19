package org.example.validators;

public class PasswordValidatorLengthImpl implements PasswordValidator{

    private int minLength;

    public PasswordValidatorLengthImpl(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String password) {
        if(password.length() < minLength) {
            throw new IllegalArgumentException("Некорректная длина пароля");
        }
    }
}
