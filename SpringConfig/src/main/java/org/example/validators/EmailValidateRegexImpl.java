package org.example.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import java.util.regex.Pattern;

@Component("emailValidatorRegex")
public class EmailValidateRegexImpl implements EmailValidator{

    //Паттерн нужен для регулярных выражений, мы закидываем шаблон строки как она должна выглядеть
    private Pattern pattern;

    // Autowired НА СЕТТЕРЫ И КОНСТРУКТОРЫ!!!! НЕ ЗАБЫВАЙ
    @Autowired
    public void setPattern(@Value("${org.example.validator.email.regex}") String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public void validate(String email) {
        if (!pattern.matcher(email).find()) {
            throw new IllegalArgumentException("Некрректная почта, где '@' ?");
        }
    }
}
