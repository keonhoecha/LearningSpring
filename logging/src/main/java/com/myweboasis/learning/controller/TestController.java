package com.myweboasis.learning.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        log.info("this is info");
        log.debug("this is debug");
        return "Hello";
    }
}
