package web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dto.SignUpForm;
import web.models.Account;
import web.repositories.AccountRepository;
import web.validators.EmailValidator;
import web.validators.EmailValidatorLength;
//import web.validators.EmailValidator;
//import web.validators.EmailValidatorLengthImpl;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final AccountRepository accountRepository;
    private final EmailValidator emailValidator;
    private final EmailValidatorLength emailValidatorLength;


    @Override
    public void signUp(SignUpForm dto) {

      emailValidator.validate(dto.getEmail());
      emailValidatorLength.validate(dto.getEmail());

        Account account = Account.builder().
                firstName(dto.getFirstName()).
                lastName(dto.getLastName()).
                email( dto.getEmail()).
                password(dto.getPassword())
                .build();



        accountRepository.save(account);
    }
}
