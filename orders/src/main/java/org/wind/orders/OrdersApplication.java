package org.wind.orders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersApplication {

    private static final Logger log = LoggerFactory.getLogger(OrdersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
        log.debug("test orders");
    }

}
