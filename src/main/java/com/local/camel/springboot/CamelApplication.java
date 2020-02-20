package com.local.camel.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * A sample Spring Boot application that starts the Camel routes.
 * Some new comments.
 */
@SpringBootApplication
public class CamelApplication {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(CamelApplication.class, args);
    }

}

