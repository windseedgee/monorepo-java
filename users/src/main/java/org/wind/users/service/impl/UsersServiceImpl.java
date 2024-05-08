package org.wind.users.service.impl;

import org.springframework.stereotype.Service;
import org.wind.users.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    @Override
    public String getUsers() {
        return "hello users";
    }
}
