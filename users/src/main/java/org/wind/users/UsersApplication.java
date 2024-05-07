package org.wind.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wind.commons.constant.CommonConstant;

@SpringBootApplication
public class UsersApplication {

    private static final Logger log = LoggerFactory.getLogger(UsersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
        log.info("test users----{}", CommonConstant.USERS_SERVICE_NAME);
    }

}
