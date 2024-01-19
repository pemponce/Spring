package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
