package com.womco.authenticator.controller;

import com.womco.authenticator.config.JwtUtil;
import com.womco.authenticator.controller.dto.LoginRequest;
import com.womco.authenticator.controller.dto.LoginResponse;
import com.womco.authenticator.controller.dto.SignupRequest;
import com.womco.authenticator.controller.dto.SignupResponse;
import com.womco.authenticator.dao.UserDao;
import com.womco.authenticator.dto.AuthenticationRequest;
import com.womco.authenticator.model.User;
import com.womco.authenticator.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    @PostMapping("/login")
    public LoginResponse authenticate(
            @RequestBody LoginRequest request
    ) {
        log.info("[POST] [/auth/authenticate] request received  with username :{}",request.getUser());
        LoginResponse response = userService.login(request);
        log.info("[RESPONSE] [/auth/authenticate] = {}", response);
        return response;
    }
    @PostMapping("/create")
    public SignupResponse createUser(@RequestBody SignupRequest request){
        log.info("[POST] [/auth/create] request received with payload :{}", request);
        SignupResponse response = userService.insertUserInfo(request);
        log.info("[RESPONSE] [/auth/create] = {}",response);
        return response;
    }
}
