package com.mit.book.controller.resource.request;

import com.mit.book.service.model.vo.LoginId;
import com.mit.book.service.model.vo.Password;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String loginId;
    private String password;

    public LoginRequest() {};

    public LoginRequest(String loginId , String password) {
        this.loginId = loginId;
        this.password = password;
    };

    public static LoginRequest of(LoginId loginId, Password password) {
        return new LoginRequest(
                loginId.getValue(),
                password.getValue()
        );
    }
}
