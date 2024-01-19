package org.example.app;

import org.example.services.SignUpService;
import org.example.services.SignUpServiceImpl;
import org.example.validators.*;

public class MainNotSpring {
    public static void main(String[] args) {
        EmailValidateRegexImpl emailValidator = new EmailValidateRegexImpl();
        emailValidator.setPattern(".+@.+");
        PasswordValidator passwordValidator = new PasswordValidatorCharacterImpl();

        PasswordBlackList passwordBlackList = new PasswordBlackListImpl();
        SignUpService signUpService = new SignUpServiceImpl(emailValidator, passwordValidator, passwordBlackList);

        signUpService.signUp("armen@mail.ru", "1234567!9@&01");
    }
}
