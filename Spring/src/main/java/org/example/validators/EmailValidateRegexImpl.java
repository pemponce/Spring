package org.example.validators;

import java.util.regex.Pattern;

public class EmailValidateRegexImpl implements EmailValidator{

    //Паттерн нужен для регулярных выражений, мы закидываем шаблон строки как она должна выглядеть
    private Pattern pattern;

    public void setPattern(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public void validate(String email) {
        if (!pattern.matcher(email).find()) {
            throw new IllegalArgumentException("Некрректная почта, где '@' ?");
        }
    }
}
