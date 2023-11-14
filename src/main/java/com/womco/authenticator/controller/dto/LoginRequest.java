package com.womco.authenticator.controller.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginRequest {
    private String user;
    private String password;
}
