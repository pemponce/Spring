package web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dto.AccountDto;
import web.models.Account;
import web.repositories.AccountRepository;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {
    private final AccountRepository accountRepository;

    @Override
    public void signUp(AccountDto dto) {
        Account account = Account.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
        accountRepository.save(account);
    }
}
