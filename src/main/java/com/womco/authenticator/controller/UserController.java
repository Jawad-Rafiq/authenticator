package com.womco.authenticator.controller;

import com.womco.authenticator.config.JwtUtil;
import com.womco.authenticator.controller.dto.UserResponse;
import com.womco.authenticator.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
public class UserController {
    private UserService userService;
    @GetMapping("/{userId}")
    UserResponse getUserInfo(@PathVariable Long userId){
        log.info("[GET] [/users] request received  with userId :{}",userId);
       UserResponse response = userService.getUserInfo(userId);
        log.info("[RESPONSE] [/users] = {}", response);
        return response;
    }

}
