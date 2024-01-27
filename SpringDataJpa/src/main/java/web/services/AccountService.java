package web.services;

import web.dto.AccountDto;
import web.models.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    Optional<Account> findById(Long id);

    List<Account> findAllByPassword(String password);

    Account findFirstByPassword(String password);

    List<Account> findAllByCarsColor(String color);
}
