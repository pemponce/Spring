package web.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.ApplicationConfig;
import web.dto.AccountDto;
import web.services.SignUpService;
import web.services.SignUpServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SignUpService signUpService = applicationContext.getBean(SignUpServiceImpl.class);

        AccountDto dto = AccountDto.builder()
                .firstName("gfchcgvhcvg")
                .lastName("erutyidfghwusdf")
                .email("aherty@mail.ru")
                .password("gfdkdtyf")
                .build();

        signUpService.signUp(dto);

    }
}
