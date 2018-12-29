package com.arthur.demo.controller;

import com.arthur.demo.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @RequestMapping("/getUser")
    @Cacheable(value = "user-key")
    public User getUser() {
        return null;
    }
}
