package web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.models.Account;
import web.repositories.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> findAllByPassword(String password) {

        return accountRepository.findAllByPassword(password);
    }

    @Override
    public Account findFirstByPassword(String password) {

        return accountRepository.findFirstByPassword(password);
    }

    @Override
    public List<Account> findAllByCarsColor(String color) {
        return accountRepository.findAllByCarsColor(color);
    }


}
