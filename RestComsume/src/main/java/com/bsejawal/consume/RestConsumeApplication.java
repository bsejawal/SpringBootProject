package com.bsejawal.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bsejawal.consume.client"})
public class RestConsumeApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestConsumeApplication.class, args);
    }


}
