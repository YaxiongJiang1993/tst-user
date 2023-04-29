package com.tst.user.server.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/user/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        log.info("hello name: {}", name);
        return "user".concat(name).concat(port);
    }
}
