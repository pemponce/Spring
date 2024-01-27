package web.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.ApplicationConfig;
import web.models.Account;
import web.services.AccountService;
import web.services.AccountServiceImpl;

import java.util.List;

public class MainAccount {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AccountService accountService = applicationContext.getBean(AccountServiceImpl.class);

        List<Account> accounts = accountService.findAllByPassword("password");
        Account account = accountService.findFirstByPassword("pasasdssword");
        List<Account> carAccounts = accountService.findAllByCarsColor("Black");

        int i = 0;
    }
}
