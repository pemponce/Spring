package org.example.validators;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component

public class PasswordBlackListImpl implements PasswordBlackList{

    private static final List<String> BROKEN_PASSWORDS = Arrays.asList("qwerty", "123456", "password", "admin");
    @Override
    public boolean contains(String password) {
        return BROKEN_PASSWORDS.contains(password);
    }
}
