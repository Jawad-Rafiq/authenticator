package com.womco.authenticator.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.womco.authenticator.model.Password;
import com.womco.authenticator.model.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignupResponse {
    private User userInfo;
    private Password passwordInfo;
    private String token;
}
