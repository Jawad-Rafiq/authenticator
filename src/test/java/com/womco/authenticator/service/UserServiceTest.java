package com.womco.authenticator.service;

import com.womco.authenticator.controller.dto.SignupRequest;
import com.womco.authenticator.controller.dto.SignupResponse;
import com.womco.authenticator.model.Password;
import com.womco.authenticator.model.User;
import com.womco.authenticator.model.repos.PasswordRepo;
import com.womco.authenticator.model.repos.UserRepo;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@Ignore
class UserServiceTest {
    private final String FIRST_NAME = "Auth";
    private final String LAST_NAME = "Service";
    private final String PASSWORD = "12345";
    private final String USERNAME = "auth.service@java.com";
    private final String PASSWORD_HASH = "dfghjk=-=1238863";
    private final String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqYWNAYWJjMS5jb20iLCJsYXN0X25hbWUiOiJubW0iLCJleHAiOjE2OTk5OTE2MDgsImZpcnN0X25hbWUiOiJhYmMiLCJpYXQiOjE2OTk5NTU2MDh9.NtoOnvzOyWoX-8ulXiEQUvtWpDhip-rpPsM7UhU3d1w";
    @Mock
    private UserService userService;
    @Mock
    UserRepo userRepo;
    @Mock
    PasswordRepo passwordRepo;

    @Test
    @Ignore
    void insertUserInfo() {
//        SignupRequest request = buildSignupRequest();
//        User user = buildUser(request);
//        Password password = buildPassword(request,user);
//        Mockito.when(userRepo.save(buildUser(request))).thenReturn(buildUser(request));
//        Mockito.when(passwordRepo.save(buildPassword(request, user))).thenReturn(buildPassword(request, user));
//        Mockito.when(userService.insertUserInfo(request)).thenReturn(buildResponse(user,password));
//        assertEquals(buildResponse(user,password),userService.insertUserInfo(request));
    }

    private SignupRequest buildSignupRequest() {
        SignupRequest request = new SignupRequest();
        request.setFirstName(FIRST_NAME);
        request.setLastName(LAST_NAME);
        request.setPassword(PASSWORD);
        request.setUsername(USERNAME);
        return request;
    }
    private User buildUser(SignupRequest request) {
        User user = new User();
        user.setUserId(Long.valueOf(1));
        user.setUserFirstName(request.getFirstName());
        user.setUserLastName(request.getLastName());
        user.setUsername(request.getUsername());
        return user;
    }

    private SignupResponse buildResponse(User user, Password password) {
        Password responsePassword = new Password();
        responsePassword.setPasswordHash(password.getPasswordHash());
//        responsePassword.setPasswordId(Long.valueOf(1));
        return SignupResponse.builder()
                .passwordInfo(responsePassword)
                .userInfo(user)
                .token(TOKEN)
                .build();
    }
    private Password buildPassword(SignupRequest request, User user) {
        Password password = new Password();
        password.setPasswordHash(PASSWORD_HASH);
        password.setUserId(user);
        password.setPasswordId(Long.valueOf(1));
        password.setUserId(user);
        return password;
    }

    @Test
    void login() {
    }

    @Test
    void getUserInfo() {
    }
}