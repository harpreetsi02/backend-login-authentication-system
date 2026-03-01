package com.practiceproject.loginauthsystem.controller;

import com.practiceproject.loginauthsystem.dto.LoginRequest;
import com.practiceproject.loginauthsystem.entity.User;
import com.practiceproject.loginauthsystem.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

//    Register
    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.registerUser(user);
    }

//    Login
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }
}
