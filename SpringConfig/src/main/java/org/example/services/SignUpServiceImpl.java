package org.example.services;

import org.example.models.Account;
import org.example.validators.EmailValidator;
import org.example.validators.PasswordBlackList;
import org.example.validators.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component универсальная аннотация, @Service для сервисов

@Service
public class SignUpServiceImpl implements SignUpService {

    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;
    private final PasswordBlackList passwordBlackList;


    // Аннотация Autowired - (правило хорошего тона) ставится на конструкторы и сеттеры
    // Мы указываем спрингу что сюда надо заинжектить бины.
    @Autowired
    public SignUpServiceImpl(@Qualifier("emailValidatorRegex") EmailValidator emailValidator,
                             @Qualifier("passwordValidatorCharacter") PasswordValidator passwordValidator,
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
        System.out.println("Email - " + account.getEmail());
        System.out.println("Password - " + account.getPassword());
    }
}
