package org.example.services;

import org.example.models.Account;
import org.example.validators.EmailValidator;
import org.example.validators.PasswordBlackList;
import org.example.validators.PasswordValidator;

public class SignUpServiceImpl implements SignUpService {

    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;
    private final PasswordBlackList passwordBlackList;

    public SignUpServiceImpl(EmailValidator emailValidator,
                             PasswordValidator passwordValidator,
                             PasswordBlackList passwordBlackList) {
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
        this.passwordBlackList = passwordBlackList;
    }

    @Override
    public void signUp(String email, String password) {
        if (passwordBlackList.contains(password)) {
            throw new IllegalArgumentException("Ваш пароль небезопасен");
        }

        emailValidator.validate(email);
        passwordValidator.validate(password);

        Account account = Account
                .builder()
                .id(1)
                .email(email)
                .password(password)
                .build();

        System.out.println("Аккаунт успешно создан");
        System.out.println(account.toString());
    }
}
