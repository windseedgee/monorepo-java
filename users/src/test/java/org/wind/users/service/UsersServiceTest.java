package org.wind.users.service;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.wind.users.service.impl.UsersServiceImpl;

public class UsersServiceTest {

    private final UsersService usersService = mock(UsersServiceImpl.class);

    @Test
    public void test_getUsers() {
        Mockito.when(usersService.getUsers()).thenReturn("hello users");
    }

}
