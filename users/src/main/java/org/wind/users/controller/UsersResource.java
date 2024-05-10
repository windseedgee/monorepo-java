package org.wind.users.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wind.users.service.UsersService;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UsersResource {

    private final UsersService usersService;

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "hello world";
    }

    @GetMapping
    public String getUsers() {
        return usersService.getUsers();
    }
}
