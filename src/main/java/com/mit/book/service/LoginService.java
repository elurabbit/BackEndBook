package com.mit.book.service;

import com.mit.book.infrastructure.LoginClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginClient client;

}
