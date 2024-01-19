package web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.dto.SignUpForm;
import web.services.SignUpService;
import web.validators.EmailValidator;

@Controller
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    //Аннотацией GetMapping мы указали что если приходит запрос Get на /signUp то отработает данный метод

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(SignUpForm dto) {
        signUpService.signUp(dto);

        return "redirect:/signIn";
    }
}
