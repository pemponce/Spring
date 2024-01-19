package web.validators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailValidatorLength")
public class EmailValidatorLengthImpl implements EmailValidatorLength {

    private final int minLength;


    public EmailValidatorLengthImpl(@Value("${web.validator.email.min.length}") int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String email) {
        if(email.length() < minLength) {
            throw new IllegalArgumentException("Длинна почты должна быть от 10 символов!");
        }
    }
}
