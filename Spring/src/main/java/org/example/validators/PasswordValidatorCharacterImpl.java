package org.example.validators;

public class PasswordValidatorCharacterImpl implements PasswordValidator {

    @Override
    public void validate(String password) {
        if (password.indexOf('&') == -1 || password.indexOf('!') == -1 || password.indexOf('@') == -1) {
            throw new IllegalArgumentException("Некорректно введен пароль, отсутствуют элементы пароля");
        }
    }
}
