package com.myweboasis.learning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class App 
{
    public static void main(String[] args)
    {
        log.info("will run Spring Boot app...");
        SpringApplication.run(App.class, args);
    }
}
