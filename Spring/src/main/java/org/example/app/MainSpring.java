package org.example.app;

import org.example.services.SignUpService;
import org.example.services.SignUpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        SignUpService signUpService = applicationContext.getBean(SignUpServiceImpl.class);

        signUpService.signUp("abrakadavre@mail.ru", "1234562weyw");
    }
}

