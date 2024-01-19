package web.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component("emailValidatorRegexImpl")
public class EmailValidatorRegexImpl implements EmailValidator{

    private Pattern pattern;

    @Autowired
    public void setPattern(@Value("${web.validator.email.regex}") String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public void validate(String email) {
        if(!pattern.matcher(email).find()) {
            throw new IllegalArgumentException("В почте обязательно должен быть знак @ !!!");
        }
    }
}
