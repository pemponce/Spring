package web.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import web.models.Account;

import java.util.List;

//JpaRepository- 1 Что за сущность с которой мы работаем?
// 2 что за тип индефикатора сущности.
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findAllByPassword(String password);
    Account findFirstByPassword(String password);

    @Query("select account from Account account join fetch account.cars car where car.color = :color")
    List<Account> findAllByCarsColor(@Param("color") String color);

}
