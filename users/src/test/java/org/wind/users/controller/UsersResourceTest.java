package org.wind.users.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.wind.users.service.UsersService;
import org.wind.users.service.impl.UsersServiceImpl;

@WebMvcTest(UsersResource.class)
@ContextConfiguration(classes = {UsersResource.class, UsersService.class, UsersServiceImpl.class})
//@SpringBootTest
public class UsersResourceTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test_getHelloWorld() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                .get("/users/hello")
                .accept(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string("hello world"));
    }
}
