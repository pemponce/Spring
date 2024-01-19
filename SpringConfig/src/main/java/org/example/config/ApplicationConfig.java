package org.example.config;

import org.example.validators.PasswordBlackList;
import org.example.validators.PasswordBlackListImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Данная аннотация помечает класс как конфигурационный класс спринга.
@Configuration
//Аннотация PropertySource позволяет нам подключить файл application.properties с нашими настройками и значениями.
@PropertySource("classpath:application.properties")
// Аннотация ComponentScan настраивает область поиска бинов спринга.
@ComponentScan(basePackages = "org.example")
public class ApplicationConfig {

}
