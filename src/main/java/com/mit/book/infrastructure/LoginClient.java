package com.mit.book.infrastructure;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

@Component
public class LoginClient {
    private RestTemplate restTemplate = new RestTemplate();

}
