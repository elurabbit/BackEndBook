package com.mit.book.controller;

import com.mit.book.controller.resource.response.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backEnd")
@RequiredArgsConstructor
public class LoginController {

    @GetMapping(value = "/login")
    public LoginResponse getLogin(
            @RequestParam(name = "loginId") String loginId,
            @RequestParam(name = "password") String password) {
        return  new LoginResponse(loginId + "_BE");
    }
}
