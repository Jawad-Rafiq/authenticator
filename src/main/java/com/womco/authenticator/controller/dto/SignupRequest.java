package com.womco.authenticator.controller.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
