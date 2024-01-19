package org.example.app;

import org.example.config.ApplicationConfig;
import org.example.services.SignUpService;
import org.example.services.SignUpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.module.Configuration;

public class MainJavaConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SignUpService signUpService = applicationContext.getBean(SignUpServiceImpl.class);

        signUpService.signUp("abrakadavre@mail.ru", "12345!$@&62weyw");
    }
}
